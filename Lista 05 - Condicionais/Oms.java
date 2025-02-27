import java.util.Scanner;

public class Oms{
	
private float a;
	
public void setA(float a){
	this.a = a;
}	
	
public float getA(){
	return this.a;
}	
	
public void Divisao(){
	
if(this.getA() <= 9.12f){
	System.out.println("infancia");
}	

else if(this.getA() >= 10.00f && this.getA() < 14.00f){
	System.out.println("pre-adolescencia");
}
	
else if(this.getA() >= 15.00f && this.getA() < 19.00f){
	System.out.println("adolescencia");
}	
else if(this.getA() >= 20.00f && this.getA() < 24.00f){
	System.out.println("juventude");
}	
}
	
public static void main(String[] args){
	
Scanner input = new Scanner(System.in);	
Oms objeto = new Oms();	
float valorLeitura = input.nextFloat();
objeto.setA(valorLeitura);	
objeto.Divisao();		
}
}