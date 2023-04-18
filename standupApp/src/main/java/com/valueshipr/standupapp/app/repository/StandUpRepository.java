package com.valueshipr.standupapp.app.repository;

import java.util.List;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.valueshipr.standupapp.app.model.StandUp;

@Repository
public interface StandUpRepository extends JpaRepository<StandUp, Long> {
	  List<StandUp> findByUsername(String username);
}