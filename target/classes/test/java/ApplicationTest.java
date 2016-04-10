
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import com.betvictor.app.bsl.workers.Worker;
import com.betvictor.app.msg.object.RandomTextResponse;
import com.betvictor.app.msg.object.TaskRequest;

import com.betvictor.app.msg.object.TaskResults;
import com.betvictor.app.ws.client.RandomTextClient;
import com.betvictor.app.ws.client.RandomTextClientImpl;

public class ApplicationTest {

	private RandomTextClient randomText = mock(RandomTextClientImpl.class);
	private RandomTextResponse clientResponse = new RandomTextResponse();

	
	
	@Before
	public void setup() {
		clientResponse.setText_out("<p>Test worker method.</p>\r<p>This is the second paragraph worker.</p>\r");
		when(randomText.doGet(2,1,25)).thenReturn(clientResponse);
	}
	@Test
	public void WorkerTest(){

		TaskResults result = new TaskResults();
		TaskRequest request = new TaskRequest(2, 2, 1, 25);
		Worker worker = new Worker(result, randomText, request);
		worker.run();
		
		assertEquals(result.getTotalParagraphs(), Integer.valueOf(2));
		assertEquals(result.getTotalWords(), Integer.valueOf(9));
		assertEquals(result.getWordsStats().entrySet().stream().max((entry1, entry2) -> entry1.getValue() > entry2.getValue() ? 1 : -1).get().getKey(), "worker");
		
	}

}
