package com.workshop.thrones;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Set;

@SpringBootApplication
public class ThronesApplication {

    private CandidateRepository candidateRepository;

    public ThronesApplication(CandidateRepository candidateRepository) {
        this.candidateRepository = candidateRepository;
    }

    public static void main(String[] args) {
        SpringApplication.run(ThronesApplication.class, args);
    }

    public Set<Candidate> retrieveAllCandidates() {
        return candidateRepository.all();
    }
}
