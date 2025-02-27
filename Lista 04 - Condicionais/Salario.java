import java.util.Scanner;

public class Salario{
	
private float s , e;
	
public void setS(float s){
	this.s = s;
}
	
public void setE(float e){
	this.e = e;
}	
	
public float getS(){
	return this.s;
}
	
public float getE(){
	return this.e;
}	
	
public void Emprestimo(){

float a = this.getS() * 0.20f;
	
if(a >= this.getE()){
	System.out.println("Emprestimo concedido!!!");
}else if(a < this.getE()){
	System.out.println("Emprestimo nao concedido...");
}
}
public static void main(String[] args){
	
Scanner input = new Scanner(System.in);
Salario objeto = new Salario();	
float valorLeitura = input.nextFloat();
objeto.setS(valorLeitura);
float valorLeitura1 = input.nextFloat();
objeto.setE(valorLeitura1);		
objeto.Emprestimo();	
}		
}	
	
	
	
	
	

	
	
	
	
	
	
	
