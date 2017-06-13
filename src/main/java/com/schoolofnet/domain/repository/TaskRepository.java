package com.schoolofnet.domain.repository;

import org.springframework.data.repository.CrudRepository;

import com.schoolofnet.domain.entity.Task;

public interface TaskRepository extends CrudRepository<Task, Integer> {
}
