import java.util.Scanner;

public class Numero3{
	
private int a;	
	
public void setA(int a){
	this.a = a;
}	
	
public int getA(){
	return this.a;
}	
	
public void Resultado(){

int resultado;	
	
for(int i = 0 ; this.getA() >= i ; i ++){
	
	resultado = (i * this.getA()); 
	System.out.printf("%d x %d = %d \n" , this.getA() , i , resultado);
	
	}	
}
	
public static void main(String[] args){
Scanner input = new Scanner(System.in);
Numero3 objeto = new Numero3();	
int valorLeitura = input.nextInt();	
objeto.setA(valorLeitura);	
objeto.Resultado();		
	}	
}