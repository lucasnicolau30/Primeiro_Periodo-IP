import java.util.Scanner;

public class Fatorial{
	
int a;
	
public void setA(int a){
	this.a = a;
}	
	
public int getA(){
	return this.a;
}	

public void Teste(){
 
int i , fatorial = 1;
	
for(i = 1; i <= this.getA(); i++){
	fatorial *= i;
	}	
	
System.out.printf("Fatorial de %d: %d", this.getA() , fatorial);	
		
}	
	
public static void main(String[] args){
	
Scanner input = new Scanner(System.in);
Fatorial objeto = new Fatorial();	
int valorLeitura = input.nextInt();	
objeto.setA(valorLeitura);	
objeto.Teste();	
}		
}	