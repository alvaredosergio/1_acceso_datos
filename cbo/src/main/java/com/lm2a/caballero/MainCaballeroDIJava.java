package com.lm2a.caballero;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

import com.lm2a.caballero.config.CaballeroConfig;


@Component
public class MainCaballeroDIJava {

	
	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext
			      (CaballeroConfig.class);
			 
		ICaballero caballero = context.getBean(ICaballero.class);
		caballero.embarcarseEnAventura();

	    context.close();

	}
	

	
	

}
