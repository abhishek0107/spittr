package com.doj.spittr.web.config;

import java.util.Locale;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.i18n.CookieLocaleResolver;
import org.springframework.web.servlet.i18n.LocaleChangeInterceptor;
import org.springframework.web.servlet.view.tiles3.TilesConfigurer;
import org.springframework.web.servlet.view.tiles3.TilesViewResolver;

import com.doj.spittr.utils.SpittrConstant;

@EnableWebMvc
@Configuration
@ComponentScan(basePackages = { "com.doj.spittr" })
public class SpittrMvcConfiguration extends WebMvcConfigurerAdapter{
	
	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
		registry.addResourceHandler("/scripts/**")
				.addResourceLocations("/web-resources/scripts/")
				.setCachePeriod(31556926);
		registry.addResourceHandler("/images/**")
				.addResourceLocations("/web-resources/images/")
				.setCachePeriod(31556926);
		registry.addResourceHandler("/css/**")
				.addResourceLocations("/web-resources/css/")
				.setCachePeriod(31556926);
		registry.addResourceHandler("/fonts/**")
				.addResourceLocations("/web-resources/fonts/")
				.setCachePeriod(31556926);

	}

	@Override
	public void configureDefaultServletHandling(
			DefaultServletHandlerConfigurer configurer) {
		configurer.enable();
	}

	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		LocaleChangeInterceptor localeChangeInterceptor = new LocaleChangeInterceptor();
		localeChangeInterceptor.setParamName("lang");
		registry.addInterceptor(localeChangeInterceptor);
	}
	
	/*@Bean
    public ViewResolver getViewResolver(){
        InternalResourceViewResolver resolver = new InternalResourceViewResolver();
        resolver.setPrefix("/WEB-INF/views/");
        resolver.setSuffix(".jsp");
        return resolver;
    }*/
	
	@Bean
	public TilesViewResolver configureTilesViewResolver() {
		return new TilesViewResolver();
	}
	
	@Bean
	public LocaleResolver localeResolver() {
		CookieLocaleResolver cookieLocaleResolver = new CookieLocaleResolver();
		cookieLocaleResolver.setDefaultLocale(Locale.ENGLISH);
		return cookieLocaleResolver;
	}

	@Bean
	public TilesConfigurer configureTilesConfigurer() {
		TilesConfigurer configurer = new TilesConfigurer();
		configurer.setDefinitions(new String[] { SpittrConstant.TILES });
		return configurer;
	}

}
