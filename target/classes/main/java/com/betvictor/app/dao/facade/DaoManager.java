package com.betvictor.app.dao.facade;

import java.util.List;

import com.betvictor.app.msg.object.TaskHistoryDTO;
import com.betvictor.app.msg.object.TaskResponse;

public interface DaoManager {

	void addTaskHistory(TaskResponse object);
	
	List<TaskHistoryDTO> getHistory();
}
