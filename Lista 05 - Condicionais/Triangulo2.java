import java.util.Scanner;

public class Triangulo2{
	
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
	
int a , b , c;	
	
a = this.getX() * this.getX();	
b = this.getY() * this.getY();	
c = this.getZ() * this.getZ();	
	
if(this.getZ() >= this.getX() + this.getY() || this.getY() >= this.getX() + this.getZ() || this.getX() >= this.getY() + this.getZ()){
	System.out.println("As medidas nao formam um triangulo.");
}	else {
	if(a == b + c || b == c + a || c == a + b){ 
		if(this.getX() == this.getY() || this.getX() == this.getZ() || this.getY() == this.getZ()){
			System.out.println("Triangulo acutangulo.");		
			System.out.println("Triangulo isosceles.");	
		} else if(this.getX() != this.getY() && this.getY() != this.getZ()){
			System.out.println("Triangulo acutangulo.");		
			System.out.println("Triangulo escaleno.");
		}
	} else if(a > b + c || b > a + c || c > a + b){ 
	    if(this.getX() == this.getY() || this.getX() == this.getZ() || this.getY() == this.getZ()){
		  System.out.println("Triangulo obtusangulo.");		
		  System.out.println("Triangulo isosceles.");	 
	    } else if(this.getX() != this.getY() && this.getY() != this.getZ()){
		  System.out.println("Triangulo obtusangulo.");		
		  System.out.println("Triangulo escaleno.");	
	   }
	} else if(a < b + c || b < a + c || c < a + b){ 
		if(this.getX() == this.getY() && this.getX() == this.getZ()){
			System.out.println("Triangulo retangulo.");		
			System.out.println("Triangulo equilatero.");	
		}else if(this.getX() == this.getY() || this.getX() == this.getZ() || this.getY() == this.getZ()){
			System.out.println("Triangulo retangulo.");		
			System.out.println("Triangulo isosceles.");	
		}else if(this.getX() != this.getY() && this.getY() != this.getZ()){
			System.out.println("Triangulo acutangulo.");		
			System.out.println("Triangulo escaleno.");	
	}
	}
}
}	
	
public static void main(String[] args){
	
Scanner input = new Scanner(System.in);	
Triangulo2 objeto = new Triangulo2();	
int valorLeitura0 = input.nextInt();	
objeto.setX(valorLeitura0);
int valorLeitura1 = input.nextInt();	
objeto.setY(valorLeitura1);	
int valorLeitura2 = input.nextInt();	
objeto.setZ(valorLeitura2);	
objeto.Descubra();	
	}		
}