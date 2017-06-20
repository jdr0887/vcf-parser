package org.renci.vcf;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InfoField", propOrder = {})
@XmlRootElement(name = "infoField")
public class InfoField {

    @XmlAttribute
    private InfoFieldType type;

    @XmlValue
    private String value;

    public InfoField() {
        super();
    }

    public InfoField(InfoFieldType field, String value) {
        super();
        this.type = field;
        this.value = value;
    }

    public InfoFieldType getType() {
        return type;
    }

    public void setType(InfoFieldType type) {
        this.type = type;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

}
