import java.util.Scanner;

public class Compra{
	
private float a , b;
	
public void setA(float a){
	this.a = a;
}
	
public void setB(float b){
	this.b = b;
}	
	
public float getA(){
	return this.a;
}
	
public float getB(){
	return this.b;
}	
	
public void Calculo(){

float c;
c = (this.getA() * 0.95f);
	
if(this.getA() > 200.00f && c <= this.getB()){
	System.out.printf("Valor final da compra %.2f, O cliente tem saldo suficiente!!" , c);
}else if(this.getA() > 200.00f && c > this.getB()){
	System.out.printf("Valor final da compra %.2f, O cliente nao tem saldo suficiente!!" , c);
}if(this.getA() <= 200.00f && this.getA() <= this.getB()){
	System.out.printf("Valor final da compra %.2f, O cliente tem saldo suficiente!!" , this.getA());
}else if(this.getA() <= 200.00f && this.getA() > this.getB()){
	System.out.printf("Valor final da compra %.2f, O cliente nao tem saldo suficiente!!" , this.getA());
}
	
}
public static void main(String[] args){
	
Scanner input = new Scanner(System.in);
Compra objeto = new Compra();	
float valorLeitura = input.nextFloat();
objeto.setA(valorLeitura);
float valorLeitura1 = input.nextFloat();
objeto.setB(valorLeitura1);		
objeto.Calculo();	
}		
}