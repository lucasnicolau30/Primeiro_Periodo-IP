import java.util.Scanner;

public class Crise{

private int a , b , c , d;

public void setA(int a){
    this.a = a;
}

public void setB(int b){
    this.b = b;
}

public void setC(int c){
    this.c = c;
}

public void setD(int d){
    this.d = d;
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

public int getD(){
    return this.d;
}

public void Calculo(){

int area;
float capacidade , autonomia;	
	
area = this.getA() * this.getB() * this.getC();
capacidade = area * 0.001f;
autonomia = capacidade / this.getD();	

if(autonomia < 2){
	System.out.printf("Capacidade do Reservatorio= %.1f litros \n" , capacidade);
	System.out.printf("Autonomia do reservatorio= %.1f dias \n" , autonomia);	
	System.out.println("Consumo Elevado");	
	}	
else if(autonomia >= 2 && autonomia <= 7){
	System.out.printf("Capacidade do Reservatorio= %.1f litros \n" , capacidade);
	System.out.printf("Autonomia do reservatorio= %.1f dias \n" , autonomia);	
	System.out.println("Consumo Moderado");		
	}	
else{
	System.out.printf("Capacidade do Reservatorio= %.1f litros \n" , capacidade);
	System.out.printf("Autonomia do reservatorio= %.1f dias \n" , autonomia);	
	System.out.println("Consumo Reduzido");		
	}		
}

public static void main(String[] args){

    Scanner input = new Scanner(System.in);
    Crise objeto = new Crise();
    int valorLeitura = input.nextInt();
    objeto.setA(valorLeitura);
    int valorLeitura1 = input.nextInt();
    objeto.setB(valorLeitura1);
    int valorLeitura2 = input.nextInt();
    objeto.setC(valorLeitura2);
    int valorLeitura3 = input.nextInt();
    objeto.setD(valorLeitura3);
    objeto.Calculo();
}
}
