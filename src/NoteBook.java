public class NoteBook extends Producto implements iModiPrecios{

    private int memoriaGB;
    private String fabricante;

    public NoteBook(int stock, String nombre, int precio, int memoria) {
        super(stock, nombre, precio);
        this.memoriaGB = memoria;
        this.fabricante = "HP";
    }

    public int getMemoriaGB() {
        return memoriaGB;
    }

    public void setMemoriaGB(int memoriaGB) {
        this.memoriaGB = memoriaGB;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    @Override
    public String toString() {
        return  "memoriaGB=" + memoriaGB +
                ", fabricante='" + fabricante + '\'' +
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
        this.precio += (this.precio*20)/100;
    }
}
