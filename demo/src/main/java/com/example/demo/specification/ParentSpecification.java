package com.example.demo.specification;

import com.example.demo.dto.ParentFilterDto;
import com.example.demo.entity.Child;
import com.example.demo.entity.Parent;
import org.springframework.data.jpa.domain.Specification;

import javax.persistence.criteria.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class ParentSpecification implements Specification<Parent> {

    private final ParentFilterDto request;

    public ParentSpecification(ParentFilterDto request) {
        this.request = request;
    }

    @Override
    public Predicate toPredicate(Root<Parent> root, CriteriaQuery<?> query, CriteriaBuilder cb) {
        List<Predicate> predicates = new ArrayList<>();
        if (!Objects.isNull(request.getFirmId())) {
            predicates.add(cb.equal(root.get(Parent.Fields.firmId), request.getFirmId()));
        }
        if (!Objects.isNull(request.getCategoryId())) {
            predicates.add(cb.equal(root.get(Parent.Fields.categoryId), request.getCategoryId()));
        }
        if (!Objects.isNull(request.getBrandId()) || !Objects.isNull(request.getRate())) {
            Join<Parent, Child> childJoin = root.join(Parent.Fields.childList, JoinType.LEFT);
            if (!Objects.isNull(request.getBrandId())) {
                predicates.add(cb.equal(childJoin.get(Child.Fields.brandId), request.getBrandId()));
            }
            if (!Objects.isNull(request.getRate())) {
                Predicate rootRate = cb.equal(root.get(Parent.Fields.rate), request.getRate());
                Predicate joinRate = cb.equal(childJoin.get(Child.Fields.rate), request.getRate());
                predicates.add(cb.or(rootRate, joinRate));
            }
            query.distinct(true);
        }
        return cb.and(predicates.toArray(new Predicate[0]));
    }

}
