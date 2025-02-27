import java.util.Scanner;

public class Matriz3{
	
private int [][] matriz;
private int numLinhas;	
private int numColunas;	
	
Matriz3(int tamanhoLinha , int tamanhoColuna){
	this.setNumLinhas(tamanhoLinha);
	this.setNumColunas(tamanhoColuna);
	matriz = new int[this.getNumLinhas()][this.getColunas()];
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
	
public void setNumColunas(int numColunas){
	this.numColunas = numColunas;
}	
	
public int getNumLinhas(){
	return this.numLinhas;
}	
	
public int getColunas(){
	return this.numColunas;
}	
	
public void lerMat(Scanner input){

int i , j;
	
for(i = 0 ; i < this.getNumLinhas() ; i ++){
	for(j = 0 ; j < this.getColunas() ; j ++){
		this.setElemento(i , j , input.nextInt());
	}
}	

}
		
public void somaMatriz(int numSoma){

int i , j , numMat;
	
for(i = 0 ; i < this.getNumLinhas() ; i ++){
	for(j = 0 ; j < this.getColunas() ; j ++){
		numMat = this.getElemento(i , j);
		this.setElemento(i , j , numMat + numSoma);
	}
}	

}
	
public void imprimeMat(){

int i , j;
	
for(i = 0 ; i < this.getNumLinhas() ; i ++){
	for(j = 0 ; j < this.getColunas() ; j ++){
		System.out.printf("%d " , this.getElemento(i , j));
	}
	System.out.println();
}	

}
	
public static void main(String[] args){
	
	Scanner input = new Scanner(System.in);
	int numSoma = input.nextInt();
	int tamanhoLinha = input.nextInt();
	int tamanhoColuna = input.nextInt();
	Matriz3 objeto = new Matriz3(tamanhoLinha , tamanhoColuna);
	objeto.lerMat(input);
	objeto.somaMatriz(numSoma);
	objeto.imprimeMat();
	}	
}