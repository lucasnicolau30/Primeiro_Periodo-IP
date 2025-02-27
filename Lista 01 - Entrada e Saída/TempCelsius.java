import java.util.Scanner;

public class TempCelsius{

    private float c;

public void setC(float c){
    this.c = c;
}

public float getC(){
    return this.c;
}

public void Resultado(){
    float f;
    f = ((1.8f * this.getC()) + 32);
    System.out.printf("Temperatura em C: %.1f\n" , this.getC());
	 System.out.printf("Temperatura em F: %.1f\n" , f);
}

public static void main(String[] args){

    Scanner input = new Scanner(System.in);
    TempCelsius objeto = new TempCelsius();
    float valorLeitura = input.nextFloat();
    objeto.setC(valorLeitura);
    objeto.Resultado();
}
}