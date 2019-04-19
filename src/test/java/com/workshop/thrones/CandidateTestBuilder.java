package com.workshop.thrones;

public class CandidateTestBuilder {
    private Candidate.CandidateBuilder builder;

    public static CandidateTestBuilder aCandidate() {
        CandidateTestBuilder output = new CandidateTestBuilder();
        output.builder = Candidate.builder();
        return output;
    }

    public Candidate build() {
        return this.builder.build();
    }

    public CandidateTestBuilder name(String name) {
        this.builder.name(name);
        return this;
    }
}
