import java.util.Scanner;

public class Matriz6{
	
private int[][] matriz;
private int numLinhas;
private int numColunas;

Matriz6(int tamanhoL , int tamanhoC){
	this.setNumLinhas(tamanhoL);
	this.setNumColunas(tamanhoC);
	matriz = new int[this.getNumLinhas()][this.getNumColunas()];
}	
	
public void setElemento(int indexL , int indexC , int numero){
	this.matriz[indexL][indexC] = numero;
}
	
public int getElemento(int indexL, int indexC){
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
	
public void somaMat(){
	
int i , j , soma = 0;	

	for(i = 0 ; i < this.getNumLinhas() ; i ++){
		for(j = 0 ; j < this.getNumColunas() ; j ++){
			soma += this.getElemento(i , j);
		}
	}
	System.out.printf("Soma Matriz: %d \n" , soma);	
}	
	
public void somaPrincipal(){
	
int i , somaPrincipal = 0;	
	
	for(i = 0 ; i < this.getNumLinhas() ; i ++){
		somaPrincipal += this.getElemento(i , i);
	}
	System.out.printf("Soma Diagonal: %d" , somaPrincipal);
}	
	
public static void main(String[] args){
	
	Scanner input = new Scanner(System.in);
	int tamanhoL = input.nextInt();
	int tamanhoC = input.nextInt();
	Matriz6 objeto = new Matriz6(tamanhoL , tamanhoC);
	objeto.lerMat(input);
	System.out.println("Matriz");
	objeto.imprimeMat();
	objeto.somaMat();
	objeto.somaPrincipal();
	}	
}