import java.util.Scanner;

public class Carro{
	
private float a , b;
	
public void setA(float a){
	this.a = a;
}	
	
public float getA(){
	return this.a;
}
	
public void setB(float b){
	this.b = b;
}	
	
public float getB(){
	return this.b;
}	
	
public void Divisao(){
	
float calculo = this.getA() / this.getB();
	
if(calculo < 8){
	System.out.println("Venda o carro!");
}	
else if(calculo >= 8 && calculo <= 14){
	System.out.println("Economico!");
}
else{
	System.out.println("Super Economico!");
	}	
}
	
public static void main(String[] args){
	
Scanner input = new Scanner(System.in);	
Carro objeto = new Carro();	
float valorLeitura0 = input.nextFloat();
objeto.setA(valorLeitura0);	
float valorLeitura1 = input.nextFloat();	
objeto.setB(valorLeitura1);	
objeto.Divisao();		
}
}