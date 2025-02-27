import java.util.Scanner;

public class Matriz{
	
private int [][] matriz;
private int numLinhas;	
private int numColunas;	
	
Matriz(int tamanhoLinha , int tamanhoColuna){
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
	int tamanhoLinha = input.nextInt();
	int tamanhoColuna = input.nextInt();
	Matriz objeto = new Matriz(tamanhoLinha , tamanhoColuna);
	objeto.lerMat(input);
	objeto.imprimeMat();
	}	
}