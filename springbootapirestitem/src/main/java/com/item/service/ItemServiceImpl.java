package com.item.service;


import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.item.modelos.Item;
import com.item.modelos.Producto;

@Service
public class ItemServiceImpl implements ItemService {
	@Autowired
	private RestTemplate clienteRest;

	@Override
	public List<Item> findall() {
		List<Producto> productos = Arrays
				.asList(clienteRest.getForObject("http://localhost:7272/listar", Producto[].class));
		return productos.stream().map(p -> new Item(p, 1)).collect(Collectors.toList());
	}

	@Override
	public Item findById(int id, Integer cantidad) {
		Map<String, String> pathvariables = new HashMap<>();
		pathvariables.put("id", Integer.toString(id));
		Producto producto = clienteRest.getForObject("http://localhost:7272/ver/{id}", Producto.class, pathvariables);
		return new Item(producto, cantidad);
	}

}
