package Interface.Estabelesimento;

import Interface.Equipamentos.Copiadora.Copiadora;
import Interface.Equipamentos.Digitadora.Digitalizadora;
import Interface.Equipamentos.Impresora.Impresora;
import Interface.Equipamentos.Multifucionl.EquipamentoMultiFunsinal;

public class Fabrica {
    public static void main(String[] args) {

        EquipamentoMultiFunsinal em = new EquipamentoMultiFunsinal();
        Impresora impresora = em;
        Digitalizadora digitalizadora = em;
        Copiadora copiadora = em;
        impresora.imprimir();
        copiadora.copiar();
        digitalizadora.digitalizar();
    }
}
