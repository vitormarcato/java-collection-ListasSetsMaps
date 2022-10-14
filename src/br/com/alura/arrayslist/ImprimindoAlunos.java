package br.com.alura.arrayslist;

import java.util.*;

public class ImprimindoAlunos {

	public static void main(String[] args) {

		Set<String> alunos = new HashSet<>();
		alunos.add("Paulo");
		alunos.add("Alberto");
		alunos.add("Pedro");
		alunos.add("Nico");

		for (String nome : alunos) {
			System.out.println(nome);
		}
	}
}