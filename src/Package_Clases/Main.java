//Nombre: Hanna Ximena Anaya Martínez
//Matrícula:010341153
//Fecha: 18/05/2022

package Package_Clases;

public class Main {
    public static void main(String[] args) {
        SombreroA a = new SombreroA();

        System.out.println("IdSombrero: " + a.getIdSombrero());
        System.out.println("Color: " + a.getColor());
        System.out.println("Modelo: " + a.getModelo());
        System.out.println("Talla: " + a.getTalla());

        a.Colgar();
        a.descolgar();
        a.Limpiar();
        a.Poner();
        a.Quitar();

        SombreroB b = new SombreroB();

        System.out.println("IdSombrero: " + b.getIdSombrero());
        System.out.println("Color: " + b.getColor());
        System.out.println("Modelo: " + b.getModelo());
        System.out.println("Talla: " + a.getTalla());

        b.Colgar();
        b.descolgar();
        b.Limpiar();
        b.Poner();
        b.Quitar();

        SombreroC c = new SombreroC();

        System.out.println("IdSombrero: " + c.getIdSombrero());
        System.out.println("Color: " + c.getColor());
        System.out.println("Modelo: " + c.getModelo());
        System.out.println("Talla: " + c.getTalla());

        c.Colgar();
        c.descolgar();
        c.Limpiar();
        c.Poner();
        c.Quitar();
    }
}