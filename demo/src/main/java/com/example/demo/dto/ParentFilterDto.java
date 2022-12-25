package com.example.demo.dto;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
public class ParentFilterDto {

    private String firmId;
    private String categoryId;
    private String brandId;
    private BigDecimal rate;

}
