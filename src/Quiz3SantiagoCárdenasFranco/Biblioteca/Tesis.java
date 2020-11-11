package Quiz3SantiagoCárdenasFranco.Biblioteca;

public class Tesis extends Recurso{
    public Tesis(boolean prestado, String nombre) {
        super(prestado, nombre);
    }

    @Override
    public String toString() {
        return "Tesis {" + " nombre = " + this.getNombre() +'}';
    }
}
