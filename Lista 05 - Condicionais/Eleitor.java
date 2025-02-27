import java.util.Scanner;

public class Eleitor{
	
private int a;
	
public void setA(int a){
	this.a = a;
}	
	
public int getA(){
	return this.a;
}	
	
public void Idade(){
	
if(this.getA() < 16){
	System.out.println("nao votante");
}	
else if(this.getA() >= 18 && this.getA() <= 65){
	System.out.println("eleitor obrigatorio");
}
else{
	System.out.println("eleitor facultativo");
}
}	
	
public static void main(String[] args){
	
Scanner input = new Scanner(System.in);	
Eleitor objeto = new Eleitor();	
int valorLeitura = input.nextInt();	
objeto.setA(valorLeitura);	
objeto.Idade();	
}	
}







