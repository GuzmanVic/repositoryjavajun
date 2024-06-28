package com.producto.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.producto.modelo.Producto;
import com.producto.repository.ProductoRepository;


@Service
public class ProductoServiceImpl implements IProuctoService {
	@Autowired
	private ProductoRepository repository;

	@Override
	@Transactional(readOnly=true)
	public List<Producto> findAll() {
		return (List<Producto>) repository.findAll();
	}

	@Override
	@Transactional(readOnly=true)
	public Producto findById(int id) {
		return repository.findById(id).orElse(null);
	}

}
