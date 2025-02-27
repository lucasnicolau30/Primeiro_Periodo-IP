import java.util.Scanner;

public class Pessoa{
	
private String a;
private int b;	
	
public void setA(String a){
	this.a = a;
}
	
public void setB(int b){
	this.b = b;
}	
	
public String getA(){
	return this.a;
}
	
public int getB(){
	return this.b;
}	
	
public void Entrada(){

if((2021 - this.getB()) >= 18){
	System.out.println(this.getA() +" entrada liberada, divirta-se a vontade na melhor boate da regiao norte");
}
else if(18 > (2021 - this.getB())){
	System.out.println(this.getA() +" entrada negada, volte daqui a alguns anos");
}
}
public static void main(String[] args){
	
Scanner input = new Scanner(System.in);
Pessoa objeto = new Pessoa();	
String valorLeitura = input.nextLine();
objeto.setA(valorLeitura);
int valorLeitura1 = input.nextInt();
objeto.setB(valorLeitura1);		
objeto.Entrada();	
}		
}	
	