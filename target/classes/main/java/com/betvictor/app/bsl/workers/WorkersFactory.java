package com.betvictor.app.bsl.workers;

import com.betvictor.app.msg.object.TaskRequest;
import com.betvictor.app.msg.object.TaskResults;
import com.betvictor.app.ws.client.RandomTextClient;

public interface WorkersFactory {

	Worker getInstance(TaskResults shared, RandomTextClient client, TaskRequest text);
}
