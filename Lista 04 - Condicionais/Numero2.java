import java.util.Scanner;

public class Numero2{
	
private int num1;
	
public void setNum1(int num1){
	this.num1 = num1;
}	
	
public int getNum1(){
	return this.num1;
}	
	
public void Crescente(Numero2 objeto2 , Numero2 objeto3){

if(this.getNum1() > objeto2.getNum1() && objeto2.getNum1() > objeto3.getNum1()){
	System.out.printf("%d %d %d" ,objeto3.getNum1() , objeto2.getNum1() , this.getNum1());
}
else if(this.getNum1() > objeto2.getNum1() && objeto3.getNum1() > objeto2.getNum1()){
	System.out.printf("%d %d %d" ,objeto2.getNum1() , objeto3.getNum1() , this.getNum1());	
}
else if(objeto2.getNum1() > this.getNum1() && this.getNum1() > objeto3.getNum1()){
	System.out.printf("%d %d %d" ,objeto3.getNum1() , this.getNum1() , objeto2.getNum1());	
}
else if(objeto2.getNum1() > this.getNum1() && objeto3.getNum1() > this.getNum1()){
	System.out.printf("%d %d %d" ,this.getNum1() , objeto3.getNum1() , objeto2.getNum1());	
}
else if(objeto3.getNum1() > this.getNum1() && this.getNum1() > objeto2.getNum1()){
	System.out.printf("%d %d %d" ,objeto2.getNum1(), this.getNum1() , objeto3.getNum1());	
}
else{
	System.out.printf("%d %d %d" ,this.getNum1() , objeto2.getNum1() , objeto3.getNum1());	
}
}	
	
public static void main(String[] args){

Scanner input = new Scanner(System.in);
Numero2 objeto1 = new Numero2();
Numero2 objeto2 = new Numero2();	
Numero2 objeto3 = new Numero2();	
int valorLeitura1 = input.nextInt();
int valorLeitura2 = input.nextInt();	
int valorLeitura3 = input.nextInt();	
objeto1.setNum1(valorLeitura1);
objeto2.setNum1(valorLeitura2);	
objeto3.setNum1(valorLeitura3);	
objeto1.Crescente(objeto2 , objeto3);		
}	
}