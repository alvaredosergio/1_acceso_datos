package com.lm2a.caballero;

import org.springframework.context.support.ClassPathXmlApplicationContext;



public class MainCaballeroDI {

	public static void main(String[] args) {
	    ClassPathXmlApplicationContext context = 
	            new ClassPathXmlApplicationContext(
	                "caballero.xml");
	        ICaballero caballero = context.getBean(ICaballero.class);
	        caballero.embarcarseEnAventura();
	        context.close();

	}

}
