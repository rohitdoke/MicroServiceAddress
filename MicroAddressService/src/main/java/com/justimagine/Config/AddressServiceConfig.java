package com.justimagine.Config;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AddressServiceConfig {

	
	@Bean
	public ModelMapper getModelMapper()
	{
		return new ModelMapper();
	}
}
