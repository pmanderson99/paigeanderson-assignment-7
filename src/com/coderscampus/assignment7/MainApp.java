package com.coderscampus.assignment7;

public class MainApp {

	public static void main(String[] args) {
		CustomList<Integer> customNumList = new CustomArrayList<>();
		for (int i = 1; i <= 111; i++) {
			customNumList.add(i);
		}

		for (int i = 0; i < customNumList.getSize(); i++) {
			System.out.println(customNumList.get(i));
		}
		
	}	

}

