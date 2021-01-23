package com.impetus.common.util;

public interface TMList<T> {
	void add(T data);
	void add(int index,T data);
	void insert(int index,T data);
	void clear();
	void removeAll();
	T get(int index);
	int size();
	T removeAt(int index);
	void update(int index,T data);
	void copyTo(TMList<T> other);
	void copyFrom(TMList<T> other);
	void appendTo(TMList<T> other);
	void appendFrom(TMList<T> other);
	TMIterator<T> iterator();
}
