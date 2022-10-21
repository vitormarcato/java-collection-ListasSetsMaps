package br.com.alura.arrayslist;

//import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Exercicio {

	public static void main(String[] args) {
//
//		Pessoa p1 = new Pessoa(21, "Leonardo Cordeiro");
//		Pessoa p2 = new Pessoa(27, "Fabio Pimentel");
//		Pessoa p3 = new Pessoa(19, "Silvio Mattos");
//		Pessoa p4 = new Pessoa(23, "Romulo Henrique");
//
//		ArrayList<Pessoa> listaPessoas = new ArrayList<>();
//
//		listaPessoas.add(p1);
//		listaPessoas.add(p2);
//		listaPessoas.add(p3);
//		listaPessoas.add(p4);
		
		Map<Integer, String> pessoas = new HashMap<>();

        pessoas.put(21, "Leonardo Cordeiro");
        pessoas.put(27, "Fabio Pimentel");
        pessoas.put(19, "Silvio Mattos");
        pessoas.put(23, "Romulo Henrique");
        
        pessoas.keySet().forEach(idade -> {
        	System.out.println(pessoas.get(idade));
        });
		
	}
}
