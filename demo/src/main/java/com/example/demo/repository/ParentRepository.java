package com.example.demo.repository;

import com.example.demo.entity.Parent;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ParentRepository extends JpaRepository<Parent, Long> {

    @EntityGraph(value = "graph.Child.childList")
    List<Parent> findAll(Specification<Parent> spec);

}
