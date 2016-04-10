package com.betvictor.app.ws.client;

import com.betvictor.app.msg.object.RandomTextResponse;

public interface RandomTextClient {

	/**
	 * 
	 * @param nParagraphs - Number of paragraphs
	 * @param minWords - Minimum number of words per sentence
	 * @param maxWords - Maximum number of words per sentence
	 * @return RandomTextReponse
	 */
	public RandomTextResponse doGet(Integer nParagraphs, Integer minWords, Integer maxWords);
}
