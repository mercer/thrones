package com.workshop.thrones.contexts.bookie.odd;

import com.workshop.thrones.contexts.bookie.candidate.Candidate;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class OddsRepository {
    public Set<Odd> all() {
        return Set.of(
                Odd.odd(0.3, Candidate.JON_SNOW),
                Odd.odd(0.3, Candidate.DAENERYS_TARGARYEN),
                Odd.odd(0.3, Candidate.SANSA_STARK)
        );
    }
}
