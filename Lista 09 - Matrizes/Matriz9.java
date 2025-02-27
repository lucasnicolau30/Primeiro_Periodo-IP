import java.util.Scanner;

public class Matriz9{
	
private int[][] matriz;
private int numLinhas;
private int numColunas;

Matriz9(int tamanho){
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

public void ehQuadradoMagico(){
	
int i , j;
boolean quadradomagico = false;
int somaDiagonalPrincipal = 0;
int somaDiagonalSecundaria = 0;
int somaLinha;
int somaColuna;	
	
	
	for ( i = 0; i < this.getNumLinhas() ; i++) {
		somaDiagonalPrincipal += this.getElemento(i, i);
		somaDiagonalSecundaria += this.getElemento(i, this.getNumLinhas() - 1 - i);
	}

   if (somaDiagonalPrincipal == somaDiagonalSecundaria) {
   	quadradomagico = true;
    }

    for ( i = 0; i <  this.getNumLinhas(); i++) {
             somaLinha = 0;
             somaColuna = 0;

            for ( j = 0; j <  this.getNumLinhas(); j++) {
                somaLinha += this.getElemento(i, j);
                somaColuna += this.getElemento(j, i);
            }

            if (somaLinha != somaColuna || somaColuna != somaDiagonalPrincipal) {
                quadradomagico = false;
            }
        }

	if(quadradomagico == false) {
		System.out.println("nao eh um quadrado magico!");
	}	 
	else {
		System.out.println("eh um quadrado magico!");
	}
}
	
public static void main(String[] args){
	
	Scanner input = new Scanner(System.in);
	int tamanho = input.nextInt();
	Matriz9 objeto = new Matriz9(tamanho);
	objeto.lerMat(input);
	System.out.println("Matriz");
	objeto.imprimeMat();
	objeto.ehQuadradoMagico();
	}	
}