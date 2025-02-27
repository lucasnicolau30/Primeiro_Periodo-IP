import java.util.Scanner;

public class Matriz2{
	
private int [][] matriz;
private int numLinhas;	
private int numColunas;	
	
Matriz2(int tamanhoLinha , int tamanhoColuna){
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
	
for(i = 0 ; i < this.getColunas() ; i ++){
	for(j = 0 ; j < this.getNumLinhas() ; j ++){
		System.out.printf("%d " , this.getElemento(j , i));
	}
	System.out.println();
}	

}
	
	
public static void main(String[] args){
	
	Scanner input = new Scanner(System.in);
	int tamanhoLinha = input.nextInt();
	int tamanhoColuna = input.nextInt();
	Matriz2 objeto = new Matriz2(tamanhoLinha , tamanhoColuna);
	objeto.lerMat(input);
	objeto.imprimeMat();
	}	
}