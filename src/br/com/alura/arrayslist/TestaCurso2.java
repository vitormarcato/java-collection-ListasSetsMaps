package br.com.alura.arrayslist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestaCurso2 {

	public static void main(String[] args) {
		Curso cursos = new Curso("Relacionamento com coleções", "Paulo Silveira");
		
		cursos.adiciona(new Aula("Trabalhando com ArrayList", 21));
		cursos.adiciona(new Aula("Adicionando novas aulas", 30));
		cursos.adiciona(new Aula("Java collections", 17));
		
		
		List<Aula> aulasImutaveis = cursos.getAulas();
		
		List<Aula> aulas = new ArrayList<>(aulasImutaveis);
		
		Collections.sort(aulas);
		
		int tempoDeCurso = cursos.getTempoTotal();
		
		System.out.println(aulas);
		System.out.println(tempoDeCurso + " minutos");
		System.out.println(cursos);
	}		
}