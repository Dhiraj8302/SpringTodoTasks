package com.example.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;


import com.example.demo.model.Tasks;

@Service
public interface TaskService {
	public List<Tasks> getall();
	public Tasks insert(Tasks tsk);
	public void delete(int id);
	public Tasks Update(Tasks tsk);
	
}
