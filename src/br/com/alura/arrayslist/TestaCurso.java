package br.com.alura.arrayslist;

import java.util.List;

public class TestaCurso {

	public static void main(String[] args) {
		Curso cursos = new Curso("Relacionamento com coleções", "Paulo Silveira");
		List<Aula> aulas = cursos.getAulas();
		System.out.println(aulas);
		
		cursos.adiciona(new Aula("Adicionando novas aulas", 30));
		cursos.adiciona(new Aula("Java collections", 17));
		cursos.adiciona(new Aula("Trabalhando com ArrayList", 21));
		
		System.out.println(aulas);
		
	}		
}