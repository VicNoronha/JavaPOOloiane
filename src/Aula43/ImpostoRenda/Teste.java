package Aula43.ImpostoRenda;

public class Teste {
    public static void main(String [] args){

        PessoaFisica p1 = new PessoaFisica();
        p1.setNome("Contribuinte 01 ");
        p1.setRendaBruta(1000);
        p1.setCpf("04974960547");

        PessoaJuridica p2 = new PessoaJuridica();
        p2.setNome("Contribuinte 02");
        p2.setRendaBruta(2500);
        p2.setCnpj("0001393934930");

        PessoaJuridica p3 = new PessoaJuridica();
        p3.setNome("Contribuinte 03");
        p3.setRendaBruta(2500);
        p3.setCnpj("23423435345");

        PessoaJuridica p4 = new PessoaJuridica();
        p4.setNome("Contribuinte 04");
        p4.setRendaBruta(3000);
        p4.setCnpj("0007111843832");

        PessoaJuridica p5 = new PessoaJuridica();
        p5.setNome("Contribuinte 05");
        p5.setRendaBruta(3700);
        p5.setCnpj("2389472387432");

        PessoaJuridica p6 = new PessoaJuridica();
        p5.setNome("Contribuinte 06");
        p5.setRendaBruta(5000);
        p5.setCnpj("283478312478932");

        Contribuinte [] contribuintes = new Contribuinte[6];
        contribuintes[0] = p1;
        contribuintes[1] = p2;
        contribuintes[2] = p3;
        contribuintes[3] = p4;
        contribuintes[4] = p5;
        //contribuintes[5] = p6;

        for (Contribuinte c : contribuintes){
            System.out.println(c.toString());

        }



    }
}
