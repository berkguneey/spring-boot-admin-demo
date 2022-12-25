package com.example.demo.entity;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.FieldNameConstants;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@FieldNameConstants
@Table(uniqueConstraints = @UniqueConstraint(name = "UniqueFirmIdAndCategoryId", columnNames = {"firmId", "categoryId"}))
@NamedEntityGraph(name = "graph.Child.childList", attributeNodes = @NamedAttributeNode("childList"))
public class Parent {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(nullable = false)
    private String firmId;

    @Column(nullable = false)
    private String categoryId;

    @Column(nullable = false)
    private BigDecimal rate;

    @JsonManagedReference
    @OneToMany(mappedBy = "parent", cascade = CascadeType.ALL)
    private List<Child> childList = new ArrayList<>();

}
