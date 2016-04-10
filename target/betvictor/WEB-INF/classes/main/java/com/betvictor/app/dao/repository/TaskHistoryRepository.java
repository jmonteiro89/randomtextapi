package com.betvictor.app.dao.repository;


import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import com.betvictor.app.dao.TaskHistory;

public interface TaskHistoryRepository extends JpaRepository<TaskHistory, Integer>{
	
	public Page<TaskHistory> findAllByOrderByIdTaskHistoryDesc(Pageable p);

}
