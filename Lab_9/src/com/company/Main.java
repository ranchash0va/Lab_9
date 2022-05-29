package com.company;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {

            JSONGetter jsonGetter = new JSONGetter();
            ObjectMapper mapper = new ObjectMapper();
            JSONGetter.url = "https://api.openbrewerydb.org/breweries/madtree-brewing-cincinnati";
            jsonGetter.run();
        System.out.println(mapper.readValue(jsonGetter.jsonIn,ID.class));


    }
}
