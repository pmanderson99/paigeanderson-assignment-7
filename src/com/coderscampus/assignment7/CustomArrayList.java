package com.coderscampus.assignment7;

import java.util.Arrays;

public class CustomArrayList<T> implements CustomList<T> {
	Object[] items = new Object[10];
	int size = 0;

	@Override
	public boolean add(T item) {
		if(size == items.length) {
			items = Arrays.copyOf(items, items.length * 2);
		}
		items[size++] = item;
		return true;
	}
	
	@Override
	public boolean add(int index, T item) throws IndexOutOfBoundsException {
		if(index >= size || index < 0)
			throw new IndexOutOfBoundsException("Index out of bounds");
		if(size == items.length){
			items = Arrays.copyOf(items, items.length * 2);
		}
		for (int i = getSize() -1; i>= index && i < items.length; i--) {
			items[i +1] = items[i];
		}
		items[index] = item;
		size++;
		return true;
	}
	
	@Override
	public int getSize() {
		return size;
		
	}

	@SuppressWarnings("unchecked")
	@Override
	public T get(int index) throws IndexOutOfBoundsException {
		if(index >= size || index < 0) 
			throw new IndexOutOfBoundsException("Index out of bounds");
		return(T) items[index];
	}

	

	@SuppressWarnings("unchecked")
	@Override
	public T remove(int index) throws IndexOutOfBoundsException {
		if(index >= size || index < 0)
			throw new IndexOutOfBoundsException("Index out of bounds");
		
		T removedItem = (T) items[index];
		
		for(int i = index; i < items.length -1; i++) {
			items[i] = items[i+1];
		}
		items[items.length - 1] = null;
		size--;
		
		return removedItem;
	}
	
}
