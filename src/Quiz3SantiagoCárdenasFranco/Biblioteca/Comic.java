package Quiz3SantiagoCárdenasFranco.Biblioteca;

public class Comic extends Recurso implements Prestable{
    public Comic(boolean prestado, String nombre) {
        super(prestado, nombre);
    }

    @Override
    public void prestar() {
        this.setPrestado(true);
    }

    @Override
    public void devolver() {
        this.setPrestado(false);
    }

    @Override
    public String toString() {
        return "Comic{" +
                "prestado =" + isPrestado() + " nombre = " + this.getNombre() +
                '}';
    }
}
