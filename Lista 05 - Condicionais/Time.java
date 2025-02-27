import java.util.Scanner;

public class Time{

private String n;
private int g;	
	
public void setN(String n){
	this.n = n;
}	
	
public void setG(int g){
	this.g = g;
}	
	
public String getN(){
	return this.n;
}	
	
public int getG(){
	return this.g;
}	

public void Vencedor(Time objeto2){

if(this.getG() > objeto2.getG()){
	System.out.printf("%s foi o vencedor da partida." , this.getN());
}	
else if(objeto2.getG() > this.getG()){
	System.out.printf("%s foi o vencedor da partida." , objeto2.getN());
}	
else{
	System.out.printf("Os times %s e %s empataram." , this.getN() , objeto2.getN());
	}	
}		
	
public static void main(String[] args){
	
Scanner input = new Scanner(System.in);	
Time objeto1 = new Time();	
Time objeto2 = new Time();	
String valorLeitura1 = input.nextLine();	
int valorLeitura2 = input.nextInt();
input.nextLine();	
String valorLeitura3 = input.nextLine();
int valorLeitura4 = input.nextInt();	
objeto1.setN(valorLeitura1);	
objeto1.setG(valorLeitura2);	
objeto2.setN(valorLeitura3);	
objeto2.setG(valorLeitura4);	
objeto1.Vencedor(objeto2);		
}	
}