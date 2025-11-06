package Aula43.Animais;

public class Teste {

    public static void  main(String [] args){

//        Animal camelo = new Animal();
//        camelo.setNome("Camelo");
//        camelo.setComprimento(150);
//        camelo.setPatas(4);
//        camelo.setCor("Amarelo");
//        camelo.setAmbiente("Deserto");
//        camelo.setVelocidade(15);
//
        Peixe peixe = new Peixe();
        peixe.setComprimento(300);
        peixe.setVelocidade(2);
        peixe.setAmbiente("Mar");
        peixe.setNome("Shark Boy");
        System.out.println(peixe.toString());
//
//        Mamifero urso = new Mamifero();
//        urso.setNome("Urso do Canadá");
//        urso.setComprimento(180);
//        urso.setCor("Marrom");
//        urso.setAmbiente("Terra");
//        urso.setAlimento("Peixes");
//
//        Animal[] animals = new Animal[3];
//        animals[0] = camelo;
//        animals[1] = peixe;
//        animals[2] = urso;
//
//        System.out.println("-----------------------");
//        for (Animal animal : animals){
//            System.out.println(animal);
//            System.out.println("-----------------------");
//        }

        Animal animal = new Animal();
        animal.setNome("Camelo");
        animal.setComprimento(150);
        animal.setPatas(4);
        animal.setCor("Amarelo");
        animal.setAmbiente("Deserto");
        animal.setVelocidade(15);

        System.out.println(animal);
//
       }

}
