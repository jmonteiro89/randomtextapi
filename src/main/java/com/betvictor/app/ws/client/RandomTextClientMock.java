package com.betvictor.app.ws.client;

import com.betvictor.app.msg.object.RandomTextResponse;

public class RandomTextClientMock implements RandomTextClient {

	@Override
	public RandomTextResponse doGet(Integer nParagraphs, Integer minWords, Integer maxWords) {
		RandomTextResponse out = new RandomTextResponse();
		out.setType("gibberish");
		out.setAmount(2);
		out.setNumber(10);
		out.setNumber_max(20);
		out.setFormat("p");
		out.setTime("14:42:12");
		out.setText_out("<p>Crab one hypocritically markedly spoiled other timorously human overheard far immense dear met epidemic falcon when immaculate hesitantly outside fled."
				+"</p>\r<p>Placed near swore folded red-handed oh this promiscuous when and wow ouch so crud that circa slapped directed.</p>\r");
		
		return out;
	}

}
