import java.util.ArrayList;
import java.util.List;

public class Tienda {

    private List<Producto> catalogoProductos;
    private Muebles catalogoMuebles;
    private ProdcInformaticos catalogoInformaticos;

    public Tienda(Muebles catalogoMuebles, ProdcInformaticos catalogoInformaticos) {
        this.catalogoProductos = new ArrayList<>();
        this.catalogoMuebles = catalogoMuebles;
        this.catalogoInformaticos = catalogoInformaticos;
    }

    public List<Producto> getCatalogoProductos() {
        return catalogoProductos;
    }

    public void setCatalogoProductos(List<Producto> catalogoProductos) {
        this.catalogoProductos = catalogoProductos;
    }

    public Muebles getCatalogoMuebles() {
        return catalogoMuebles;
    }

    public void setCatalogoMuebles(Muebles catalogoMuebles) {
        this.catalogoMuebles = catalogoMuebles;
    }

    public ProdcInformaticos getCatalogoInformaticos() {
        return catalogoInformaticos;
    }

    public void setCatalogoInformaticos(ProdcInformaticos catalogoInformaticos) {
        this.catalogoInformaticos = catalogoInformaticos;
    }

    public void agregarProducto(Producto producto){
        this.catalogoProductos.add(producto);
    }

    public void verCatalogo(){
        for(int i = 0; i<this.catalogoProductos.size();i++){
            if(this.catalogoProductos.get(i) instanceof Silla) {
                System.out.println("Silla: ");
                System.out.println(this.catalogoProductos.get(i).toString());
            }else if(this.catalogoProductos.get(i) instanceof Escritorio) {
                System.out.println("Escritorio: ");
                System.out.println(this.catalogoProductos.get(i).toString());
            }else if(this.catalogoProductos.get(i) instanceof Impresora) {
                System.out.println("Impresora: ");
                System.out.println(this.catalogoProductos.get(i).toString());
            }else if(this.catalogoProductos.get(i) instanceof NoteBook) {
                System.out.println("Notebook: ");
                System.out.println(this.catalogoProductos.get(i).toString());
            }
        }
    }

    public void aplicarInflacion(){
        for(int i = 0; i<this.catalogoProductos.size();i++){
            if(this.catalogoProductos.get(i) instanceof Silla) {
                ((Silla) this.catalogoProductos.get(i)).aumentoPorInflacion();
            }else if(this.catalogoProductos.get(i) instanceof Escritorio) {
                ((Escritorio) this.catalogoProductos.get(i)).aumentoPorInflacion();
            }else if(this.catalogoProductos.get(i) instanceof Impresora) {
                ((Impresora) this.catalogoProductos.get(i)).aumentoPorInflacion();
            }else if(this.catalogoProductos.get(i) instanceof NoteBook) {
                ((NoteBook) this.catalogoProductos.get(i)).aumentoPorInflacion();
            }
        }
    }
}
