package com.betvictor.app.ws.client;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;

import com.betvictor.app.msg.object.RandomTextResponse;
import com.fasterxml.jackson.jaxrs.json.JacksonJaxbJsonProvider;

public class RandomTextClientImpl implements RandomTextClient {

	private String urlRandomText;

	public void setUrlRandomText(String urlRandomText) {
		this.urlRandomText = urlRandomText;
	}

	public String getUrlRandomText() {
		return urlRandomText;
	}

	@Override
	public RandomTextResponse doGet(Integer nParagraphs, Integer minWords, Integer maxWords) {
		Client client = ClientBuilder.newClient();

		client.register(JacksonJaxbJsonProvider.class);

		WebTarget target = client.target(this.urlRandomText).resolveTemplate("nP", nParagraphs)
				.resolveTemplate("minW", minWords).resolveTemplate("maxW", maxWords);
		
		try {
			RandomTextResponse text = target.request(MediaType.APPLICATION_JSON).get(RandomTextResponse.class);
			if(text != null){
				return text;
			}
		} catch (RuntimeException e) {
			System.out.println("Exception occured in ws client, " + e.getMessage());
		}
		return null;
	}

}
