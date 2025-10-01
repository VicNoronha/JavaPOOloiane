package Aula34;

public class Contador {
    static int cont;
    public static void incrementar(){
        cont ++;
    }
    public static void zerar(){
        cont =0;
    }
    public static int obterValor(){
        return cont;
    }
}
