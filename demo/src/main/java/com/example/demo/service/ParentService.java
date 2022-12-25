package com.example.demo.service;

import com.example.demo.dto.ParentDto;
import com.example.demo.dto.ParentFilterDto;

import java.util.List;

public interface ParentService {

    List<ParentDto> getByFilter(ParentFilterDto request);

}
