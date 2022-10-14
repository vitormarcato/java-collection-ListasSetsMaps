package br.com.alura.arrayslist;

import java.util.*;

public class ImprimindoAlunosSemAcentos {

	public static void main(String[] args) {

        Set<String> alunos = new HashSet<>();

        //1) adicione alguns alunos
        alunos.add("Natalia");
        alunos.add("Roberto");
        alunos.add("Paulo");
		alunos.add("Alberto");
		alunos.add("Pedro");
		alunos.add("Nico");
        
		//2) imprima o tamanho da colecao
     
		System.out.println(alunos.size());
		
        //3) tente adicionar um aluno que existe
		alunos.add("Natalia");
			
        //4) imprima novamente o tamanho da colecao
		System.out.println(alunos.size());

	}
}