import java.util.Scanner;

public class Algorismo{
	
private int a;
	
public void setA(int a){
	this.a = a;
}

public int getA(){
	return this.a;
}
	
public void Resultado(){
	
int b , c , d , e , f;
	
b = (this.getA()/100);
c = (this.getA()%100);	
d = (c/10);
e = (c%10);
f = (b + d + e);
if (this.getA()%2 == 0){
System.out.println("Numero " + this.getA() + " eh par e a soma dos seus algarismos eh " + f);	
}
System.out.println("Bye Bye");
}	
	
public static void main(String[] args){
	
Scanner input = new Scanner(System.in);	
Algorismo objeto = new Algorismo();	
	
int valorLeitura = input.nextInt();
objeto.setA(valorLeitura);
objeto.Resultado();
}	
}	
	
	
	
	
	
	
	
	

	
