public class Impresora extends Producto implements iModiPrecios{

    private int imprXminuto;
    private String fabricante;

    public Impresora(int stock, String nombre, int precio, int impreciones) {
        super(stock, nombre, precio);
        this.imprXminuto = impreciones;
        this.fabricante = "HP";
    }

    public int getImprXminuto() {
        return imprXminuto;
    }

    public void setImprXminuto(int imprXminuto) {
        this.imprXminuto = imprXminuto;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    @Override
    public String toString() {
        return  "imprXminuto=" + imprXminuto +
                ", fabricante='" + fabricante + '\'' +
                ", stock=" + stock +
                ", nombre='" + nombre + '\'' +
                ", precio=" + precio +
                '}';
    }

    @Override
    public float descuento(int porciento) {
        float descuentoAplicado = this.precio*porciento/100;
        descuentoAplicado = this.precio - descuentoAplicado;
        return descuentoAplicado;
    }

    @Override
    public void aumentoPorInflacion() {
        this.precio += this.precio*15/100;
    }
}
