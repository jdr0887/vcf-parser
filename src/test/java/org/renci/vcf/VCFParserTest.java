package org.renci.vcf;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URL;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.PropertyException;

import org.junit.Test;

public class VCFParserTest {

	@Test
	public void testSerialization() {
		VCFParser parser = VCFParser.getInstance();
		URL testVCF = this.getClass().getClassLoader().getResource("test.vcf");
		VCFResult result = parser.parse(new File(testVCF.getPath()));
        try {
            JAXBContext context = JAXBContext.newInstance(VCFResult.class);
            Marshaller m = context.createMarshaller();
            m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
            File resultsFile = new File("/tmp", "results.xml");
            FileWriter fw = new FileWriter(resultsFile);
            m.marshal(result, fw);
        } catch (PropertyException e) {
            e.printStackTrace();
        } catch (JAXBException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

	}
}
