package com.obsidian.createUrl;

import java.util.Map;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Main implements RequestHandler<Map<String,Object>, Map<String,String>> {

    private final ObjectMapper objectMapper = new ObjectMapper();

    @Override
    public Map<String, String> handleRequest(Map<String, Object> input, Context context) {
       String body = input.get("body").toString();

       Map<String,String> bodyMap;

       try {
           bodyMap = new ObjectMapper.readValue(body, Map.class);

       } catch (Exception e) {
           throw new RuntimeException("Error parsing request body" + e.getMessage(), e);
       }

       String originalUrl = bodyMap.get("originalUrl");

        return null;
    }
}