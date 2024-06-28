package com.item.service;

import java.util.List;

import com.item.modelos.Item;

public interface ItemService {
	public List<Item> findall();

	public Item findById(int id, Integer cantidad);
}
