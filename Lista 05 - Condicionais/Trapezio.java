import java.util.Scanner;

public class Trapezio{
	
private int a , b , c;	
	
public void setA(int a){
	this.a = a;
}	
	
public void setB(int b){
	this.b = b;
}	
	
public void setC(int c){
	this.c = c;
}	
	
public int getA(){
	return this.a;
}	
	
public int getB(){
	return this.b;
}	
	
public int getC(){
	return this.c;
}	
	
public void Area(){

int area = (this.getA() + this.getB() * (this.getC()/2));

if(area < 5){
	System.out.println("Pequeno");
}
else if(area >= 5 && area <= 10){
	System.out.println("Normal");
}	
else{
	System.out.println("Grande");
}	
}
	
public static void main(String[] args){
	
Scanner input = new Scanner(System.in);	
Trapezio objeto = new Trapezio();	
int valorLeitura1 = input.nextInt();	
objeto.setA(valorLeitura1);
int valorLeitura2 = input.nextInt();	
objeto.setB(valorLeitura2);	
int valorLeitura3 = input.nextInt();
objeto.setC(valorLeitura3);	
objeto.Area();	
}	
}


