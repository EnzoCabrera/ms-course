package com.enzocabrera.hrworker.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.enzocabrera.hrworker.entities.Worker;

public interface WorkerRepository extends JpaRepository<Worker, Long> {

}