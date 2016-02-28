package com.stuff2share.json;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Created by jgao on 2/25/16.
 */
public class Person {
    private final String name;

        public Person(/**@JsonProperty("name")**/String name) {
            this.name = name;
        }

    public String getName() {
        return name;
    }
}
