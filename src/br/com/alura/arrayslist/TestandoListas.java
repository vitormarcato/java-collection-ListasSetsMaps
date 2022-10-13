package br.com.alura.arrayslist;

import java.util.ArrayList;

public class TestandoListas {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("Java Orientado a Objetos");
		list.add("TDD com Junit");
		list.add("Spring Framework");
		
		
		System.out.println("O primeiro curso é o: " + list.get(0));
		
	}

}
