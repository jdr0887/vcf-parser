package org.renci.vcf;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GenotypeField", propOrder = {})
@XmlRootElement(name = "genotypeField")
public class GenotypeField {

    @XmlAttribute
    private GenotypeFieldType type;

    @XmlValue
    private String value;

    public GenotypeField() {
        super();
    }

    public GenotypeField(GenotypeFieldType type, String value) {
        super();
        this.type = type;
        this.value = value;
    }

    public GenotypeFieldType getType() {
        return type;
    }

    public void setType(GenotypeFieldType type) {
        this.type = type;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

}
