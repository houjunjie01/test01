package cn.hjj.springboot;

import org.springframework.boot.Banner.Mode;
import org.springframework.boot.builder.SpringApplicationBuilder;

public class SpringBootServletInitializer 
             extends org.springframework.boot.web.support.SpringBootServletInitializer {
	  @Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		// TODO Auto-generated method stub
		System.out.println("=====SpringBootServletInitializer======");
		builder.sources(Application.class);
		builder.bannerMode(Mode.OFF);
		return builder;
	}
}
