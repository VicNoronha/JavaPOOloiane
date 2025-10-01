package Aula35;

public class TesteCalculadora {
    public static void main (String[] args){

        // Chamada do método fatorial não recursivo (static)
        int fatorialNR = Calculadora3.fatorialNaoRecursivo(5);
        System.out.println(fatorialNR); // Saída: 120

        // Chamada do método fatorial recursivo (static)
        int fatorialR = Calculadora3.fatorial(5);
        System.out.println(fatorialR); // Saída: 120
    }
}
