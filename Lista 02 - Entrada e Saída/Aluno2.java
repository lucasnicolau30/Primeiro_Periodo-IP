import java.util.Scanner;

public class Aluno2{

private String nome;
private int idade;
private char g;
private float n1 , n2 , n3;

public void setNome(String nome){
    this.nome = nome;
}

public void setIdade(int idade){
    this.idade = idade;
}

public void setG(char g){
    this.g = g;
}

public void setN1(float n1){
    this.n1 = n1;
}

public void setN2(float n2){
    this.n2 = n2;
}

public void setN3(float n3){
    this.n3 = n3;
}

public String getNome(){
    return this.nome;
}

public int getIdade(){
    return this.idade;
}

public char getG(){
    return this.g;
}

public float getN1(){
    return this.n1;
}

public float getN2(){
    return this.n2;
}

public float getN3(){
    return this.n3;
}

public void Dados(){
float media;
media = ((this.getN1() + this.getN2() + this.getN3())/3);
System.out.println("Nome: " + this.getNome());
System.out.println("Idade: " + this.getIdade());
System.out.println("Sexo: " + this.getG());
System.out.printf("Media:  %.2f" , media);
}

public static void main(String[] args){

Scanner input = new Scanner(System.in);
Aluno2 objeto = new Aluno2();
String valorLeitura = input.nextLine();
objeto.setNome(valorLeitura);
int valorLeitura1 = input.nextInt();
objeto.setIdade(valorLeitura1);
char valorLeitura2 = input.next().charAt(0);
objeto.setG(valorLeitura2);
float valorLeitura3 = input.nextFloat();
objeto.setN1(valorLeitura3);
float valorLeitura4 = input.nextFloat();
objeto.setN2(valorLeitura4);
float valorLeitura5 = input.nextFloat();
objeto.setN3(valorLeitura5);
objeto.Dados();
}
}