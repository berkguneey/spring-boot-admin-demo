package com.example.demo.mapper;

import com.example.demo.dto.ChildDto;
import com.example.demo.dto.ParentDto;
import com.example.demo.entity.Child;
import com.example.demo.entity.Parent;
import org.mapstruct.Mapper;
import org.mapstruct.NullValueCheckStrategy;

import java.util.List;

@Mapper(componentModel = "spring", nullValueCheckStrategy = NullValueCheckStrategy.ALWAYS)
public interface ParentMapper {

    ParentDto toParentDto(Parent parent);

    List<ParentDto> toParentDtoList(List<Parent> parentList);

    //@Mapping(source = "categoryBrandCommission.categoryCommission.id", target = "categoryCommissionId")
    ChildDto toChildDto(Child child);

    List<ChildDto> toChildDtoList(List<Child> childList);

}
