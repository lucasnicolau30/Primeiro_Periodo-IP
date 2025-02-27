import java.util.Scanner;

public class Multiplicacao{
   private float num1 , num2;


public void setNum1(float num1){
    this.num1 = num1;
}

public void setNum2(float num2){
    this.num2 = num2;
}

public float getNum1(){
    return this.num1;
}

public float getNum2(){
    return this.num2;
}

public void Resultado(){
    float resultado;
    resultado = this.getNum1() * this.getNum2();
    System.out.printf("O resultado da multiplicacao eh: %.0f\n", resultado);
}

public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    Multiplicacao objeto = new Multiplicacao();

    float valorLeitura = input.nextFloat();
    objeto.setNum1(valorLeitura);
    float valorLeitura1 = input.nextFloat();
    objeto.setNum2(valorLeitura1);
    objeto.Resultado();
}
}
