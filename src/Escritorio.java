public class Escritorio extends Producto implements iModiPrecios{

    private int alto;
    private int ancho;

    public Escritorio(int stock, String nombre, int precio, int alto, int ancho) {
        super(stock, nombre, precio);
        this.alto = alto;
        this.ancho = ancho;
    }

    public int getAlto() {
        return alto;
    }

    public void setAlto(int alto) {
        this.alto = alto;
    }

    public int getAncho() {
        return ancho;
    }

    public void setAncho(int ancho) {
        this.ancho = ancho;
    }

    @Override
    public String toString() {
        return  "alto=" + alto +
                ", ancho=" + ancho +
                ", stock=" + stock +
                ", nombre='" + nombre + '\'' +
                ", precio=" + precio +
                '}';
    }

    @Override
    public float descuento(int porciento) {
        return 0;
    }

    @Override
    public void aumentoPorInflacion() {
        this.precio += (this.precio*10)/100;
    }
}
