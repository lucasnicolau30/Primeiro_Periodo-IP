import java.util.Scanner;

public class Adivinha{
	
private int resposta , chances;	
	
public void setResposta(int resposta){
	this.resposta = resposta;
}	
	
public int getResposta(){
	return this.resposta;
}	
	
public void setChances(int chances){
	this.chances = chances;
}	
	
public int getChances(){
	return this.chances;
}	
	
public void Metodo(Scanner input){
	
int contador = 0;	
boolean igual = false;	
int leitura;	
	
	
while(contador < this.getChances()){

leitura = input.nextInt();
	
if (leitura == this.getResposta()){
	igual = true;
}

contador++;	 

}	
		 
if(igual){
	System.out.println("venceu");
}		 
else{
	System.out.println("perdeu");
	}		 
}	
		 
		 
public static void main(String [] args){
Scanner input = new Scanner(System.in);
Adivinha objeto = new Adivinha();	
int valorLeitura0 = input.nextInt();	
objeto.setResposta(valorLeitura0);	
int valorLeitura1 = input.nextInt();	
objeto.setChances(valorLeitura1);	
objeto.Metodo(input);	
}
}