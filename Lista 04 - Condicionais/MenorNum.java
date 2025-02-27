import java.util.Scanner;

public class MenorNum{

private int a , b , c;

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
	
public void setC(int c){
    this.c = c;
}

public int getC(){
    return this.c;
}		
		
public void descobre(){
if(this.getA() < this.getB() && this.getA() < this.getC()){
	System.out.println("O Menor numero eh: " + this.getA()); 
}else if(this.getB() < this.getA() && this.getB() < this.getC()){
	System.out.println("O Menor numero eh: " + this.getB());
}else{
	System.out.println("O Menor numero eh: " + this.getC());	
}
}	
public static void main(String[] args){

Scanner input = new Scanner(System.in);
MenorNum objeto = new MenorNum();
int valorLeitura = input.nextInt();
objeto.setA(valorLeitura);
int valorLeitura1 = input.nextInt();
objeto.setB(valorLeitura1);	
int valorLeitura2 = input.nextInt();
objeto.setC(valorLeitura2);	
objeto.descobre();
}
}