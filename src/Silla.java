import java.util.Random;

public class Silla extends Producto implements iModiPrecios{

    private boolean ruedas;

    public Silla(int stock, String nombre, int precio) {
        super(stock, nombre, precio);
        this.ruedas = tieneruedas();
    }

    public boolean isRuedas() {
        return ruedas;
    }

    public void setRuedas(boolean ruedas) {
        this.ruedas = ruedas;
    }

    public boolean tieneruedas(){
        Random random = new Random();
        return random.nextBoolean();
    }

    @Override
    public String toString() {
        return "ruedas=" + ruedas +
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
        this.precio += this.precio*5/100;
    }
}
