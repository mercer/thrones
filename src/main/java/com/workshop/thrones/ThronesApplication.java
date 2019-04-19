package com.workshop.thrones;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Set;

@SpringBootApplication
public class ThronesApplication {

    private CandidateRepository candidateRepository;
    private OddsRepository oddsRepository;

    public ThronesApplication(CandidateRepository candidateRepository, OddsRepository oddsRepository) {
        this.candidateRepository = candidateRepository;
        this.oddsRepository = oddsRepository;
    }

    public static void main(String[] args) {
        SpringApplication.run(ThronesApplication.class, args);
    }

    public Set<Candidate> retrieveAllCandidates() {
        return candidateRepository.all();
    }

    public Set<Odd> retrieveAllOdds() {
        return oddsRepository.all();
    }
}
