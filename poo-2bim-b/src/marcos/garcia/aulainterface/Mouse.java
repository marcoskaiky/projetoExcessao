package marcos.garcia.aulainterface;

public class Mouse implements Usb{
    @Override
    public Boolean conectar() {
        System.out.println("Mouse Conectado!");
        return true;
    }
}
