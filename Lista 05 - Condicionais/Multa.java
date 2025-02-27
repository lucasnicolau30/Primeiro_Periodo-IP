import java.util.Scanner;

public class Multa{
		
private String nome;
private int v;
	
public Multa(String N,int V){
	this.setNome(N);
	this.setV(V);		
}
	
public void setNome(String nome){
	this.nome = nome;
}	
	
public String getNome(){
	return this.nome;
}	
	
public void setV(int v){
	this.v = v;
}	
	
public int getV(){
	return this.v;
}	
	
public void Verifica(int v1){

int s = v1 - this.getV(); 
	
if(this.getV() == v1){
	System.out.printf("Motorista: %s\n" , this.getNome());
	System.out.println("Sem multa");
}
else if(s <= 10){
	System.out.printf("Motorista: %s\n" , this.getNome());
	System.out.println("Multa: R$ " + 50 );
}	
else if(s >= 11 && s <= 30){
	System.out.printf("Motorista: %s\n" , this.getNome());
	System.out.println("Multa: R$ " + 100 );	
}
else if(s >= 31){
	System.out.printf("Motorista: %s\n" , this.getNome());
	System.out.println("Multa: R$ " + 200 );
}
}	
	
public static void main(String[] args){
	
Scanner input = new Scanner(System.in);	

String valorLeitura0 = input.nextLine();	
int valorLeitura1 = input.nextInt();		
int v1 = input.nextInt();
Multa objeto = new Multa(valorLeitura0 , valorLeitura1);	
objeto.Verifica(v1);		
	}	
}