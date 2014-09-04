package com.semurr.dao;

public interface BaseDAO<T> {
	
	void add(T t);
	void delete(T obj);
	T find(long data);
	void update(T t);
}
