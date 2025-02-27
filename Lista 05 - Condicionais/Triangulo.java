import java.util.Scanner;

public class Triangulo{
	
private int x , y , z;
	
public void setX(int x){
	this.x = x;
}
	
public void setY(int y){
	this.y = y;
}	
	
public void setZ(int z){
	this.z = z;
}	
	
public int getX(){
	return this.x;
}	
	
public int getY(){
	return this.y;
}	
	
public int getZ(){
	return this.z;
}	
	
public void Descubra(){
if(this.getZ() > this.getX() + this.getY() || this.getY() > this.getX() + this.getZ() || this.getX() > this.getY() + this.getZ()){
	System.out.println(0);
}	
else if(this.getX() == this.getY() && this.getX() == this.getZ()){
	System.out.println(1);
}
else if(this.getX() == this.getY() || this.getX() == this.getZ() || this.getY() == this.getZ()){
	System.out.println(2);
}		
else{
	System.out.println(3);
}	
}	
	
public static void main(String[] args){
	
Scanner input = new Scanner(System.in);	
Triangulo objeto = new Triangulo();	
int valorLeitura0 = input.nextInt();	
objeto.setX(valorLeitura0);
int valorLeitura1 = input.nextInt();	
objeto.setY(valorLeitura1);	
int valorLeitura2 = input.nextInt();	
objeto.setZ(valorLeitura2);	
objeto.Descubra();	
}	
}