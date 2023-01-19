package com.alchemy.capstone.core.services.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import javax.jcr.query.Query;

import org.apache.sling.api.resource.LoginException;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.api.resource.ResourceResolver;
import org.apache.sling.api.resource.ResourceResolverFactory;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.alchemy.capstone.core.models.BannerArticle;
import com.alchemy.capstone.core.services.TrendingArticalService;

@Component(service = TrendingArticalService.class, immediate = true)
public class TrendingArticleServiceImpl implements TrendingArticalService {

	private static final Logger Log = LoggerFactory.getLogger(TrendingArticleServiceImpl.class);
	@Reference
	ResourceResolverFactory factory;

	@Override
	public List<BannerArticle> getTrendingArticles() {
		Log.info("inside trending articles 1");
		List<BannerArticle> bannerList = new ArrayList<>();
		try (ResourceResolver resolver = getResourceResolver()) {
			Log.info("inside trending articles 2 {}", resolver);
			String query = "SELECT * FROM [cq:Page] AS s WHERE ISDESCENDANTNODE([/content/capstone/us/en/articles]) order by s.[jcr:content/jcr:created] desc";
			Iterator<Resource> result = resolver.findResources(query, Query.JCR_SQL2);
			while (result.hasNext()) {
				Resource resource = result.next();
				Resource articleResource = resolver
						.getResource(resource.getPath() + "/jcr:content/root/container/baner_article");
				Log.info("article resorce{}", articleResource);
				if (articleResource != null) {
					BannerArticle bannerArtical = articleResource.adaptTo(BannerArticle.class);
					Log.info("banner article {}", bannerArtical);
					if (bannerArtical != null) {
						bannerArtical.setPagePath(resource.getPath());
						if (bannerList.size() < 5) {
							bannerList.add(bannerArtical);

						}
					}

				} else {
					Log.info("banner article is empty");
				}
			}
		}
		return bannerList;
	}

	@Override
	public ResourceResolver getResourceResolver() {
		// TODO Auto-generated method stub
		ResourceResolver resolver = null;
		try {
			Map<String, Object> props = new HashMap<>();
			props.put(ResourceResolverFactory.SUBSERVICE, "ncsubservice");
			resolver = factory.getServiceResourceResolver(props);
		} catch (LoginException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return resolver;
	}

}
