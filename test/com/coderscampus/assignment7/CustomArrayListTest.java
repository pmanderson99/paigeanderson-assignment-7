package com.coderscampus.assignment7;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CustomArrayListTest {

	void should_add_item() {
		CustomList<Integer> sut = new CustomArrayList<>();
		sut.add(12);
		assertEquals(12, sut.get(0));
		assertEquals(1, sut.getSize());
	}
	
	@Test
	void should_add_item_at_specified_index() {
		CustomList<Integer> sut = new CustomArrayList<>();
		for(int i = 0; i<= 111; i++) {
			sut.add(i);
		}
		sut.add(0, 27);
		
		Integer expectedElement = sut.get(0);
		Integer expectedSize = sut.getSize();
		
		assertEquals(27, expectedElement);
		assertEquals(113, expectedSize);
	}
	
	@Test
	void should_return_size() {
		CustomList<Integer> sut = new CustomArrayList<>();
		for(int i =0; i<= 111; i++) {
			sut.add(i);
		}
		assertEquals(112, sut.getSize());
	}
	
	@Test
	void should_get_element_from_index() {
		CustomList<Integer> sut = new CustomArrayList<>();
		for(int i = 0; i<=111; i++) {
			sut.add(i);
		}
		assertEquals(8, sut.get(8));
	}
	
	@Test
	void should_remove_item() {
		CustomList<Integer> sut = new CustomArrayList<>();
		for(int i = 0; i<=111; i++) {
			sut.add(i);
		}
		sut.remove(77);
		
		Integer expectedElement = sut.get(77);
		
		assertEquals(78, expectedElement);
	}



}
