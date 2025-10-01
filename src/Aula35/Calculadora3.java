package Aula35;

public class Calculadora3 {

    // Métodos de Instância (Sobrecarga de Métodos - OK)
    public int soma (int num1, int num2){
        return num1 + num2;
    }
    public double soma (double num1, double num2){
        return num1 + num2;
    }

    public int soma (int num1, int num2, int num3){
        return num1 + num2 + num3;
    }
    public int soma (int [] vetorInteiros){
        int total = 0;

        for (int i=0; i<vetorInteiros.length; i++){
            total += vetorInteiros[i];
        }
        return total;
    }

    // MÉTODOS ESTÁTICOS (Movidos para DENTRO da classe)
    public static int fatorialNaoRecursivo(int num){
        if (num==0) {
            return 1;
        }
        int total = 1;
        for (int i=num; i>1; i--){
            total *= i;
        }
        return total;
    }

    public static int fatorial (int num){
        if (num == 0){
            return 1;
        }
        // Este é um método recursivo
        return num * fatorial(num-1);
    }
}
// OBS: A chave extra final foi removida.
