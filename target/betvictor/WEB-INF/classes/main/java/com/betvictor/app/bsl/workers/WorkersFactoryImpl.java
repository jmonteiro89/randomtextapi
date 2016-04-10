package com.betvictor.app.bsl.workers;

import com.betvictor.app.msg.object.TaskRequest;
import com.betvictor.app.msg.object.TaskResults;
import com.betvictor.app.ws.client.RandomTextClient;

public class WorkersFactoryImpl implements WorkersFactory {

	@Override
	public Worker getInstance(TaskResults shared, RandomTextClient client, TaskRequest text) {
		return new Worker(shared, client, text);
	}

}
