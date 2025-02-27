import java.util.Scanner;

public class Array3{

private int [] vetor1;
private int	[] vetor2;

Array3(int tamanho){
	vetor1 = new int[tamanho];
	vetor2 = new int[tamanho];
}

public void setElemento1(int index1 , int numero1){
	this.vetor1[index1] = numero1;
}	
	
public int getElemento1(int index1){
	return this.vetor1[index1];
}	
	
public void setElemento2(int index2 , int numero2){
	this.vetor2[index2] = numero2;
}	
	
public int getElemento2(int index2){
	return this.vetor2[index2];
}	

public void Metodo(Scanner input , int tamanho){

int i;
int resultado = 0;
int resultado1 = 0;	
	
	
for(i = 0 ; i < tamanho ; i ++){
	this.setElemento1(i , input.nextInt());
}	

for(i = 0 ; i < tamanho ; i ++){
	this.setElemento2(i , input.nextInt());
}	

for(i = 0 ; i < tamanho ; i ++){
	resultado =  vetor1[i] * vetor2[i];
	resultado1 += resultado;
}	
	System.out.println(resultado1);
}
	
public static void main(String[] args){

Scanner input = new Scanner(System.in);	
int tamanho = 10;
Array3 objeto = new Array3(tamanho);
objeto.Metodo(input , tamanho);
	}
}


