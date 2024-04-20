package com.example.rw.kafkacl.response;

import org.springframework.http.ResponseEntity;

import java.util.List;

public interface KafkaRequestProcessor {
    ResponseEntity<?> process(List<Object> arguments);
}
