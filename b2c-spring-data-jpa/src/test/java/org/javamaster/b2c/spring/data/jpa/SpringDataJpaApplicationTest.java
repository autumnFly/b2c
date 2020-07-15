package org.javamaster.b2c.spring.data.jpa;

import org.javamaster.b2c.spring.data.jpa.repository.ActorRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;

@SpringBootTest
class SpringDataJpaApplicationTest {
    @Autowired
    private ActorRepository actorRepository;

    @Test
    void contextLoads() {
        System.out.println(actorRepository.findById(1));
        System.out.println(actorRepository.findActorByLastName("GUINESS"));
        System.out.println(actorRepository.findByFirstNameEndsWith("BE%"));
        System.out.println(actorRepository.findByActorId(1));
        actorRepository
                .findByFirstNameLike("%BE%", PageRequest.of(1, 3, Sort.Direction.DESC, "first_name"))
                .get()
                .forEach(System.out::println);
        System.out.println(actorRepository.findByLastName("GUINESS"));
        System.out.println(actorRepository.setFixedFirstnameFor("nick", "WAHLBERG"));
    }

}
