import java.util.Scanner; 

public class Enigma{

private int num1, num2;

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
if(this.getNum1() + this.getNum2() == 42){
    System.out.println("A soma de " + this.getNum1() + " e " + this.getNum2() + " eh equivalente ao enigma do universo 42");	
}
    System.out.println("System Down");
}
	
public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    Enigma objeto = new Enigma();


    int valorLeitura = input.nextInt();
    objeto.setNum1(valorLeitura);
    int valorLeitura1 = input.nextInt();
    objeto.setNum2(valorLeitura1);
	objeto.Resultado();
}
}