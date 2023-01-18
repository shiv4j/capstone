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
import org.slf4j.*;
@Model(adaptables = Resource.class,defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class VideoPlayListModel 
{
	 private static final Logger Log=LoggerFactory.getLogger(VideoPlayListModel.class);
	@ValueMapValue
	private String[] youTubeLinks;
	private List<YouTubeVideoResponse> videoList;
	@PostConstruct
	public void init()
	{
		
		Log.info("inside video");
		if(youTubeLinks!=null)
		{	
			videoList=new ArrayList<>();
			try(CloseableHttpClient httpClient=HttpClients.createDefault())
			{
				for(String youtubeLink:youTubeLinks)
				{
					Log.info("youtubeLink="+youtubeLink);
					HttpGet request=new HttpGet("https://www.youtube.com/oembed?url="+youtubeLink);
						try(CloseableHttpResponse response=httpClient.execute(request))
						{
							HttpEntity entity=response.getEntity();
							if(entity!=null)
							{
								Log.info("enitity="+entity);
								String result=EntityUtils.toString(entity);
								try(JsonReader jsonReader=Json.createReader(new StringReader(result)))
								{
										JsonObject youtubeResponse=jsonReader.readObject();
										YouTubeVideoResponse youTubeVideoResponseDto=new YouTubeVideoResponse();
										youTubeVideoResponseDto.setHtml(youtubeResponse.getString("html"));
										youTubeVideoResponseDto.setTitle(youtubeResponse.getString("title"));
										youTubeVideoResponseDto.setThumbnailUrl(youtubeResponse.getString("thumbnail_url"));
										videoList.add(youTubeVideoResponseDto);
										Log.info("videolsit="+videoList);
										
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
