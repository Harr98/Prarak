package com.prarak.Time.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.prarak.Time.model.Project_Master;
import com.prarak.Time.repository.Project_Master_Repository;

@RestController
public class Project_Master_Controller {
	@Autowired
	private Project_Master_Repository project_Master_Repository;

	@GetMapping("/projectmanager")
	public List<Project_Master> getProjectManager() {
		return project_Master_Repository.findAll();
	}

	@PostMapping("/projectmanager")
	public Project_Master postManager(@RequestBody Project_Master pm) {
	return 	project_Master_Repository.save(pm);
	}

	@PutMapping("/projectmanager/{pid}")
	public Project_Master updateProjectManager(@RequestBody Project_Master pm, @PathVariable("pid") long pid) {
		Project_Master p = project_Master_Repository.getOne(pid);
		try {
			p.setProject_Name(pm.getProject_Name());
			p.setStart_Date(pm.getStart_Date());
			p.setCompletion_Date(pm.getCompletion_Date());
			p.setTask_specification(pm.getTask_specification());
			p.setClient_id(pm.getClient_id());
			return project_Master_Repository.save(p);

		} catch (Exception e) {
			return null;
		}

	}

	@DeleteMapping("/projectmanager/{pid}")
	public void deleteProjectManager(@PathVariable("pid") long pid) {
		project_Master_Repository.deleteById(pid);
	}
}
