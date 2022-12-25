package com.example.demo.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ParentDto {

    private Long id;
    private String firmId;
    private String categoryId;
    private BigDecimal rate;
    private List<ChildDto> childList;

}
