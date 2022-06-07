package Package_Clases;

public class SombreroB {
    private int idSombrero = 257;
    private String color = "Rojo";
    private String modelo = "Panama";
    private int talla = 9;

    //MÉTODOS
    public void descolgar() { System.out.println("El sombrero ha sido descolgado"); }
    public void Poner() { System.out.println("El sombrero está puesto en la cabeza de su dueño"); }
    public void Quitar() { System.out.println("El sombrero ha sido quitado de la cabeza de su dueño"); }
    public void Limpiar() { System.out.println("El sombrero ha sido limpiado"); }
    public void Colgar() { System.out.println("El sombrero ha sido colgado"); }

    //RETORNAR ATRIBUTOS
    public int getIdSombrero() {
        return idSombrero;
    }
    public String getColor() {
        return color;
    }
    public String getModelo() {
        return modelo;
    }
    public int getTalla() {
        return talla;
    }
}
