package org.renci.vcf;

public enum InfoFieldType {

    ANCESTRAL_ALLELE("AA", "ancestral allele"),

    ALLELE_COUNT("AC", "allele count in genotypes"),

    ALLELE_FREQUENCY("AF", "allele frequency"),

    TOTAL_ALLELES("AN", " total number of alleles in called genotypes"),

    BASE_QUALITY("BQ", "RMS base quality at this position"),

    CIGAR("CIGAR", "cigar string describing how to align an alternate allele to the reference allele"),

    DB_SNP("DB", "dbSNP membership"),

    READ_DEPTH("DP", "combined depth across samples"),

    END_POSITION("END", "end position of the variant described in this record"),

    HAPMAP2("H2", "membership in hapmap2"),

    HAPMAP3("H3", "membership in hapmap3"),

    MAPPING_QUALITY("MQ", "RMS mapping quality"),

    MAPQ_COUNT("MQ0", "Number of MAPQ == 0 reads covering this record"),

    SAMPLE_COUNT("NS", "Number of samples with data"),

    STRAND_BIAS("SB", "strand bias at this position"),

    SOMATIC_MUTATION("SOMATIC", "indicates that the record is a somatic mutation"),

    VALIDATED("VALIDATED", "validated by follow-up experiment"),

    THOUSAND_GENOMES("1000G", "membership in 1000 Genomes"),

    TOTAL_READ_DEPTH_PER_BP("PB",
            "Total read depth per bp at the locus; bases in reads overlapping / bases in haplotype"),

    OBSERVED_REF_COUNT("RO", "Count of full observations of the reference haplotype."),

    OBSERVED_ALT_COUNT("AO", "Count of full observations of this alternate haplotype."),

    REF_ALLELE_OBS_COUNT("PRO", "Reference allele observation count, with partial observations recorded fractionally"),

    ALT_ALLELE_OBSERVATION_COUNT("PAO",
            "Alternate allele observations, with partial observations recorded fractionally"),

    REF_ALLELE_QUALITY_SUM("QR", "Reference allele quality sum in phred"),

    ALT_QUALITY_SUM("QA", "Alternate allele quality sum in phred"),

    REF_ALLELE_QUALITY("PQR", "Reference allele quality sum in phred for partial observations"),

    ALTERNATE_ALLELE_QUALITY("PQA", "Alternate allele quality sum in phred for partial observations"),

    FORWARD_STRAND_REF_OBSERVATIONS("SRF", "Number of reference observations on the forward strand"),

    REVERSE_STRAND_REF_OBSERVATIONS("SRR", "Number of reference observations on the reverse strand"),

    FORWARD_STRAND_ALT_OBSERVATIONS("SAF", "Number of alternate observations on the forward strand"),

    REVERSE_STRAND_ALT_OBSERVATIONS("SAR", "Number of alternate observations on the reverse strand"),

    REF_STRAND_PROBABILITY("SRP",
            "Strand balance probability for the reference allele: Phred-scaled upper-bounds estimate of the probability of observing the deviation between SRF and SRR given E(SRF/SRR) ~ 0.5, derived using Hoeffding's inequality"),

    ALT_STRAND_PROBABILITY("SAP",
            "Strand balance probability for the alternate allele: Phred-scaled upper-bounds estimate of the probability of observing the deviation between SAF and SAR given E(SAF/SAR) ~ 0.5, derived using Hoeffding's inequality"),

    ALLELE_BALANCE("AB",
            "Allele balance at heterozygous sites: a number between 0 and 1 representing the ratio of reads showing the reference allele to all reads, considering only reads from individuals called as heterozygous"),

    ALLELE_BALANCE_PROBABILITY("ABP",
            "Allele balance probability at heterozygous sites: Phred-scaled upper-bounds estimate of the probability of observing the deviation between ABR and ABA given E(ABR/ABA) ~ 0.5, derived using Hoeffding's inequality"),

    RUN_LENGTH("RUN", "Run length: the number of consecutive repeats of the alternate allele in the reference genome"),

    READ_PLACEMENT_PROBABILITY("RPP",
            "Read Placement Probability: Phred-scaled upper-bounds estimate of the probability of observing the deviation between RPL and RPR given E(RPL/RPR) ~ 0.5, derived using Hoeffding's inequality"),

    READ_PLACEMENT_PROBABILITY_REF_OBS("RPPR",
            "Read Placement Probability for reference observations: Phred-scaled upper-bounds estimate of the probability of observing the deviation between RPL and RPR given E(RPL/RPR) ~ 0.5, derived using Hoeffding's inequality"),

    READS_PLACED_LEFT("RPL",
            "Reads Placed Left: number of reads supporting the alternate balanced to the left (5') of the alternate allele"),

    READS_PLACED_RIGHT("RPR",
            "Reads Placed Right: number of reads supporting the alternate balanced to the right (3') of the alternate allele"),

    END_PLACEMENT_PROBABILITY("EPP",
            "End Placement Probability: Phred-scaled upper-bounds estimate of the probability of observing the deviation between EL and ER given E(EL/ER) ~ 0.5, derived using Hoeffding's inequality"),

    END_PLACEMENT_PROBABILITY_REF("EPPR",
            "End Placement Probability for reference observations: Phred-scaled upper-bounds estimate of the probability of observing the deviation between EL and ER given E(EL/ER) ~ 0.5, derived using Hoeffding's inequality"),

    ALT_ALLELE_DEPTH_RATIO("DPRA",
            "Alternate allele depth ratio.  Ratio between depth in samples with each called alternate allele and those without."),

    LOG_ODDS_RATION("ODDS", "The log odds ratio of the best genotype combination to the second-best."),

    GENOTYPE_ITERATIONS_COUNT("GTI", "Number of genotyping iterations required to reach convergence or bailout."),

    TYPE("TYPE", "The type of allele, either snp, mnp, ins, del, or complex."),

    NUM_ALT("NUMALT", "Number of unique non-reference alleles in called genotypes at this position."),

    MEAN_ALT("MEANALT",
            "Mean number of unique non-reference allele observations per sample with the corresponding alternate alleles."),

    ALLELE_LENGTH("LEN", "allele length"),

    MAPPING_QUALITY_MEAN_ALT("MQM", "Mean mapping quality of observed alternate alleles"),

    MAPPING_QUALITY_MEAN_REF("MQMR", "Mean mapping quality of observed reference alleles"),

    PROPORTION_PAIRED_ALT("PAIRED",
            "Proportion of observed alternate alleles which are supported by properly paired read fragments"),

    PROPORTION_PAIRED_REF("PAIREDR",
            "Proportion of observed reference alleles which are supported by properly paired read fragments"),

    MIN_DEPTH("MIN_DP", "Minimum depth in gVCF output block."),

    END("END", "Last position (inclusive) in gVCF output record.");

    private String code;

    private String description;

    private InfoFieldType(String code, String description) {
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
