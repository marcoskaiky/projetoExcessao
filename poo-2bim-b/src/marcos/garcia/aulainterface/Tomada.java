package marcos.garcia.aulainterface;

public interface Tomada {
    void transmitirEnergiaEletrica();
    default void testarEnergia(){
        System.out.println("testar energia");
    }
}
