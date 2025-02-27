import java.util.Scanner;

public class Array{
	
private int [] vetor;
private int tamanho;	
	
Array(int tamanho){
	this.setTamanho(tamanho);
	vetor = new int[this.getTamanho()];
}	
	
public void setTamanho(int tamanho){
	this.tamanho = tamanho;
}	
	
public int getTamanho(){
	return this.tamanho;
}	
	
public void setElemento(int index , int numero){
	this.vetor[index] = numero;
}	
	
public int getElemento(int index){
	return this.vetor[index];
}	
	
public void Metodo(Scanner input){

int par = 0 , impar = 0;	
int i;	
for(i = 0 ; i < this.getTamanho() ; i ++){
	this.setElemento(i , input.nextInt());
		if(this.getElemento(i) % 2 == 0){
			par += 1;	
		}
			else{
				impar += 1;
			}
		}	
	System.out.println("pares: " + par);
	System.out.println("impares: " + impar);
}	
	
public static void main(String[] args){
	
Scanner input = new Scanner(System.in);
int valorLeitura1 = input.nextInt();
Array objeto = new Array(valorLeitura1);	
objeto.Metodo(input);	
	}	
}