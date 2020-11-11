package Quiz3SantiagoCárdenasFranco.Biblioteca;

public class Mapa extends Recurso {
    public Mapa(boolean prestado, String nombre) {
        super(prestado, nombre);
    }

    @Override
    public String toString() {
        return "Mapa {" + "nombre = " + this.getNombre() +'}';
    }
}
