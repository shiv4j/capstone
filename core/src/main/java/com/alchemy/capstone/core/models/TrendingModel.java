package com.alchemy.capstone.core.models;

import java.util.List;

import javax.annotation.PostConstruct;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.OSGiService;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;

import com.alchemy.capstone.core.services.TrendingArticalService;

@Model(adaptables = Resource.class,defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class TrendingModel 
{
	@OSGiService
	TrendingArticalService trendingArticalService;
	@ValueMapValue
	private String title;
	List<BannerArticle> bannerLsit;
	@PostConstruct
	public void init()
	{
		bannerLsit=trendingArticalService.getTrendingArticles();
	}
	public String getTitle() {
		return title;
	}
	public List<BannerArticle> getBannerLsit() {
		return bannerLsit;
	}
	
}
