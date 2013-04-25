package com.jayway.gradledemo;

import java.io.IOException;
import java.io.InputStream;
import java.util.Map;
import java.util.Properties;

public class PropertiesDemo {

    public static void main(String[] args) throws IOException {
        Properties props = new Properties();
        try (InputStream is = PropertiesDemo.class.getClassLoader().getResourceAsStream("random.properties");) {
            props.load(is);
        }
        for (Map.Entry<Object, Object> entry : props.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}
