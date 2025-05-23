package marcos.garcia.aulainterface;

public class Teclado implements Usb{

    @Override
    public Boolean conectar() {
        System.out.println("Teclado Conectado!");
        return true;
    }
}
