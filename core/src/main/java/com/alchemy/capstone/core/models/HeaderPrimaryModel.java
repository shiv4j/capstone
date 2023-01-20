package com.alchemy.capstone.core.models;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.annotation.PostConstruct;

import org.apache.poi.ss.util.DateFormatConverter;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;
/**
 *      @author Shiva Kumar
 * 
 *      Sling Model to fetch Header Primary Component properties
 *
 */
@Model(adaptables = Resource.class)
public class HeaderPrimaryModel {
	@ValueMapValue
	private String trendingText;
	@ValueMapValue
	private String trendingDesc;
	public String todayDate;
	 /**
     *      To get the date in specified date format
     */
	@PostConstruct
	public void init() {
		Date today = new Date();
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEEE,D MMMMM YYYY");
		todayDate = simpleDateFormat.format(new Date());
	}

	public String getTrendingText() {
		return trendingText;
	}

	public String getTrendingDesc() {
		return trendingDesc;
	}

	public String getTodayDate() {
		return todayDate;
	}

}
