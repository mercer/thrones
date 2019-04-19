package com.workshop.thrones;

import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class CandidateRepository {
    public Set<Candidate> all() {
        return Set.of(Candidate.values());
    }
}
