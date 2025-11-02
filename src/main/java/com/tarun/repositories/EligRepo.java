package com.tarun.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tarun.entities.EligEntity;

public interface EligRepo extends JpaRepository<EligEntity, Integer> {
}