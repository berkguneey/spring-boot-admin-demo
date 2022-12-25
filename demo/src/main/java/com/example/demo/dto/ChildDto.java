package com.example.demo.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ChildDto {

    private Long id;
    private String brandId;
    private BigDecimal rate;
    //private Long categoryCommissionId;

}
