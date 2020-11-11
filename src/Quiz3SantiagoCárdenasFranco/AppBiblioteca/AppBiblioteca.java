package Quiz3SantiagoCárdenasFranco.AppBiblioteca;

import Quiz3SantiagoCárdenasFranco.Biblioteca.*;

public class AppBiblioteca {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();
        Comic comic = new Comic(false, "Iron Man");
        Libro libro = new Libro(false, "Ready Player One");
        Mapa mapa = new Mapa(false, "Mapa de colombia");
        Revista revista = new Revista(false, "Revista El tiempo");
        Tesis tesis = new Tesis(false, "Estudio de nanotecnologia");

        biblioteca.addRecurso(comic);
        biblioteca.addRecurso(libro);
        biblioteca.addRecurso(mapa);
        biblioteca.addRecurso(revista);
        biblioteca.addRecurso(tesis);

        boolean recurso1 = biblioteca.prestarRecurso(comic);
        boolean recurso2 = biblioteca.prestarRecurso(libro);
        //boolean recurso3 = biblioteca.prestarRecurso(mapa, mapa); //Como mapa no está implementando Prestable no se puede introducir
        boolean recurso4 = biblioteca.prestarRecurso(revista);
        //boolean recurso5 = biblioteca.prestarRecurso(tesis, tesis); //Como mapa no está implementando Prestable no se puede introducir

        //boolean recursoDevuelto1 = biblioteca.devolverRecurso(comic, comic);
        //boolean recursoDevuelto2 = biblioteca.devolverRecurso(libro, libro);
        //boolean recursoDevuelto4 = biblioteca.devolverRecurso(revista, revista);
        //Estas operaciones me gener4an un cambia en el atributo prestado, pues se devolvió


        System.out.println(recurso1 + " Lo presta pues está disponible");
        biblioteca.listarPrestados(comic);
        //System.out.println(recursoDevuelto1 + " Se devuelve");
        System.out.println(recurso2 + " Lo presta pues está disponible");
        biblioteca.listarPrestados(libro);
        //System.out.println(recursoDevuelto2 + " Se devuelve");
        System.out.println(recurso4 + " Lo presta pues está disponible");
        biblioteca.listarPrestados(revista);
        //System.out.println(recursoDevuelto4 + " Se devuelve");
    }
}
