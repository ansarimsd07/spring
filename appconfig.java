package com.offline.mobilesale;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class appconfig
{
	@Bean
public samsungPro getPhone()
{
	return new samsungPro("grey", "125gb", 25000);


}
	@Bean
	public mobileproccessor getproccess()
	{
		return new Snapdragon();
	}

 
}