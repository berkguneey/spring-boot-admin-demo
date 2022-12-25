package com.example.demo.controller;

import com.example.demo.dto.ParentDto;
import com.example.demo.dto.ParentFilterDto;
import com.example.demo.service.ParentService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v0/demo")
public class ParentController {

    private final ParentService service;

    @PostMapping()
    public ResponseEntity<List<ParentDto>> getByFilter(@RequestBody ParentFilterDto request) {
        log.info("Started getByFilter controller method.");
        return new ResponseEntity<>(service.getByFilter(request), HttpStatus.OK);
    }

}
