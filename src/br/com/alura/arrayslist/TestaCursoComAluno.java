package br.com.alura.arrayslist;

public class TestaCursoComAluno {

	public static void main(String[] args) {
		Curso java = new Curso("Dominando as coleções do Java", "Paulo Daniel");

		java.adiciona(new Aula("Aula1", 22));
		java.adiciona(new Aula("Criando uma Aula", 20));
		java.adiciona(new Aula("Trabalhando com ArrayList", 21));
		java.adiciona(new Aula("Modelando com coleções", 24));

		Aluno a1 = new Aluno("Rodrigo Turini", 34672);
		Aluno a2 = new Aluno("Guilherme Silveira", 5617);
		Aluno a3 = new Aluno("Mauricio Aniche", 17645);

		java.matricula(a1);
		java.matricula(a2);
		java.matricula(a3);

		System.out.println("Todos os alunos matriculados: ");
		java.getAlunos().forEach(aluno -> {
			System.out.println(aluno);
		});

	}

}
