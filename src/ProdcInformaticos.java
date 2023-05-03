import java.util.ArrayList;
import java.util.List;

public class ProdcInformaticos {

    private List<Impresora> impresoras;
    private List<NoteBook>   noteBooks;

    public ProdcInformaticos() {
        this.impresoras = new ArrayList<>();
        this.noteBooks = new ArrayList<>();
    }

    public List<Impresora> getImpresoras() {
        return impresoras;
    }

    public void setImpresoras(List<Impresora> impresoras) {
        this.impresoras = impresoras;
    }

    public List<NoteBook> getNoteBooks() {
        return noteBooks;
    }

    public void setNoteBooks(List<NoteBook> noteBooks) {
        this.noteBooks = noteBooks;
    }

    public void agregarImpresora(Impresora impresora){
        this.impresoras.add(impresora);
    }

    public void agregarNotebook(NoteBook noteBook){
        this.noteBooks.add(noteBook);
    }

    public void verImpresoras (){
        for(int i = 0; i<this.impresoras.size(); i++){
            System.out.println(this.impresoras.get(i).toString());
        }
    }

    public void verNotebooks (){
        for(int i = 0; i<this.noteBooks.size(); i++){
            System.out.println(this.noteBooks.get(i).toString());
        }
    }

}
