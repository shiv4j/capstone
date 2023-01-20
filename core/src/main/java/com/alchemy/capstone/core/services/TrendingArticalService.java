package com.alchemy.capstone.core.services;

import java.util.List;

import org.apache.sling.api.resource.ResourceResolver;

import com.alchemy.capstone.core.models.BannerArticle;
/**
 *      @author Shiva Kumar
 * 
 *      Service interface for TrendingArticlesModel Sling Model
 *
 */
public interface TrendingArticalService {
	/**
	 *     To get the resolver for Trending Articles Service
	 */
	public ResourceResolver getResourceResolver();
	/**
	 *     To get the list of Articles to display
	 *     in Trending Articles Component
	 */
	public List<BannerArticle> getTrendingArticles();

}
