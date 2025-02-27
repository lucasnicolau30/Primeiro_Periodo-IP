import java.util.Scanner;

public class Numero{
	
private int n;	
	
public void setN(int n){
	this.n = n;
}	
	
public int getN(){
	return this.n;
}	
	
public void Soma(){

int numero = this.getN();
int soma = 0;
	
while(numero != 0){	
	
	int ultimoDigito = numero % 10;  
   	soma += ultimoDigito; 
   	numero /= 10;
	}	
	System.out.println(soma);
}	
	
public static void main(String[] args){

Scanner input = new Scanner(System.in);
Numero objeto = new Numero();	
int valorLeitura = input.nextInt();	
objeto.setN(valorLeitura);	
objeto.Soma();	
	}
}