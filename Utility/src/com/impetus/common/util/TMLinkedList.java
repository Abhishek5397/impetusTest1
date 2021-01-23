package com.impetus.common.util;
public class TMLinkedList<T> implements TMList<T> {
	private TMNode start, end;
	private int size;

	public class TMLinkedListIterator<T> implements TMIterator<T> {
		private TMNode node;

		public TMLinkedListIterator(TMNode node) {
			this.node = node;
		}

		public boolean hasNext() {
			return this.node != null;
		}

		public T next() {
			if (this.node == null)
				throw new InvalidIteratorException("Iterator has no more elements");
			T data;
			data = (T) this.node.data;
			this.node = this.node.next;
			return data;
		}
	}

	class TMNode {
		public T data;
		public TMNode next;

		public TMNode() {
			this.data = null;
			this.next = null;
		}
	}

	public TMLinkedList() {
		this.start = null;
		this.end = null;
		this.size = 0;
	}

	public void add(T data) {
		TMNode node;
		node = new TMNode();
		node.data = data;
		node.next = null;
		if (this.start == null) {
			this.start = node;
			this.end = node;
			this.size++;
			return;
		}
		this.end.next = node;
		this.end = node;
		this.size++;
	}

	public void add(int index, T data) {
		if (index < 0 || index > this.size)
			throw new IndexOutOfBoundsException("Invalid index");
		if (index == size) {
			this.add(data);
			return;
		}
		TMNode t, j = null, node;
		int x;
		node = new TMNode();
		node.data = data;
		node.next = null;
		if (index == 0) {
			node.next = this.start;
			this.start = node;
			this.size++;
			return;
		}
		x = 0;
		t = this.start;
		while (x < index) {
			x++;
			j = t;
			t = t.next;
		}
		node.next = t;
		j.next = node;
		this.size++;
	}

	public void insert(int index, T data) {
		add(index, data);
	}

	public void clear() {
		this.size = 0;
		this.start = null;
		this.end = null;
	}

	public void removeAll() {
		this.clear();
	}

	public T get(int index) {
		if (index < 0 || index >= size)
			throw new IndexOutOfBoundsException("Invalid index");
		TMNode t;
		t = this.start;
		int x = 0;
		while (x < index) {
			t = t.next;
			x++;
		}
		return t.data;
	}

	public int size() {
		return this.size;
	}

	public T removeAt(int index) {
		if (index < 0 || index >= size)
			throw new IndexOutOfBoundsException("Invalid index");
		T data;
		if (this.start == this.end) {
			data = this.start.data;
			this.start = null;
			this.end = null;
			this.size = 0;
			return data;
		}
		if (index == 0) {
			data = this.start.data;
			this.start = this.start.next;
			this.size--;
			return data;
		}
		TMNode j, k;
		j = this.start;
		k = null;
		int x = 0;
		while (x < index) {
			x++;
			k = j;
			j = j.next;
		}
		data = j.data;
		k.next = j.next;
		if (end == j)
			end = k;
		this.size--;
		return data;
	}

	public void update(int index, T data) {
		if (index < 0 || index >= size)
			throw new IndexOutOfBoundsException("Invalid index");
		int x = 0;
		TMNode t;
		t = this.start;
		while (x < index) {
			t = t.next;
			x++;
		}
		t.data = data;
	}

	public void copyTo(TMList<T> other) {
		other.clear();
		int size = this.size;
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
		int size = this.size;
		for (int i = 0; i < size; ++i)
			other.add(this.get(i));
	}

	public void appendFrom(TMList<T> other) {
		int size = other.size();
		for (int i = 0; i < size; ++i)
			this.add(other.get(i));
	}

	public TMIterator<T> iterator() {
		return new TMLinkedListIterator<T>(this.start);
	}
}
