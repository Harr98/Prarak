package com.prarak.Time.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.prarak.Time.repository.Client_Master_Repository;
import com.prarak.Time.repository.Project_Master_Repository;

@RestController
public class Client_Master_Controller {
	@Autowired
	private Client_Master_Repository client_Master_Repository;
	@Autowired
	private Project_Master_Repository project_Master_Repository;

	@GetMapping("/clientmaster/{project_ID}")
	public void getClientMaster(@PathVariable("project_ID") long project_ID) {
		
	}
}
