package com.semurr.dao;

public interface GenericDAO<T> {
	
	void add(T t);
	void delete(T obj);
	T find(long data);
	void update(T t);
}
