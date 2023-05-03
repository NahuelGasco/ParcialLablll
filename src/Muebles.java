import java.util.ArrayList;
import java.util.List;

public class Muebles {

    private List<Silla> sillas;
    private List<Escritorio> escritorios;

    public Muebles() {
        this.sillas = new ArrayList<>();
        this.escritorios = new ArrayList<>();
    }

    public List<Silla> getSillas() {
        return sillas;
    }

    public void setSillas(List<Silla> sillas) {
        this.sillas = sillas;
    }

    public List<Escritorio> getEscritorios() {
        return escritorios;
    }

    public void setEscritorios(List<Escritorio> escritorios) {
        this.escritorios = escritorios;
    }

    public void agregarSilla(Silla silla){
        this.sillas.add(silla);
    }

    public void agregarEscritorio(Escritorio escritorio){
        this.escritorios.add(escritorio);
    }

    public void verSillas (){
        for(int i = 0; i<this.sillas.size(); i++){
            System.out.println(this.sillas.get(i).toString());
        }
    }

    public void verEscritorios (){
        for(int i = 0; i<this.escritorios.size(); i++){
            System.out.println(this.escritorios.get(i).toString());
        }
    }

}
