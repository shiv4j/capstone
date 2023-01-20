package com.alchemy.capstone.core.models;

import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.json.Json;
import javax.json.JsonObject;
import javax.json.JsonReader;
import org.apache.http.HttpEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;
/**
 *      @author Shiva Kumar
 * 
 *      Sling Model to fetch Video Playlist Component properties
 *
 */
@Model(adaptables = { Resource.class }, defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class VideoPlayListModel {

	@ValueMapValue
	private String[] youTubeLinks;
	private List<YouTubeVideoResponse> videoList;
	/**
	 *     Post Construct method to call Youtube Oembed Service
	 *     and fetch the response
	 *     to display in Video Playlist Component
	 */
	@PostConstruct
	public void init() {
		if (youTubeLinks != null) {
			videoList = new ArrayList<>();
			try (CloseableHttpClient httpClient = HttpClients.createDefault()) {
				for (String youtubeLink : youTubeLinks) {
					HttpGet request = new HttpGet("https://www.youtube.com/oembed?url=" + youtubeLink);
					try (CloseableHttpResponse response = httpClient.execute(request)) {
						HttpEntity entity = response.getEntity();
						if (entity != null) {
							String result = EntityUtils.toString(entity);
							try (JsonReader jsonReader = Json.createReader(new StringReader(result))) {
								JsonObject youtubeResponse = jsonReader.readObject();
								YouTubeVideoResponse youTubeVideoResponseDto = new YouTubeVideoResponse();
								youTubeVideoResponseDto.setHtml(youtubeResponse.getString("html"));
								youTubeVideoResponseDto.setTitle(youtubeResponse.getString("title"));
								youTubeVideoResponseDto.setThumbnailUrl(youtubeResponse.getString("thumbnail_url"));
								videoList.add(youTubeVideoResponseDto);
							}

						}
					}

				}

			} catch (IOException e) {

				e.printStackTrace();
			}

		}
	}

	public List<YouTubeVideoResponse> getVideoList() {
		return videoList;
	}

}
