import java.util.Scanner;

public class Matriz12{
	
private int[][] matriz;
private int numLinhas;
private int numColunas;

Matriz12(int tamanho){
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

public void multiplicaMatrizes(Matriz12 objeto , Matriz12 objeto2){
	
int i, j , k;
int soma = 0;
        
	for (i = 0; i < this.getNumLinhas(); i++) {
   	for (j = 0; j < objeto2.getNumColunas(); j++) {
			for(k = 0 ; k < this.getNumColunas() ; k ++){
			soma += objeto.getElemento(i , k) * objeto2.getElemento(k , j);
			}
			this.setElemento(i , j , soma);
			soma = 0;
		}
	}  
}   

public static void main(String[] args){
	
	Scanner input = new Scanner(System.in);
	int tamanho = input.nextInt();
	Matriz12 objeto = new Matriz12(tamanho);
	Matriz12 objeto2 = new Matriz12(tamanho);
	Matriz12 objeto3 = new Matriz12(tamanho);
	objeto.lerMat(input);
	objeto2.lerMat(input);
	objeto3.multiplicaMatrizes(objeto , objeto2);
	System.out.println("Matriz A");
	objeto.imprimeMat();
	System.out.println("Matriz B");
	objeto2.imprimeMat();
	System.out.println("Matriz Resultante");
	objeto3.imprimeMat();
	}	
}