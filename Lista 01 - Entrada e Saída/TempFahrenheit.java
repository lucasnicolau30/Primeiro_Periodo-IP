import java.util.Scanner;
public class TempFahrenheit{
	
	private float f;
	
	public void setF(float f){
		this.f = f;
	}
	
	public float getF(){
		return this.f;
	}
	
public void Resultado(){
	
	float c;
	c = ((5.0f/9.0f) * (this.getF() - 32));
	System.out.printf("Temperatura em F: %.1f\n" , this.getF());
	System.out.printf("Temperatura em C: %.1f\n" , c);
}	
public static void main(String[] args){
	
		Scanner input = new Scanner(System.in);
		TempFahrenheit objeto = new TempFahrenheit();
		float valorLeitura = input.nextFloat();
		objeto.setF(valorLeitura);
		objeto.Resultado();
	}				
}