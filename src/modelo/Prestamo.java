package modelo;

import java.time.LocalDate;

public class Prestamo {
	Socio socio;
	Material material;
	LocalDate localDate;
	
	public Prestamo(Socio socio, Material material) {
		this(socio,material,LocalDate.now());	
	}

	public Prestamo(Socio socio, Material material, LocalDate localDate) {
		super();
		this.localDate = localDate;
	}
}
