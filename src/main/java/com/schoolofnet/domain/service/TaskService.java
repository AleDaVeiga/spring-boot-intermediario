package com.schoolofnet.domain.service;

import com.schoolofnet.domain.entity.Task;

public interface TaskService {
	Task create(String name);

	Task update(Task task);

	void remove(Task task);

	Task findOne(Integer id);

	Iterable<Task> findAll();
}