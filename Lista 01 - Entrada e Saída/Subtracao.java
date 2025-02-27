import java.util.Scanner;

public class Subtracao{

private int num1 , num2;

public void setNum1(int num1){
    this.num1 = num1;
}

public void setNum2(int num2){
    this.num2 = num2;
}

public int getNum1(){
    return this.num1;
}

public int getNum2(){
    return this.num2;
}

public void Resultado(){
    int resultado;
    resultado = this.getNum1() - this.getNum2();
    System.out.println("O resultado da subtracao eh: " + resultado);
}

public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    Subtracao objeto = new Subtracao();

    int valorLeitura = input.nextInt();
    objeto.setNum1(valorLeitura);
    int valorLeitura1 = input.nextInt();
    objeto.setNum2(valorLeitura1);
	 objeto.Resultado();
}
}    
