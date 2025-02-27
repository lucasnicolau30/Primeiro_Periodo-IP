import java.util.Scanner;

public class Ponto{

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
	
public void Resultado(){
	
if((this.getX() * 2) + this.getY() == 3){
	System.out.println(this.getX() + " e " + this.getY() + " fazem parte da reta");
}else if((this.getX() * 2) + this.getY() != 3){
	System.out.println(this.getX() + " e " + this.getY() + " nao fazem parte da reta");
}
	
}	
	
public static void main(String[] args){
	
Scanner input = new Scanner(System.in);
Ponto objeto = new Ponto();	
int valorLeitura = input.nextInt();
objeto.setX(valorLeitura);
int valorLeitura1 = input.nextInt();
objeto.setY(valorLeitura1);		
objeto.Resultado();	
}	
}	
	
	
	
	
	
	
