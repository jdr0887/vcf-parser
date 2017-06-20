package org.renci.vcf;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "vcfResults")
public class VCFResult {

    @XmlElementWrapper(name = "headers")
    @XmlElement(name = "header")
    private List<VCFHeader> header;

    @XmlElementWrapper(name = "lines")
    @XmlElement(name = "line")
    private List<VCFLine> data;

    public VCFResult() {
        super();
    }

    public List<VCFHeader> getHeader() {
        return header;
    }

    public void setHeader(List<VCFHeader> header) {
        this.header = header;
    }

    public List<VCFLine> getData() {
        return data;
    }

    public void setData(List<VCFLine> data) {
        this.data = data;
    }

}
