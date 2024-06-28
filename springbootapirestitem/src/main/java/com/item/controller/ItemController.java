package com.item.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.item.modelos.Item;
import com.item.service.ItemService;

@RestController
public class ItemController {
	@Autowired
	@Qualifier("itemServiceFeign")
	private ItemService service;

	@GetMapping("/listar")
	public List<Item> listarProductos() {
		return service.findall();
	}

	@GetMapping("/ver/{id}/cantidad/{cantidad}")
	public Item detalleItemProducto(@PathVariable int id, @PathVariable Integer cantidad) {
		return service.findById(id, cantidad);
	}
}
