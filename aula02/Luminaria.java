package aula02;

public class Luminaria {
    String modelo;
    String cor;
    int watts;
    boolean ligada;

    void informacoes() {
        System.out.println("O modelo da Luminaria é: " + this.modelo);
        System.out.println("Cor: " + this.cor);
        System.out.println("A lampada tem " + this.watts + " watts");
        System.out.println("Está ligada?" + this.ligada);
    }

    void ligada(){
        this.ligada = true;
    } 

    void desligada(){
        this.ligada = false;
    }
}
