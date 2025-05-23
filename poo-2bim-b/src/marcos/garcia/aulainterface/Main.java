package marcos.garcia.aulainterface;

public class Main {

    public static void main(String[] args) {
        System.out.println("Aula Interfaces");

        //Usamos interface
        var computador = new Computador();
        var teclado = new Teclado();
        var mouse = new Mouse();
        computador.plugar(teclado);
        computador.plugar(mouse);

        //Replicar o conceito anterior
        var casa = new Casa();
        var geladeira = new Geladeira();
        var televisao = new Televisao();
        casa.colocarTomada(geladeira);
        casa.colocarTomada(televisao);
    }
}
