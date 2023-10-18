package Interface.Equipamentos.Multifucionl;

import Interface.Equipamentos.Copiadora.Copiadora;
import Interface.Equipamentos.Digitadora.Digitalizadora;
import Interface.Equipamentos.Impresora.Impresora;

public class EquipamentoMultiFunsinal implements Copiadora, Digitalizadora,Impresora {
    public void copiar(){
        System.out.println("Copiando via equipamento multifuncinal");
    }
    public void digitalizar(){
    System.out.println("Digitando via equipamento multifuncinal");
    }
    public void imprimir(){
    System.out.println("Imprimindo via equipamento multifuncinal");
    }
}
