package aula02;
public class Exercicio02 {
    public static void main(String[] args) {
        Luminaria l1 = new Luminaria();
        l1.modelo = "Caseira";
        l1.cor = "Azul";
        l1.ligada();
        l1.watts = 30;

        l1.informacoes();
        

        Luminaria l2 = new Luminaria();
        l1.modelo = "Caseira";
        l1.cor = "Preta";
        l1.desligada();
        l1.watts = 15;

        l1.informacoes();
        
    }
}
