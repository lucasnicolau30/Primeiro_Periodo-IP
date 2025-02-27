import java.util.Scanner;

public class Media{

    private float num1 , num2 , num3 , num4;

public void setNum1(float num1){
    this.num1 = num1;
}

public void setNum2(float num2){
    this.num2 = num2;
}

public void setNum3(float num3){
    this.num3 = num3;
}

public void setNum4(float num4){
    this.num4 = num4;
} 

public float getNum1(){
    return this.num1;
}

public float getNum2(){
    return this.num2;
}

public float getNum3(){
    return this.num3;
}

public float getNum4(){
    return this.num4;
}

public void Resultado(){

    float resultado;
    resultado = ((this.getNum1() + this.getNum2() + this.getNum3() + this.getNum4())/4.0f);
    System.out.printf("A media das notas eh:  %.2f\n" , resultado);
}

public static void main(String[] args){

Scanner input = new Scanner(System.in);
Media objeto = new Media();

float valorLeitura = input.nextFloat();
objeto.setNum1(valorLeitura);
float valorLeitura1 = input.nextFloat();
objeto.setNum2(valorLeitura1);
float valorLeitura2 = input.nextFloat();
objeto.setNum3(valorLeitura2);
float valorLeitura3 = input.nextFloat();
objeto.setNum4(valorLeitura3);
objeto.Resultado();
}
}




