package view;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

import exercicios.Aluno;
import exercicios.Exerc1;

public class Principal {
	

	static Scanner teclado = new Scanner(System.in);
	
	public static void exercicioI(){
		
		    ArrayList<String> elementos = new ArrayList<String>();{{
			
		    	elementos.add("b");
		    	elementos.add("3");
				elementos.add("Carruagens");
				elementos.add("8.56");
				elementos.add("caixas de armazenamento");
			
		    }};
		
		
		String novoElemento;
		System.out.println("\tElementos Existentes: \n");
		
		new Exerc1().listarElementos(elementos);
		
		
		
		System.out.println("\n\tIntroduza um novo elemento: ");
		
		novoElemento = teclado.nextLine();
		
		elementos = new Exerc1().addElemento(elementos, novoElemento);
		
		new Exerc1().listarElementos(elementos);
		
	}
	
	
	public static void exercicioII(){
		
		//ArrayList<Aluno> alunos = new ArrayList<Aluno>();
		ArrayList <Aluno> bd = new ArrayList<Aluno>();
		/*
		String nomeAluno = null;
		float notaAluno = 0;
		int contactoAluno = 0;*/
		
		
		/*
		for(int i=0; i<2; i++){
			System.out.println("\tINSIRA O NOME DO ALUNO: ");
			nomeAluno = teclado.nextLine();
			//System.out.println();
			System.out.println("INSIRA A NOTA DO ALUNO: ");
 			notaAluno = teclado.nextFloat();
 			System.out.println();
 			System.out.println("INSIRA UM NUMERO DE CONTACTO: ");
 			contactoAluno = teclado.nextInt();
 			System.out.println();
 			
 			Aluno aluno = new Aluno(nomeAluno,notaAluno,contactoAluno);
 			alunos = aluno.addAluno(alunos, aluno);
 			
		}*/
		
		Aluno n1 = new Aluno("Fernando","11",215486633);
		Aluno n2 = new Aluno("Rafael","15",215444443);
		Aluno n3 = new Aluno("Caramelo","14",215486663);
		Aluno n4 = new Aluno("Carlos","12",215555533);
		Aluno n5 = new Aluno("Tiririca","13",215489933);
		
		bd.add(n1);
		bd.add(n2);
		bd.add(n3);
		bd.add(n4);
		bd.add(n5);
		/*
		System.out.println("ALUNOS REGISTADOS:");
		for(int i=0; i<bd.size(); i++){
			System.out.println("ALUNO Nº"+(i+1)+bd.get(i).getNome());
			System.out.println("NOTA: "+bd.get(i).getNota());
			System.out.println("CONTACTO: "+bd.get(i).getContacto());
		}*/
		
		//
		
		final Comparator<Aluno>  ordenar= 
	            new Comparator<Aluno>() {
			public int compare(Aluno a1, Aluno a2) {
				return a2.getNota().compareTo(a1.getNota());
			}
		};
		
		Collections.sort(bd,ordenar);
		new Aluno().listarAlunos(bd,n1);
		
		//pesquisa em ->https://docs.oracle.com/javase/tutorial/collections/interfaces/order.html//
		
	}
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//exercicioI();
		exercicioII();
	}

	
	
	
}
