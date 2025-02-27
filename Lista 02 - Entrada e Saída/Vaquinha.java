import java.util.Scanner;

public class Vaquinha{

private float a;

public void setA(float a){
    this.a = a;
}

public float getA(){
    return this.a;
}

public void Divisao(){

float b; 
b = (this.getA()/4);
System.out.printf("%.2f" , b);
}

public static void main(String[] args){

Scanner input = new Scanner(System.in);
Vaquinha objeto = new Vaquinha();
float valorLeitura = input.nextFloat();
objeto.setA(valorLeitura);
objeto.Divisao();
}
}

