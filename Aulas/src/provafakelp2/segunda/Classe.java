package provafakelp2.segunda;

import java.util.ArrayList;

public class Classe {
	private String nome;
	private ArrayList<Aluno> alunos;
	
	public Classe(String nome) {
		this.nome = nome;
	}
	
	
	public void getAlunos() {
		System.out.println("Alunos na classe " + this.getNome());
		System.out.println("Nome  |  Matricula");
		
		for(Aluno alu : this.alunos) {
			alu.getNomeMatricula();
		}
	}
	public void setAlunos(Aluno al) {
		this.alunos.add(al);
	}
	public String getNome() {
		return nome;
	}
	
	public void boletim() {
		System.out.println("Boletim Classe:");
		System.out.println("Nome  |  Matricula  | Media");
		for(Aluno al : this.alunos) {
			System.out.println(al.getNomeMatricula());
			System.out.println(" | " + al.media());
		}
	}
	
	

}
