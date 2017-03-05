package exercicios;

import java.util.ArrayList;

public class Exerc1 {

	
	
	
	//Listar elementos de um ArrayList
	
	public void listarElementos(ArrayList<String> elementos){
		for(int i=0; i<elementos.size();i++){
			System.out.println("Conteudo nº "+ (i+1) +" --> "+ elementos.get(i));
		}
	}
	
	//Adicionar elemntos de um ArrayList
	
	public ArrayList<String> addElemento(ArrayList<String> elementos, String objeto){
		
		elementos.add(objeto);
		
		return elementos;
	}
	
}
