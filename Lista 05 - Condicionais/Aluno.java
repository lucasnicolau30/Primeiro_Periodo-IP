import java.util.Scanner;

public class Aluno{
	
private int a , b , c;	
	
public void setA(int a){
	this.a = a;
}	
	
public void setB(int b){
	this.b = b;
}
	
public void setC(int c){
	this.c = c;
}	
	
public int getA(){
	return this.a;
}	
	
public int getB(){
	return this.b;
}	
	
public int getC(){
	return this.c;
}	
	
public void Resultado(){
	
int media = ((this.getA() + this.getB() + this.getC())/3);	
	
if(media >= 7){
	System.out.println("Aprovado");
}	
else if(media >= 3 && media < 7){
	System.out.println("Prova final");
}	
else{
	System.out.println("Reprovado");
} 	
}
	
public static void main(String[] args){

Scanner input = new Scanner(System.in);
Aluno objeto = new Aluno();
int valorLeitura = input.nextInt();
objeto.setA(valorLeitura);
int valorLeitura1= input.nextInt();
objeto.setB(valorLeitura1);
int valorLeitura2= input.nextInt();
objeto.setC(valorLeitura2);
objeto.Resultado();
}
}