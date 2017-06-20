package org.renci.vcf;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.apache.commons.io.IOUtils;

public class VCFParser {

	private static VCFParser instance;

	public static VCFParser getInstance() {
		if (instance == null) {
			instance = new VCFParser();
		}
		return instance;
	}

	private VCFParser() {
		super();
	}

	public VCFResult parse(File vcfFile) {
		VCFResult result = new VCFResult();
		List<VCFLine> data = new ArrayList<VCFLine>();
		try {
			VCFLine vcfLine = null;
			// may need to use buffered reader
			for (String line : IOUtils.readLines(new FileInputStream(vcfFile))) {

				if (line.startsWith("#")) {
					continue;
				}

				vcfLine = new VCFLine();
				String[] lineSplit = line.split("\t");

				vcfLine.setChromosome(lineSplit[0]);
				vcfLine.setPosition(Integer.valueOf(lineSplit[1]));
				vcfLine.setIdentifier(lineSplit[2]);
				vcfLine.setReferenceBase(lineSplit[3]);
				vcfLine.setAlternateAllele(lineSplit[4]);
				vcfLine.setQuality(Float.valueOf(lineSplit[5]));
				vcfLine.setFilter(lineSplit[6]);
				List<String> infoList = Arrays.asList(lineSplit[7].split(";"));
				List<InfoField> infoFieldList = new ArrayList<InfoField>();

				for (InfoFieldType type : InfoFieldType.values()) {
					for (String info : infoList) {
						if (info.indexOf("=") != -1) {
							String key = info.split("=")[0];
							if (type.getCode().equals(key)) {
								String value = info.split("=")[1];
								infoFieldList.add(new InfoField(type, value));
							}
						}
					}
				}
				vcfLine.setInfo(infoFieldList);

				List<String> formatKeyList = Arrays.asList(lineSplit[8]
						.split(":"));
				List<String> formatValueList = Arrays.asList(lineSplit[9]
						.split(":"));

				List<GenotypeField> genotypeFieldList = new ArrayList<GenotypeField>();

				for (GenotypeFieldType type : GenotypeFieldType.values()) {
					if (formatKeyList.contains(type.getCode())) {
						int index = 0;
						for (int i = 0; i < formatKeyList.size(); ++i) {
							if (formatKeyList.get(i).equals(type.getCode())) {
								index = i;
							}
						}
						String value = formatValueList.get(index);
						genotypeFieldList.add(new GenotypeField(type, value));
					}
				}

				vcfLine.setFormat(genotypeFieldList);
				data.add(vcfLine);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		result.setData(data);
		return result;
	}
}
