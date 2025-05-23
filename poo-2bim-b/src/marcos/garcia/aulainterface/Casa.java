package marcos.garcia.aulainterface;

public class Casa {
    public void colocarTomada(Tomada tomada) {
        tomada.testarEnergia();
        tomada.transmitirEnergiaEletrica();
    }
}
