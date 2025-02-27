import java.util.Scanner;

public class Array4{
	
private int [] vetor;	
	
Array4(int tamanho){
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
	
for(i = tamanho -1 ; i >= 0 ; i --){
	System.out.printf("%d " , this.getElemento(i));
	}
}	
	
public static void main(String[] args){

Scanner input = new Scanner(System.in);		
int tamanho = 10;
Array4 objeto = new Array4(tamanho);		
objeto.Metodo(input , tamanho);		
	}	
}