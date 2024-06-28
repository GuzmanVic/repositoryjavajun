package com.producto.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.producto.modelo.Producto;
import com.producto.service.IProuctoService;

@RestController
public class ProductoController {
	@Autowired
	private IProuctoService service;

	// Endpoints
	@GetMapping("/listar")
	public List<Producto> listar() {
		return service.findAll();
	}

	@GetMapping("/ver/{id}")
	public Producto detalleProducto(@PathVariable int id) {
		return service.findById(id);
	}

}
