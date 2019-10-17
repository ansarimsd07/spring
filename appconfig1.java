package com.offline.mobilesale;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
@Configuration
public class appconfig1 
{
	   @Bean
	   public Redmi7plus getphone1()
	   {
		   return new Redmi7plus("SILVER","40GB",10000);
	   }
}
