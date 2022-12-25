package com.example.demo.service.impl;

import com.example.demo.dto.ParentDto;
import com.example.demo.dto.ParentFilterDto;
import com.example.demo.entity.Parent;
import com.example.demo.mapper.ParentMapper;
import com.example.demo.repository.ParentRepository;
import com.example.demo.service.ParentService;
import com.example.demo.specification.ParentSpecification;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
@RequiredArgsConstructor
public class ParentServiceImpl implements ParentService {

    private final ParentRepository repository;
    private final ParentMapper mapper;

    @Override
    public List<ParentDto> getByFilter(ParentFilterDto request) {
        log.debug("Started getByFilter service method.");
        ParentSpecification spec = new ParentSpecification(request);
        List<Parent> responseList = repository.findAll(spec);
        return mapper.toParentDtoList(responseList);
    }

}
