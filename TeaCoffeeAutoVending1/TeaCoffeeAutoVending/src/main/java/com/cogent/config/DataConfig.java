package com.cogent.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurer;
import org.springframework.web.servlet.config.annotation.CorsRegistry;

import com.cogent.dto.Container;
import com.cogent.dto.Drink;
import com.cogent.dto.Refill;
import com.cogent.dto.SaleList;

@Configuration
public class DataConfig implements RepositoryRestConfigurer{
	@Override
	public void configureRepositoryRestConfiguration(RepositoryRestConfiguration config, CorsRegistry cors) {
		Class[] domainTypes = {Drink.class, SaleList.class, Refill.class, Container.class};
		config.exposeIdsFor(domainTypes);
	}

}
