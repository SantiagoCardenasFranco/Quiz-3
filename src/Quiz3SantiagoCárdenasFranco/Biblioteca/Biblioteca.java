package Quiz3SantiagoCárdenasFranco.Biblioteca;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    private ArrayList<Recurso> recursos;

    public Biblioteca() {
        this.recursos = new ArrayList<>();
    }

    public ArrayList<Recurso> getRecursos() {
        return recursos;
    }

    public void setRecursos(ArrayList<Recurso> recursos) {
        this.recursos = recursos;
    }

    public void addRecurso(Recurso r)
    {
        if(r instanceof Recurso)
        {
            this.recursos.add(r);
        }
    }

    public boolean prestarRecurso(Prestable p) {
        if(p instanceof Prestable)
        {
            p.prestar();
            return true;
        }
        else {
            return false;
        }
    }
    //Esta otra forma la implementé, saber si el recurso estaba prestado y luego retornar el boolean
    /*public boolean prestarRecurso(Prestable p, Recurso, recurso) {
        if(p instanceof Prestable && recurso.isPresrado() == false)
        {
            p.prestar();
            return true;
        }
        else {
            return false;
        }
    }*/

    public boolean devolverRecurso(Prestable p) {
        if(p != null)
        {
            p.devolver();
            return true;
        }
        else {
            return false;
        }
    }
    //Esta otra forma la implementé, saber si el recurso estaba prestado y luego retornar el boolean
    /*public boolean devolverRecurso(Prestable p, Recurso recurso) {
        if(p != null && recurso.isPrestado())
        {
            p.devolver();
            return true;
        }
        else {
            return false;
        }
    }*/

    public void listarPrestados(Recurso recursoPrestado)
    {
        ArrayList<Recurso> recursosPrestados = new ArrayList<>();
        boolean existente = recursos.stream().anyMatch(r -> r.isPrestado() == recursoPrestado.isPrestado());
        //boolean existente1 = recursos.stream().filter(r -> r.prestado == recursoPrestado.prestado).findAny().isPresent();
        //El anyMatch java me lo sugirió
        if(!existente || recursoPrestado.isPrestado() == true)
        {
            recursosPrestados.add(recursoPrestado);
            System.out.println(recursoPrestado);
        }
    }
}
