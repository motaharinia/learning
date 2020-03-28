package com.motaharinia.designpattern.j2ee.presentation.compositeview;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.UrlBasedViewResolver;
import org.springframework.web.servlet.view.tiles3.TilesConfigurer;
import org.springframework.web.servlet.view.tiles3.TilesView;

@Configuration
public class TilesConfiguration {

    @Bean
    public InternalResourceViewResolver getJspViewResolver() {
        InternalResourceViewResolver resolver = new InternalResourceViewResolver();
        resolver.setPrefix("/WEB-INF/jsp/");
        resolver.setSuffix(".jsp");
        resolver.setOrder(1);
        return resolver;
    }


    @Bean
    public UrlBasedViewResolver tilesViewResolver() {
        UrlBasedViewResolver tilesViewResolver = new UrlBasedViewResolver();
        tilesViewResolver.setSuffix(".jsp");
        tilesViewResolver.setPrefix("/WEB-INF/compositeview/jsp/");
        tilesViewResolver.setViewClass(TilesView.class);
        tilesViewResolver.setViewNames(new String[] {"cv_*"} );
        tilesViewResolver.setOrder(0);
        return tilesViewResolver;
    }

    @Bean
    public TilesConfigurer tilesConfigurer() {
        TilesConfigurer tilesConfigurer = new TilesConfigurer();
        String[] defs = { "/WEB-INF/compositeview/tiles.xml" };
        tilesConfigurer.setDefinitions(defs);
        return tilesConfigurer;
    }
}
