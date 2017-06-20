package org.renci.vcf;

public enum GenotypeFieldType {

    GENOTYPE("GT", "genotype"),

    READ_DEPTH("DP", "read depth at this position"),

    GENOTYPE_FILTER("FT", "sample genotype filter"),

    GENOTYPE_LIKELIHOODS("GL", "genotype likelihoods"),

    GENOTYPE_LIKELIHOODS_HETERO_PLOIDY("GLE", "genotype likelihoods of heterogeneous ploidy"),

    PHRED_SCALED_GENOTYPE_LIKELIHOODS("PL", "the phred-scaled genotype likelihoods"),

    PHRED_SCALED_GENOTYPE_POSTERIOR_PROPABILITIES("GP", "the phred-scaled genotype posterior probabilities"),

    GENOTYPE_QUALITY("GQ", "genotype quality"),

    HAPLOTYPE_QUALITIES("HQ", "haplotype qualities"),

    PHASE_SET("PS", "phase set"),

    PHASING_QUALITY("PQ", "phasing quality"),

    ALTERNATE_ALLELE("EC", "alternate allele"),

    MAPPING_QUALITY("MQ", "mapping quality");

    private String code;

    private String description;

    private GenotypeFieldType(String code, String description) {
        this.code = code;
        this.description = description;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

}
