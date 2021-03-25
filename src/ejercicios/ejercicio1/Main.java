package ejercicios.ejercicio1;

public class Main {
    public static void main(String[] args) {
        Persona p1 = new Persona("Persona 1",41123123);
        Persona p2 = new Persona("Persona 2",41123127);
        Persona p3 = new Persona("Persona 3",41123122);
        Persona personas[] =  {p1,p2,p3};

        Celular c1 = new Celular(12345672,"Cel 1");
        Celular c2 = new Celular(12345671,"Cel 2");
        Celular c3 = new Celular(12345673,"Cel 3");
        Celular celulares[] = {c1,c2,c3};

        SortUtil.ordenar(personas);
        SortUtil.ordenar(celulares);

        for (Persona p: personas) {
            System.out.println(p.getNombre());
        }

        for (Celular c: celulares) {
            System.out.println(c.getTitular());
        }


    }

}
