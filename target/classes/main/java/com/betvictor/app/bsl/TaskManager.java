package com.betvictor.app.bsl;

import java.util.List;

import com.betvictor.app.msg.object.TaskHistoryDTO;
import com.betvictor.app.msg.object.TaskRequest;
import com.betvictor.app.msg.object.TaskResponse;

public interface TaskManager {

	/**
	 * <strong>Produce computation using Random Text API and returns information about:</strong>
	 *  - The most frequent word
	 *  - Average paragraph size
	 *  - Average paragraph processing time
	 *  - Total processing time
	 * @param request
	 * @return
	 */
	public TaskResponse doTask(TaskRequest request);
	
	/**
	 * <strong>Returns the list of the last 10 computations results</strong>
	 * @return
	 */
	public List<TaskHistoryDTO> getTaskHistory();
}
