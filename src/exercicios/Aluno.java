package exercicios;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Aluno {

	
	public String nome;
	public String nota;
	public int contacto;
	public Aluno(){
		
	}
	
	public Aluno(String nome, String nota, int contacto) {
		super();
		this.nome = nome;
		this.nota = nota;
		this.contacto = contacto;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNota() {
		return nota;
	}

	public void setNota(String nota) {
		this.nota = nota;
	}

	public int getContacto() {
		return contacto;
	}

	public void setContacto(int contacto) {
		this.contacto = contacto;
	}
	
	
	public ArrayList<Aluno> addAluno(ArrayList<Aluno> alunos, Aluno aluno){
		
		alunos.add(aluno);
		
		return alunos;
	}
	
	public void listarAlunos(ArrayList<Aluno> alunos, Aluno aluno){
		for(int i=0; i<alunos.size();i++){
			System.out.println("ALUNO Nº "+ (i+1)+ alunos.get(i).getNome());
			System.out.println("NOTA: "+alunos.get(i).getNota());
			System.out.println("CONTACTO: "+alunos.get(i).getContacto());
		}
	}
	
	
	
	

}
