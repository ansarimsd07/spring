package com.offline.mobilesale;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
@Configuration
public class appconfig2 
{
	  @Bean
	   public oneplus7 getphone()
	   {
		   return new oneplus7("BLACK","80GB",76000);
	   } 

}
