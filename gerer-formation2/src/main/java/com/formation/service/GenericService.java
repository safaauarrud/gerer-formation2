package com.formation.service;

import java.util.List;

public interface GenericService<K, T> {
	T create(T t);

	T update(T t);

	void delete(T t);

	T getById(K k);

	List<T> getAll();
}
