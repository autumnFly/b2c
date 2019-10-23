package com.csair.b2c.cloud.test.batch.processor;

import com.csair.b2c.cloud.test.batch.model.Person;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.item.ItemProcessor;

/**
 * Created on 2019/4/24.
 *
 * @author yudong
 */
public class PersonItemProcessor implements ItemProcessor<Person, Person> {

    private static final Logger log = LoggerFactory.getLogger(PersonItemProcessor.class);

    @Override
    public Person process(final Person person) throws Exception {
        final String firstName = person.getFirstName().toUpperCase();
        final String lastName = person.getLastName().toUpperCase();
        final Person transformedPerson = new Person(firstName, lastName);
        log.info("Converting (" + person + ") into (" + transformedPerson + ")");
        return transformedPerson;
    }

}
