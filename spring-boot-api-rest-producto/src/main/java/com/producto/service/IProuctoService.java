package com.producto.service;

import java.util.List;

import com.producto.modelo.Producto;

public interface IProuctoService {
	public List<Producto>findAll();
	public Producto findById(int id);
}
