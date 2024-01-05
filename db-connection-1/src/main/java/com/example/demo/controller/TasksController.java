package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Tasks;
import com.example.demo.repository.TaskRepository;
import com.example.demo.service.TaskService;

@RestController
@CrossOrigin("*")
public class TasksController {
@Autowired 
TaskService tser;


@GetMapping("getAll")
public List<Tasks> getall(){
	return tser.getall();
}

@PostMapping("insert")
public Tasks insert(@RequestBody Tasks tsk) {
	Tasks t=tser.insert(tsk);
	return t;
}

@DeleteMapping("delete/{id}")
public void delete(@PathVariable int id) {
	tser.delete(id);
}

@PutMapping("update")
public Tasks update(@RequestBody Tasks tsk) {
	return tser.Update(tsk);
}


}
