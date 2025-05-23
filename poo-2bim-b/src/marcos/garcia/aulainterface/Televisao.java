package marcos.garcia.aulainterface;

public class Televisao implements Tomada {
    @Override
    public void transmitirEnergiaEletrica() {
        System.out.println("Ligou Televisao na tomada");
    }
}
