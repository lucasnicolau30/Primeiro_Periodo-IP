import java.util.Scanner; 

public class Multiplos{

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
if(this.getNum1() > this.getNum2()){	
if(this.getNum1()%this.getNum2() == 0){
System.out.println("Numero " + this.getNum1() + " eh multiplo de " + this.getNum2());
}
}	
if(this.getNum2() > this.getNum1()){	
if(this.getNum2()%this.getNum1() == 0){
System.out.println("Numero " + this.getNum2() + " eh multiplo de " + this.getNum1());
}	
}	
System.out.println("The last mission is over");	
}
	
public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    Multiplos objeto = new Multiplos();


    int valorLeitura = input.nextInt();
    objeto.setNum1(valorLeitura);
    int valorLeitura1 = input.nextInt();
    objeto.setNum2(valorLeitura1);
	objeto.Resultado();
}
}
	
