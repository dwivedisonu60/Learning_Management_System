package com.LearningManagmentSystem.LMS_API.config;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JSONStringConverter {

 public String toJSONString(Object obj) throws JsonProcessingException {
     ObjectMapper objectMapper = new ObjectMapper();

     String JsonString = objectMapper.writeValueAsString(obj);

    return JsonString;
 }
}
