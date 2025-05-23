package marcos.garcia.aulainterface;

public class Geladeira implements Tomada {
    @Override
    public void transmitirEnergiaEletrica() {
        System.out.println("Ligou Geladeira na tomada");
    }
}
