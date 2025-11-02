package com.tarun.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tarun.entities.PlanEntity;

public interface PlanRepo extends JpaRepository<PlanEntity, Integer> {
}