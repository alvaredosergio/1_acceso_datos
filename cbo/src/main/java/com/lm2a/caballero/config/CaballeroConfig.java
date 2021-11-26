package com.lm2a.caballero.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.lm2a.caballero.AventuraCazarDragon;
import com.lm2a.caballero.IAventura;
import com.lm2a.caballero.ICaballero;
import com.lm2a.caballero.ValienteCaballero;


@Configuration
@ComponentScan
public class CaballeroConfig {


	  @Bean
	  public ICaballero caballero() {
	    return new ValienteCaballero(aventura());
	  }
	  
	  @Bean
	  public IAventura aventura() {
	    return new AventuraCazarDragon(System.out);
	  }
	
}
