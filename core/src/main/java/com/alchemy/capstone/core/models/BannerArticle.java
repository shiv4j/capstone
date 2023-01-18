 package com.alchemy.capstone.core.models;


import java.text.SimpleDateFormat;
import java.util.Date;

import javax.annotation.PostConstruct;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;

@Model(adaptables = Resource.class,defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class BannerArticle 
{
	@ValueMapValue
	private String bannerImage;
	@ValueMapValue
	private String bannerText;
	@ValueMapValue(name="jcr:created")
	private Date jcrcreated;
	private String mainArticleDateStr;
	private String createdDateStr;
	private String pagePath;
	@PostConstruct
	public void init()
	{
		SimpleDateFormat formatter=new SimpleDateFormat("MMMM D,YYYY");
		mainArticleDateStr=formatter.format(jcrcreated);
		createdDateStr=formatter.format(jcrcreated);
	}
	public String getPagePath() {
		return pagePath;
	}
	public void setPagePath(String pagePath) {
		this.pagePath = pagePath;
	}
	public String getCreatedDateStr() {
		return createdDateStr;
	}
	public String getBannerImage() {
		return bannerImage;
	}
	public String getBannerText() {
		return bannerText;
	}
	public Date getJcrcreated() {
		return jcrcreated;
	}
	public String getMainArticleDateStr() {
		return mainArticleDateStr;
	}
	
 
}
