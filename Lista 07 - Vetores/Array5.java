import java.util.Scanner;

public class Array5{
	
private int [] vetor;

Array5(int tamanho){
	vetor = new int[tamanho];
}	
	
public void setElemento(int index , int numero){
	this.vetor[index] = numero;
}	
	
public int getElemento(int index){
	return this.vetor[index];
}

public void Metodo(Scanner input , int tamanho){

int i;	
	
for(i = 0 ; i < tamanho ; i ++){
	this.setElemento(i , input.nextInt());
	}

int maior = this.getElemento(0);	
int menor = this.getElemento(0);	
int guardaMaior = 0;
int guardaMenor = 0;	
	
for(i = 0 ; i < tamanho ; i ++){
	if(maior < this.getElemento(i)){
		maior = this.getElemento(i);
		guardaMaior = i;
		}
	}	

for(i = 0 ; i < tamanho ; i ++){
	if(menor > this.getElemento(i)){
		menor = this.getElemento(i);
		guardaMenor = i;
		}
	}
	
	System.out.printf("maior: %d \n" , guardaMaior);
	System.out.printf("menor: %d" , guardaMenor);
	
}
	
public static void main(String[] args){

Scanner input = new Scanner(System.in);
int tamanho = 15;
Array5 objeto = new Array5(tamanho);	
objeto.Metodo(input , tamanho);	
	}
}