package com.alchemy.capstone.core.models;

import java.util.List;

import javax.annotation.PostConstruct;

import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.OSGiService;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.alchemy.capstone.core.services.TrendingArticalService;
/**
 *      @author Shiva Kumar
 * 
 *      Sling Model to fetch Trending Articles Component properties
 *
 */
@Model(adaptables = { Resource.class,
		SlingHttpServletRequest.class }, defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class TrendingModel {
	private static final Logger Log = LoggerFactory.getLogger(TrendingModel.class);
	List<BannerArticle> bannerList;
	@ValueMapValue
	private String title;

	@OSGiService
	TrendingArticalService trendingArticalService;
	/**
	 *     Post construct method to get the list of trending articles
	 *     from TrendingArticleService
	 */
	@PostConstruct
	public void init() {
		Log.info("inside init 1");
		bannerList = trendingArticalService.getTrendingArticles();
		Log.info("inside init {}", bannerList.size());
	}

	public List<BannerArticle> getBannerList() {
		return bannerList;
	}

	public String getTitle() {
		return title;
	}
}
