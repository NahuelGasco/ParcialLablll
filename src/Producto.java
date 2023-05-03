abstract public class Producto {

    protected int stock;
    protected String nombre;
    protected int precio;

    public Producto(int stock, String nombre, int precio) {
        this.stock = stock;
        this.nombre = nombre;
        this.precio = precio;
    }
}
