import java.util.Scanner;

public class Salario{

private float num1;
private int num2;

public void setNum1(float num1){
    this.num1 = num1;
}

public void setNum2(int num2){
    this.num2 = num2;
}

public float getNum1(){
    return this.num1;
}

public int getNum2(){
    return this.num2;
}

public void Resultado(){

float resultado;
resultado = (this.getNum1() * this.getNum2());
System.out.printf("O total do salario eh:  %.2f\n" , resultado); 
}

public static void main(String[] args){

Scanner input = new Scanner(System.in);
Salario objeto = new Salario();

float valorLeitura = input.nextFloat();
objeto.setNum1(valorLeitura);
int valorLeitura1 = input.nextInt();
objeto.setNum2(valorLeitura1);
objeto.Resultado();
}
}