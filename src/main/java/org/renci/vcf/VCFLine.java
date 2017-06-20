package org.renci.vcf;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "line")
public class VCFLine {

    private String chromosome;

    private Integer position;

    private String identifier;

    private String referenceBase;

    private String alternateAllele;

    private Float quality;

    private String filter;

    @XmlElementWrapper(name = "infoFields")
    @XmlElement(name = "field")
    private List<InfoField> info;

    @XmlElementWrapper(name = "formatFields")
    @XmlElement(name = "field")
    private List<GenotypeField> format;

    public VCFLine() {
        super();
    }

    public String getChromosome() {
        return chromosome;
    }

    public void setChromosome(String chromosome) {
        this.chromosome = chromosome;
    }

    public Integer getPosition() {
        return position;
    }

    public void setPosition(Integer position) {
        this.position = position;
    }

    public String getIdentifier() {
        return identifier;
    }

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    public String getReferenceBase() {
        return referenceBase;
    }

    public void setReferenceBase(String referenceBase) {
        this.referenceBase = referenceBase;
    }

    public String getAlternateAllele() {
        return alternateAllele;
    }

    public void setAlternateAllele(String alternateAllele) {
        this.alternateAllele = alternateAllele;
    }

    public Float getQuality() {
        return quality;
    }

    public void setQuality(Float quality) {
        this.quality = quality;
    }

    public String getFilter() {
        return filter;
    }

    public void setFilter(String filter) {
        this.filter = filter;
    }

    public List<InfoField> getInfo() {
        return info;
    }

    public void setInfo(List<InfoField> info) {
        this.info = info;
    }

    public List<GenotypeField> getFormat() {
        return format;
    }

    public void setFormat(List<GenotypeField> format) {
        this.format = format;
    }

    @Override
    public String toString() {
        return "VCFLine [chromosome=" + chromosome + ", position=" + position + ", identifier=" + identifier
                + ", referenceBase=" + referenceBase + ", alternateAllele=" + alternateAllele + ", quality=" + quality
                + ", filter=" + filter + "]";
    }

}
