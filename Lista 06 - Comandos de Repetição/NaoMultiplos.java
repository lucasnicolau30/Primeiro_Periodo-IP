import java.util.Scanner;

public class NaoMultiplos{
	
private int x , y;	
	
public void setX(int x){
	this.x = x;
}	
	
public void setY(int y){
	this.y = y;
}	
	
public int getX(){
	return this.x;
}	
	
public int getY(){
	return this.y;
}	
	
public void soma1(){
	
int soma1 = 0;
int soma2 = 0;
int contador1 = this.getX();	
int contador2 = this.getY();
	
while(contador1 <= this.getY()){
	if(contador1 % 13 != 0){
		soma1 += contador1;
	}
contador1 ++;
}	
	
while(contador2 <= this.getX()){
	if(contador2 %  13 != 0){
		soma2+= contador2;
	}
contador2++;
}	
	
if(this.getX() <= this.getY()){
	System.out.println(soma1);	
}
else{	
	System.out.println(soma2);	
	}	
}
	
public static void main(String[] args){
	
Scanner input = new Scanner(System.in);
NaoMultiplos objeto = new NaoMultiplos();	
int valorLeitura1 = input.nextInt();
objeto.setX(valorLeitura1);
int valorLeitura2 = input.nextInt();
objeto.setY(valorLeitura2);
objeto.soma1();	
	}	
}