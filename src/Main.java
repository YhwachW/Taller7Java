import cl.utem.taller7.Factura;

public class Main {
    public static void main (String [ ] args) {
        Factura factura1= new Factura (1,"20.123.051-9",20201220,"Matias Machuca" );

        factura1.agregaLinea(4,"Disco",500);
        factura1.agregaLinea(3,"yoghurt",900);
        factura1.agregaLinea(5,"Cereal",3000);

       // System.out.println(factura1.getTotal());

        factura1.ver();
    }
}
