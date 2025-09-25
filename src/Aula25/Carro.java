package Aula25;

public class Carro {

    public String marca;
    public String modelo;
    public int numPassageiros;
    public double capCombustivel;
    public double consumoCombustivel;

    void exbirAutonomia(){
        System.out.println(" A autonomia do carro é" +
                capCombustivel*consumoCombustivel+ " km ");
    }
    double obterAutonomia (){
        System.out.println(" Método obterAutonomia foi chamado");
        return capCombustivel * consumoCombustivel;
    }
}
