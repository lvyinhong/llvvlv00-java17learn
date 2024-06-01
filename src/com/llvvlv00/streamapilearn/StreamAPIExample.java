package com.llvvlv00.streamapilearn;

import java.util.ArrayList;
import java.util.List;

public class StreamAPIExample {

    public void testBaseCollectionOper() {
        List<Person> people = List.of(
                new Person("Neo", 45, "USA"),
                new Person("Morpheus", 16, "China"),
                new Person("Trinity", 20, "Malaixiya"),
                new Person("Cypher", 30, "xijiapo")
        );

        List<Person> adults = new ArrayList<>();
        for (Person person : people) {
            if (person.getAge() > 18) {
                adults.add(person);
            }
        }

        System.out.println("adults = " + adults);
    }

    public static void main(String[] args) {
        StreamAPIExample streamAPIExample = new StreamAPIExample();
        streamAPIExample.testBaseCollectionOper();
    }
}
