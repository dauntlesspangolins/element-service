package com.cormacx.elementservice.repository;

import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.cormacx.elementservice.model.Element;

@Repository
public interface ElementRepository extends JpaRepository<Element, Long>{

}
