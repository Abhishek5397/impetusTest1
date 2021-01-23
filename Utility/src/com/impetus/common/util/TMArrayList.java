package com.impetus.common.util;
public class TMArrayList<T> implements TMList<T> {
	private Object[] collection;
	private int size;

	public class TMArrayListIterator<T> implements TMIterator<T> {
		private int index;

		public TMArrayListIterator() {
			this.index = 0;
		}

		public boolean hasNext() {
			return this.index != size;
		}

		public T next() {
			if (index == size)
				throw new InvalidIteratorException("Iterator has no more elements");
			T data = (T) collection[index];
			index++;
			return data;
		}
	}

	public TMArrayList() {
		this.collection = new Object[10];
		this.size = 0;
	}

	private void adjustArray() {
		Object[] tmpCollection = new Object[this.size + 10];
		for (int i = 0; i < this.size; ++i)
			tmpCollection[i] = this.collection[i];
		this.collection = tmpCollection;
	}

	public void add(T data) {
		if (this.collection.length == this.size)
			adjustArray();
		this.collection[this.size] = data;
		this.size++;
	}

	public void add(int index, T data) {
		if (index < 0 || index > this.size)
			throw new IndexOutOfBoundsException("Invalid index");
		if (this.collection.length == this.size)
			adjustArray();
		for (int i = this.size; i > index; --i)
			this.collection[i] = this.collection[i - 1];
		this.collection[index] = data;
		this.size++;
	}

	public void insert(int index, T data) {
		this.add(index, data);
	}

	public void clear() {
		this.size = 0;
	}

	public void removeAll() {
		this.clear();
	}

	public T get(int index) {
		if (index < 0 || index >= this.size)
			throw new IndexOutOfBoundsException("Invalid index");
		return (T) this.collection[index];
	}

	public int size() {
		return this.size;
	}

	public T removeAt(int index) {
		T data;
		int ep;
		if (index < 0 || index >= this.size)
			throw new IndexOutOfBoundsException("Invalid index");
		data = (T) this.collection[index];
		ep = this.size - 2;
		for (int i = index; i <= ep; ++i)
			this.collection[i] = this.collection[i + 1];
		this.size--;
		return data;
	}

	public void update(int index, T data) {
		if (index < 0 || index >= this.size)
			throw new IndexOutOfBoundsException("Invalid index");
		this.collection[index] = data;
	}

	public void copyTo(TMList<T> other) {
		other.clear();
		int size = this.size();
		for (int i = 0; i < size; ++i)
			other.add(this.get(i));
	}

	public void copyFrom(TMList<T> other) {
		this.clear();
		int size = other.size();
		for (int i = 0; i < size; ++i)
			this.add(other.get(i));
	}

	public void appendTo(TMList<T> other) {
		int size = this.size();
		for (int i = 0; i < size; ++i)
			other.add(this.get(i));
	}

	public void appendFrom(TMList<T> other) {
		int size = other.size();
		for (int i = 0; i < size; ++i)
			this.add(other.get(i));
	}

	public TMIterator<T> iterator() {
		return new TMArrayListIterator<T>();
	}
}