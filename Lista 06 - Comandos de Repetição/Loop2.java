import java.util.Scanner;

public class Loop2{
	
int a , b;
	
public void setA(int a){
	this.a = a;
}	
	
public int getA(){
	return this.a;
}	

public void setB(int b){
	this.b = b;
}	
	
public int getB(){
	return this.b;
}	
		
public void Teste(){
	
int i;	
	
if(this.getB() > this.getA()){	
	for(i = this.getA() ; i <= this.getB() ; i ++){
		System.out.printf("%d " , i);
	}	
} 

else{	
	for(i = this.getA() ; i >= this.getB() ; i --){
		System.out.printf("%d " , i);
		}
	}			
}	

public static void main(String[] args){
	
Scanner input = new Scanner(System.in);
Loop2 objeto = new Loop2();	
int valorLeitura0 = input.nextInt();	
objeto.setA(valorLeitura0);
int valorLeitura1 = input.nextInt();	
objeto.setB(valorLeitura1);	
objeto.Teste();	
}	
}