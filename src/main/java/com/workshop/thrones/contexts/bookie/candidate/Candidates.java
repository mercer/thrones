package com.workshop.thrones.contexts.bookie.candidate;

import com.workshop.thrones.ddd.DomainRepository;

import java.util.Set;

@DomainRepository
public class Candidates {
    public Set<Candidate> all() {
        return Set.of(Candidate.values());
    }
}
