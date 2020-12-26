package cl.utem.taller7;

import cl.utem.taller7.Factura;

public class Main {
    public static void main (String [ ] args) {
        Factura factura1= new Factura (1,"20.123.051-9",20201220,"Matias Machuca" );

        factura1.agregaLinea(4,"Disco",500);
        factura1.agregaLinea(3,"yoghurt",900);
        factura1.agregaLinea(5,"Cereal",3000);
        factura1.agregaLinea(3,"Soya",1500);
        factura1.agregaLinea(1,"Helado",3500);
        factura1.agregaLinea(4,"Vodka",5000);
        factura1.agregaLinea(3,"Cigarros",2000);


        factura1.ver();

        Factura factura2= new Factura (2,"7.957.928-9",20201217,"Chayanne Gonzales" );

        factura2.agregaLinea(2,"Carne",8500);
        factura2.agregaLinea(2,"Melones",900);
        factura2.agregaLinea(1,"Helado",3500);
        factura2.agregaLinea(2,"Pizza",5100);
        factura2.agregaLinea(3,"Donas",2500);
        factura2.ver();

        Factura factura3= new Factura (3,"8.700.660-3",20201219,"Luis Miguel Pacheco" );

        factura3.agregaLinea(4,"Disco",500);
        factura3.agregaLinea(3,"yoghurt",900);
        factura3.agregaLinea(5,"Cereal",3000);
        factura3.agregaLinea(2,"Alcohol",9800);
        factura3.agregaLinea(2,"Durex",4100);
        factura3.ver();

        Factura factura4= new Factura (4,"20.163.208-3",20201220,"Americo Vespucio" );

        factura4.agregaLinea(4,"Disco",500);
        factura4.agregaLinea(3,"yoghurt",900);
        factura4.agregaLinea(5,"Cereal",3000);
        factura4.ver();

        Factura factura5= new Factura (5,"20.547.208-3",20201220,"Jefrey Guiligan" );

        factura5.agregaLinea(4,"Pan     ",500);
        factura5.agregaLinea(3,"Soya",1500);
        factura5.agregaLinea(3,"Arroz",1000);
        factura5.ver();

        Factura factura6= new Factura (6,"19.568.632-9",20201225,"Jordan Ignacio" );

        factura6.agregaLinea(4,"Vodka",5000);
        factura6.agregaLinea(3,"Ron",4500);
        factura6.agregaLinea(3,"Pisco",6800);
        factura6.ver();

        Factura factura7= new Factura (7,"14.332.659-1",20201225,"Carlitos Gamer" );

        factura7.agregaLinea(3,"Cigarros",2000);
        factura7.ver();

        Factura factura8= new Factura (8,"19.568.632-9",20201225,"Esteban Kito" );

        factura8.agregaLinea(2,"Porotos",800);
        factura8.ver();

        Factura factura9= new Factura(9,"17.669.632-9",20201225,"Cristopher Pinochet Allende" );

        factura9.agregaLinea(4,"Arroz",550);
        factura9.ver();

        Factura factura10= new Factura(10,"8.654.958-4",20201226,"Augusto Allende");

        factura10.agregaLinea(5,"Vinos",3500);
        factura10.ver();
    }
}
