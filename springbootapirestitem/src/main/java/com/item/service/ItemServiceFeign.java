package com.item.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import com.item.clientes.ProductoClienteRest;
import com.item.modelos.Item;

@Service("itemServiceFeign")
@Primary
public class ItemServiceFeign implements ItemService {
	@Autowired
	private ProductoClienteRest clienteFeign;

	@Override
	public List<Item> findall() {
		return clienteFeign.listarProductos().stream().map(p -> new Item(p, 1)).collect(Collectors.toList());
	}

	@Override
	public Item findById(int id, Integer cantidad) {
		return new Item(clienteFeign.detalleProducto(id), cantidad);
	}

}
