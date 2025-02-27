import java.util.Scanner;

public class Matriz8{
	
private int[][] matriz;
private int numLinhas;
private int numColunas;

Matriz8(int tamanhoL , int tamanhoC){
	this.setNumLinhas(tamanhoL);
	this.setNumColunas(tamanhoC);
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

public boolean verifica(int numero , int iP , int jP){

int i, j;
boolean resp = false;
	
	for(i = 0 ; i < this.getNumLinhas() ; i ++){
		for(j = 0 ; j < this.getNumColunas() ; j ++){
			if(numero == this.getElemento(i , j) && i != iP && j != jP){
				resp = true;
			}
		}
	}
	return resp;
}

public boolean anda(){
	
int i , j;
boolean resp = false;
	
	for(i = 0 ; i < this.getNumLinhas() ; i ++){
		for(j = 0 ; j < this.getNumColunas() ; j ++){
			if(this.verifica(this.getElemento(i , j) , i , j)){
				return true;
			}
		}
	}	
	return resp;
}	
	
public void buscaRepetidos(){
	
	if (this.anda()) {
            System.out.println("Tem elementos repetidos!!");
        } else {
            System.out.println("Nao tem elementos repetidos!!");
        }
    }    
	
public static void main(String[] args){
	
	Scanner input = new Scanner(System.in);
	int tamanhoL = input.nextInt();
	int tamanhoC = input.nextInt();
	Matriz8 objeto = new Matriz8(tamanhoL , tamanhoC);
	objeto.lerMat(input);
	System.out.println("Matriz");
	objeto.imprimeMat();
	objeto.buscaRepetidos();
	}	
} 
