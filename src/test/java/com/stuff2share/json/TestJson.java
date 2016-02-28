package com.stuff2share.json;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Test;

/**
 * Created by jgao on 2/25/16.
 */
public class TestJson {

    @Test
    public void testDeserialization() throws Exception{
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.readValue("{\"name\": \"Joe\"}", Person.class);
    }

}
