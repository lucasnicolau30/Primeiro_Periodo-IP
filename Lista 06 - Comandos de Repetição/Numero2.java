import java.util.Scanner;

public class Numero2{
	
private int a;	
	
public void setA(int a){
	this.a = a;
}	
	
public int getA(){
	return this.a;
}	
	
public void Resultado(){

int dezena , centena1 , centena2;
	
dezena = 0;
centena1 = 0;	
centena2 = 0;	
	
for(int i = 0 ; i <= this.getA() ; i ++){
	
if(i > 0 && i < 100){
	dezena ++;
}	
else if(i > 101 && i < 200){
	centena1 ++;
}	
else if(i > 200){
	centena2 ++;
}	
	}
	
	System.out.printf("Entre 0 e 100: %d \n" , dezena);
	System.out.printf("Entre 101 e 200: %d \n" , centena1);
	System.out.printf("Maior que 200: %d \n" , centena2);
	
}
	
public static void main(String[] args){
Scanner input = new Scanner(System.in);
Numero2 objeto = new Numero2();	
int valorLeitura = input.nextInt();	
objeto.setA(valorLeitura);	
objeto.Resultado();		
	}	
}