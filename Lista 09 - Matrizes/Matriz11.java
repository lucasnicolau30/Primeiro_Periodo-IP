import java.util.Scanner;

public class Matriz11{
	
private int[][] matriz;
private int numLinhas;
private int numColunas;

Matriz11(int tamanho){
	this.setNumLinhas(tamanho);
	this.setNumColunas(tamanho);
	matriz = new int[this.getNumLinhas()][this.getNumColunas()];
}	
	
public void setElemento(int indexL , int indexC , int numero){
	this.matriz[indexL][indexC] = numero;
}	
	
public int getElemento(int indexL , int indexC){
	return this.matriz[indexL][indexC];
}	
	
public void setNumLinhas(int numLinhas){
	this.numLinhas = numLinhas;
}
	
public int getNumLinhas(){
	return this.numLinhas;
}	
	
public void setNumColunas(int numColunas){
	this.numColunas = numColunas;
}
	
public int getNumColunas(){
	return this.numColunas;
}	
	
public void lerMat(Scanner input){
	
int i , j;	
	
	for(i = 0 ; i < this.getNumLinhas() ; i ++){
		for(j = 0 ; j < this.getNumColunas() ; j ++){
			this.setElemento(i , j , input.nextInt());		
		}
	}
}	
	
public void imprimeMat(){
	
int i , j;	
	
	for(i = 0 ; i < this.getNumLinhas() ; i ++){
		for(j = 0 ; j < this.getNumColunas() ; j ++){
			System.out.printf("%d " , this.getElemento(i , j));
		}
	System.out.println();	
	}
}		

public void somaMatrizes(Matriz11 objeto , Matriz11 objeto2){
	
int i , j;
int soma;
	
	for(i = 0 ; i < this.getNumLinhas() ; i ++){
		for(j = 0 ; j < this.getNumColunas() ; j ++){	
			soma = 0;
			soma = objeto.getElemento(i , j) + objeto2.getElemento(i , j);
			this.setElemento(i , j , soma);
		}
	}
}	
		
public static void main(String[] args){
	
	Scanner input = new Scanner(System.in);
	int tamanho = input.nextInt();
	Matriz11 objeto = new Matriz11(tamanho);
	Matriz11 objeto2 = new Matriz11(tamanho);
	Matriz11 objeto3 = new Matriz11(tamanho);
	objeto.lerMat(input);
	objeto2.lerMat(input);
	objeto3.somaMatrizes(objeto , objeto2);
	System.out.println("Matriz A");
	objeto.imprimeMat();
	System.out.println("Matriz B");
	objeto2.imprimeMat();
	System.out.println("Matriz Resultante");
	objeto3.imprimeMat();
	}	
}