package com.alchemy.capstone.core.models;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.api.resource.ResourceResolver;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.SlingObject;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;

@Model(adaptables = { Resource.class,
		SlingHttpServletRequest.class }, defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class HomeBannerModel {

	@ValueMapValue
	private String[] articleLinks;
	@SlingObject
	ResourceResolver resolver;
	List<BannerArticle> bannerList;

	@PostConstruct
	public void init() {

		if (articleLinks != null) {
			bannerList = new ArrayList<>();
			for (String articleLink : articleLinks) {
				Resource articleResource = resolver
						.getResource(articleLink + "/jcr:content/root/container/baner_article");
				if (articleResource != null) {
					BannerArticle bannerArtical = articleResource.adaptTo(BannerArticle.class);
					bannerArtical.setPagePath(articleLink);
					if (bannerList.size() < 5) {
						bannerList.add(bannerArtical);

					}
				}
			}
		}
	}

	public List<BannerArticle> getBannerList() {
		return bannerList;
	}

}
