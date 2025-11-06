package Aula43.Animais;

public class Peixe extends Animal{

    private String caracteristicas;

    public Peixe(){
        this.setPatas(0);
        this.setAmbiente("mar");
        this.setCor("cinzenta");
        this.caracteristicas = "Barbatanas e Cauda";


    }

    public String getCaracteristicas() {
        return caracteristicas;
    }

    public void setCaracteristicas(String caracteristicas) {
        this.caracteristicas = caracteristicas;
    }

    @Override
    public String toString(){
        String s = super.toString();
//            String s = " Nome: " + getNome();
//            s += "\nComprimento: "+ getComprimento()+"cm";
//            s += "\nPatas: " +getPatas();
//            s += "\nCor: " + getCor();
//            s += "\nAmbiente: " + getAmbiente();
//            s += "\nVelocidade: " + getVelocidade() + "m/s";

        s+= "\nCaracteristicas: " +caracteristicas;
        return s;
    }
}
