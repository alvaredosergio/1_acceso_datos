package com.lm2a.caballero;

import java.io.PrintStream;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class Juglar {

	private PrintStream stream;

	public Juglar(PrintStream stream) {
		this.stream = stream;
	}

	@Pointcut("execution(* *.embarcarseEnAventura(..))")
	public void embarcar() {
	}

	@Before("embarcar()")
	public void cantarAntesAventuras() {
		stream.println("Quien lo niegue miente, el caballero es muy valiente!");
	}

	@After("embarcar()")
	public void cantarDespuesAventuras() {
		stream.println("Todo garbo y donosura, el valiente caballero " + "se embarco en una aventura!");
	}

}