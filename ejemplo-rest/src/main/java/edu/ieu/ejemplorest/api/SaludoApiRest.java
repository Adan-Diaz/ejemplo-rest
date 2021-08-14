package edu.ieu.ejemplorest.api;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/saludo")
public class SaludoApiRest {
	
	private AtomicLong contador = new AtomicLong(0);
	
	@GetMapping
	public Saludo hola() {
		long conteo = contador.incrementAndGet();
		return new Saludo("K019", "Hola mundo REST, "
				+ "cantidad de visitas " + conteo);
	}
	
	@GetMapping("/{nombre}")
	public Saludo saludar(@PathVariable("nombre") String nombre ) {
		long conteo = contador.incrementAndGet();
		return new Saludo(nombre, "Hola " + nombre +  ", "
				+ "cantidad de visitas " + conteo);
	}
}
