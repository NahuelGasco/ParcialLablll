public class Main {
    public static void main(String[] args) {

        Muebles muebles = new Muebles();
        ProdcInformaticos informaticos = new ProdcInformaticos();

        Silla silla1 = new Silla(3, "Banqueta", 1500);
        Silla silla2 = new Silla(5, "Gamer", 5000);
        Silla silla3 = new Silla(8, "Reposera", 2000);

        Escritorio escritorio1 = new Escritorio(2, "Gamer", 6000, 110, 70);
        Escritorio escritorio2 = new Escritorio(5, "Estudio", 3000, 100, 80);
        Escritorio escritorio3 = new Escritorio(7, "Clasico", 1500, 100, 60);

        Impresora impresora1 = new Impresora(3, "multifuncion",10000,30);
        Impresora impresora2 = new Impresora(6, "WIFI",10000,15);
        Impresora impresora3 = new Impresora(1, "Clasica",10000,20);

        NoteBook noteBook1 = new NoteBook(5,"Gamer", 40000, 2048);
        NoteBook noteBook2 = new NoteBook(1,"Renderizado", 35000, 1024);
        NoteBook noteBook3 = new NoteBook(4,"Estudio", 20000, 500);

        muebles.agregarSilla(silla1);
        muebles.agregarSilla(silla2);
        muebles.agregarSilla(silla3);

        muebles.agregarEscritorio(escritorio1);
        muebles.agregarEscritorio(escritorio2);
        muebles.agregarEscritorio(escritorio3);

        informaticos.agregarImpresora(impresora1);
        informaticos.agregarImpresora(impresora2);
        informaticos.agregarImpresora(impresora3);

        informaticos.agregarNotebook(noteBook1);
        informaticos.agregarNotebook(noteBook2);
        informaticos.agregarNotebook(noteBook3);

        Tienda tienda = new Tienda(muebles, informaticos);

        tienda.agregarProducto(silla1);
        tienda.agregarProducto(silla2);
        tienda.agregarProducto(silla3);
        tienda.agregarProducto(escritorio1);
        tienda.agregarProducto(escritorio2);
        tienda.agregarProducto(escritorio3);
        tienda.agregarProducto(impresora1);
        tienda.agregarProducto(impresora2);
        tienda.agregarProducto(impresora3);
        tienda.agregarProducto(noteBook1);
        tienda.agregarProducto(noteBook2);
        tienda.agregarProducto(noteBook3);

        tienda.verCatalogo();

        //tienda.getCatalogoMuebles().verSillas();
        //tienda.getCatalogoInformaticos().verImpresoras();

        //PUNTO 4 APLICABLE A SILLA Y A IMPRESORA
        System.out.println();
        System.out.println("Silla "+ silla1.nombre +" con descuento aplicado = " + silla1.descuento(10));
        System.out.println("Impresora "+ impresora2.nombre +" con descuento aplicado = " + impresora2.descuento(20));

        //PUNTO 5
        tienda.aplicarInflacion();
        System.out.println();
        tienda.verCatalogo();
    }
}