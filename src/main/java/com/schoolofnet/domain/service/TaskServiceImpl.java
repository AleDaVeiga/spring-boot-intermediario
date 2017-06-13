package com.schoolofnet.domain.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.schoolofnet.domain.entity.Task;
import com.schoolofnet.domain.repository.TaskRepository;

@Service
public class TaskServiceImpl implements TaskService {
	@Autowired
	private TaskRepository taskRepository;

	public TaskServiceImpl(TaskRepository taskRepository) {
		this.taskRepository = taskRepository;
	}

	@Transactional
	public Task create(String name) {
		Task task = new Task(name);
		return taskRepository.save(task);
	}

	@Transactional
	public Task update(Task task) {
		return taskRepository.save(task);
	}

	@Transactional
	public void remove(Task task) {
		taskRepository.delete(task);
	}

	@Transactional
	public Task findOne(Integer id) {
		return taskRepository.findOne(id);
	}

	@Transactional
	public Iterable<Task> findAll() {
		return taskRepository.findAll();
	}
}