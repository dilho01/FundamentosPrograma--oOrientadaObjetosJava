package Enums;

public class istemaIbeg {
    public static void main(String[] args) {
        for(EstadoBrasileiro e: EstadoBrasileiro.values()){
            System.out.println(e.getSigla() + " - " + e.getNome());
        }
        EstadoBrasileiro eb = EstadoBrasileiro.PIAUI;
        System.out.println(eb.getNome());
    }
}
