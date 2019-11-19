package com.cliente.crear.entity;

import java.util.Date;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ClienteEntity {
	@Id
	@GeneratedValue
	private Long id;
	
	@NotEmpty(message = "Ingrese un Nombre")
	private String nombre;
	
	@NotEmpty(message = "Ingrese un Apellido")
	private String apellido;
	
	@NotNull(message = "Ingrese Edad")
	private Long edad;
	
	@Temporal(TemporalType.DATE)
	@JsonFormat(pattern="dd/MM/yyyy")
	@NotNull(message = "Ingrese Fecha de Nacimiento")
	private Date fechaNacimiento;
	
	@Temporal(TemporalType.DATE)
	@JsonFormat(pattern="dd/MM/yyyy")
	private Date fechaProbableMuerte;
	
	public ClienteEntity(Long id, String nombre, String apellido, Long edad, Date fechaNacimiento, Date fechaProbableMuerte) {
		this.id = id;
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
		this.fechaNacimiento = fechaNacimiento;
		this.fechaProbableMuerte = fechaProbableMuerte;
	}
	public ClienteEntity(String nombre, String apellido, Long edad, Date fechaNacimiento, Date fechaProbableMuerte) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
		this.fechaNacimiento = fechaNacimiento;
		this.fechaProbableMuerte = fechaProbableMuerte;
	}

}
