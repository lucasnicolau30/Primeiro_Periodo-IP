import java.util.Scanner;

public class Matriz5{
	
private int [][]	matriz;
private int numLinhas;
private int numColunas;
	
Matriz5(int tamanho){
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

public void imprimeMatriz(){
	
int i , j;
	
	for(i = 0 ; i < this.getNumLinhas() ; i ++){
		for(j = 0 ; j < this.getNumColunas() ; j ++){
			System.out.printf("%d " , this.getElemento(i , j));		
		}
		System.out.println();
	}
}	
	
public void somaMatriz(){
	
int i , j , soma = 0;
	
	for(i = 0 ; i < this.getNumLinhas() ; i ++){
		for(j = 0 ; j < this.getNumColunas() ; j ++){
			soma += this.getElemento(i , j);
		}
	}
	
	System.out.printf("Soma: %d" , soma);
	
}	
	
public static void main(String[] args){
	
	Scanner input = new Scanner(System.in);
	int tamanho = input.nextInt();
	Matriz5 objeto = new Matriz5(tamanho);
	objeto.lerMat(input);
	System.out.println("Matriz");
	objeto.imprimeMatriz();
	objeto.somaMatriz();
	}	
}