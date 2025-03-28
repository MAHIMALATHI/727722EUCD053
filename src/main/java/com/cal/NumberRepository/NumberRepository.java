package com.cal.NumberRepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cal.NumberEntity.NumberEntity;

@Repository
public interface NumberRepository extends JpaRepository<NumberEntity, Long> {
}

