package com.intercorp.retail.model;

import java.util.Date;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonFormat;

public class CreateClientRequest {

	@NotNull
	@NotEmpty
	private String nombre;
	private String apellido;
	@NotNull
	@NotEmpty
	private Integer edad;
	@JsonFormat(pattern="dd-MM-yyyy")
	@NotNull
	@NotEmpty
	private Date fechaNacimiento;
	
	public CreateClientRequest() {
		super();
	}
	
	
	public CreateClientRequest(String nombre, String apellido, Integer edad, Date fechaNacimiento) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
		this.fechaNacimiento = fechaNacimiento;
	}


	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	
	public Integer getEdad() {
		return edad;
	}


	public void setEdad(Integer edad) {
		this.edad = edad;
	}


	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}
	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	@Override
	public String toString() {
		return "CreateClientRequest [nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad
				+ ", fechaNacimiento=" + fechaNacimiento + "]";
	}
	
}
