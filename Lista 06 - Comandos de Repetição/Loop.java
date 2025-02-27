import java.util.Scanner;

public class Loop{
	
int a;
	
public void setA(int a){
	this.a = a;
}	
	
public int getA(){
	return this.a;
}	
	
public void Teste(){
	
int i;	
	
for(i = 0 ; i <= this.getA() ; i ++){
	System.out.println(i);
}		
}		
	
public static void main(String[] args){
	
Scanner input = new Scanner(System.in);
Loop objeto = new Loop();	
int valorLeitura = input.nextInt();	
objeto.setA(valorLeitura);	
objeto.Teste();	
}	
}