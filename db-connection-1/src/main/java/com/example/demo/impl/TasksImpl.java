package com.example.demo.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Tasks;
import com.example.demo.repository.TaskRepository;
import com.example.demo.service.TaskService;

@Service
public class TasksImpl implements TaskService {
	@Autowired
	TaskRepository taskrepo;
	@Override
	public Tasks insert(Tasks tsk) {
		return taskrepo.save(tsk);
		
	}
	@Override
	public void delete(int id) {
		taskrepo.deleteById(id);
		
	}
	@Override
	public Tasks Update(Tasks tsk) {
		return taskrepo.save(tsk);
		
	}
	@Override
	public List<Tasks> getall() {
		
		return taskrepo.findAll();
	}
	

}
