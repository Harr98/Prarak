package com.prarak.Time.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.prarak.Time.model.Client_Master;

public interface Client_Master_Repository extends JpaRepository<Client_Master, Long>{
 List<Client_Master>findByProjectMasterId(long project_ID);
}
