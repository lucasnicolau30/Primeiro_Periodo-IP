import java.util.Scanner;

public class Pessoa {

String nome , profissao;	
float altura;	

public void setNome(String nome){
	this.nome = nome;
}	

public String getNome(){
	return this.nome;
}	
	
public void setProfissao(String profissao){
	this.profissao = profissao;
}	
	
public String getProfissao(){
	return this.profissao;
}	

public void setAltura(float altura){
	this.altura = altura;
}	
	
public float getAltura(){
	return this.altura;
}	
	
	
public static void main(String args[]) {
		
Scanner input = new Scanner (System.in);	
Pessoa [] lista = new Pessoa[4];
		
int i;
		
for (i = 0 ; i < 4 ; i ++){
	lista[i] = new Pessoa();
	}
	
for(i = 0 ; i < 4 ; i ++){
	lista[i].setNome(input.nextLine());
	}
	
for(i = 0 ; i < 4 ; i ++){
	lista[i].setProfissao(input.nextLine());
	}
	
for(i = 0 ; i < 4 ; i ++){
	lista[i].setAltura(input.nextFloat());
	}
	
float maior = lista[0].getAltura();
int guardaMaior = 0;
	
for(i = 0 ; i < 4 ; i ++){
	if(maior < lista[i].getAltura()){
		maior = lista[i].getAltura();
		guardaMaior = i;
		}
	}

	System.out.println(lista[guardaMaior].getNome());
	System.out.println(lista[guardaMaior].getAltura());
	System.out.println(lista[guardaMaior].getProfissao());
	
	}
}