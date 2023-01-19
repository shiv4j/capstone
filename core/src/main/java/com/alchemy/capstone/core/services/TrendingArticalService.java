package com.alchemy.capstone.core.services;

import java.util.List;

import org.apache.sling.api.resource.ResourceResolver;

import com.alchemy.capstone.core.models.BannerArticle;

public interface TrendingArticalService {
	public ResourceResolver getResourceResolver();

	public List<BannerArticle> getTrendingArticles();

}
