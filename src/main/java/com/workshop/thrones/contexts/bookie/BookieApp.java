package com.workshop.thrones.contexts.bookie;

import com.workshop.thrones.contexts.bookie.candidate.Candidate;
import com.workshop.thrones.contexts.bookie.candidate.CandidateRepository;
import com.workshop.thrones.contexts.bookie.odd.Odd;
import com.workshop.thrones.contexts.bookie.odd.OddsRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class BookieApp {

    private CandidateRepository candidateRepository;
    private OddsRepository oddsRepository;

    public BookieApp(CandidateRepository candidateRepository, OddsRepository oddsRepository) {
        this.candidateRepository = candidateRepository;
        this.oddsRepository = oddsRepository;
    }

    public static void main(String[] args) {
        SpringApplication.run(BookieApp.class, args);
    }

    public Set<Candidate> retrieveAllCandidates() {
        return candidateRepository.all();
    }

    public Set<Odd> retrieveAllOdds() {
        return oddsRepository.all();
    }
}
