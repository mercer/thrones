package com.workshop.thrones;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Set;

import static com.workshop.thrones.Candidate.builder;

@SpringBootApplication
public class ThronesApplication {

    public static void main(String[] args) {
        SpringApplication.run(ThronesApplication.class, args);
    }

    public Set<Candidate> retrieveAllCandidates() {
        return Set.of(
                builder().name("Jon Snow").build(),
                builder().name("Daenerys Targaryen").build(),
                builder().name("Sansa Stark").build(),
                builder().name("Arya Stark").build(),
                builder().name("Bran Stark").build(),
                builder().name("Cersei Lannister").build(),
                builder().name("Jaime Lannister").build(),
                builder().name("Tyrion Lannister").build(),
                builder().name("Jorah Mormont").build(),
                builder().name("Bronn").build(),
                builder().name("Davos Seaworth").build(),
                builder().name("Melisandre").build(),
                builder().name("Theon Greyjoy").build(),
                builder().name("Yara Greyjoy").build(),
                builder().name("Varys").build(),
                builder().name("Sandor 'The Hound' Clegane").build(),
                builder().name("Gregor 'The Mountain' Clegane").build(),
                builder().name("Gendry").build(),
                builder().name("Tormund Giantsbane").build(),
                builder().name("Brienne of Tarth").build(),
                builder().name("Podrick Payne").build(),
                builder().name("Beric Dondarrion").build(),
                builder().name("Eddison Tollett").build(),
                builder().name("Yohn Royce").build(),
                builder().name("Ellaria Sand").build(),
                builder().name("Samwell Tarly").build(),
                builder().name("Gilly").build(),
                builder().name("Little Sam").build(),
                builder().name("Missandei").build(),
                builder().name("Grey Worm").build(),
                builder().name("Qhono").build(),
                builder().name("Daario Naharis").build(),
                builder().name("Viserion").build(),
                builder().name("Drogon").build(),
                builder().name("Rhaegal").build(),
                builder().name("Ghost").build(),
                builder().name("Nymeria").build(),
                builder().name("Harry Strickland").build(),
                builder().name("Euron Greyjoy").build(),
                builder().name("Qyburn").build(),
                builder().name("Lyanna Mormont").build(),
                builder().name("Robin Arryn").build(),
                builder().name("Edmure Tully").build(),
                builder().name("Ned Umber").build(),
                builder().name("Alys Kastark").build(),
                builder().name("Ebrose").build(),
                builder().name("Maester Wolkan").build(),
                builder().name("Jaqen H'ghar").build(),
                builder().name("Hot Pie").build(),
                builder().name("Meera Reed").build(),
                builder().name("Tycho Nestoris").build(),
                builder().name("The Night King").build()
                );
    }
}
