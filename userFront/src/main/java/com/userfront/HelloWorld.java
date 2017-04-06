package com.userfront;

public class HelloWorld {

	private String mensaje;

	public String getMensaje() {
		return mensaje;
	}

	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}
	
	public void getMessage(){
		System.out.println("Your message: " + mensaje);
	}
	
}
