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

import com.alchemy.capstone.core.models.BannerArticle;
import com.alchemy.capstone.core.services.TrendingArticalService;
@Component(service=TrendingArticalService.class,immediate = true)
public class TrendingArticleServiceImpl implements TrendingArticalService{

	@Reference
	ResourceResolverFactory factory;
	@Override
	public List<BannerArticle> getTrendingArticles()
	{
		List<BannerArticle> bannerList=new ArrayList<>();
		try(ResourceResolver resolver=getResourceResolver())
		{
			String query="SELECT * FROM [cq:Page] AS s WHERE ISDESCENDANTNODE([/content/capstone/us/en/articles]) order by s.[jcr:content/jcr:created] desc";
			Iterator<Resource> result=resolver.findResources(query, Query.JCR_SQL2);
			while(result.hasNext())
			{
			Resource resource =  result.next();
			Resource articleResource=resolver.getResource(resource.getPath()+"/jcr:content/root/container/baner_article");
			if(articleResource!=null)
			{
				BannerArticle bannerArtical= articleResource.adaptTo(BannerArticle.class);
				if(bannerArtical!=null)
				{
					bannerArtical.setPagePath(resource.getPath());
					if(bannerList.size()<5)
					{
						bannerList.add(bannerArtical);
						
					}
				}
				
			}				
			}
		}
		return bannerList;
	}
	@Override
	public ResourceResolver getResourceResolver()
	{
		// TODO Auto-generated method stub
		ResourceResolver resolver=null;
		try {
			Map<String, Object> props=new HashMap<>();
			props.put(ResourceResolverFactory.SUBSERVICE,"ncsubservice");
			resolver=factory.getServiceResourceResolver(props);
		} catch (LoginException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return resolver;
	}
	

}
