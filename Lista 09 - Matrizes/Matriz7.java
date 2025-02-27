import java.util.Scanner;

public class Matriz7{
	
private int[][] matriz;
private int numLinhas;
private int numColunas;

Matriz7(int tamanhoL , int tamanhoC){
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

public void somaPrimos(){

int i, j, k;
int contadivisores;
int soma = 0;

        for (i = 0; i < this.getNumLinhas(); i++) {
            for (j = 0; j < this.getNumColunas(); j++) {
                if (this.getElemento(i , j) > 1) { 
                    contadivisores = 0;
                    for (k = 1; k <= this.getElemento(i , j) ; k++) {
                        if (this.getElemento(i , j) % k == 0) {
                            contadivisores++;
                        }
                    }
                    if (contadivisores == 2) {
                        soma += this.getElemento(i , j);
                    }
                }
            }
        }
        System.out.printf("Soma Primos: %d\n", soma);
    }
	
public static void main(String[] args){
	
	Scanner input = new Scanner(System.in);
	int tamanhoL = input.nextInt();
	int tamanhoC = input.nextInt();
	Matriz7 objeto = new Matriz7(tamanhoL , tamanhoC);
	objeto.lerMat(input);
	System.out.println("Matriz");
	objeto.imprimeMat();
	objeto.somaPrimos();
	}	
}