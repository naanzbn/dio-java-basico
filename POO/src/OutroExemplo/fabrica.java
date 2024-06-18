package OutroExemplo;

import OutroExemplo.equipamentos.copiadora.Copiadora;
import OutroExemplo.equipamentos.digitalizadora.Digitalizadora;
import OutroExemplo.equipamentos.impressora.Deskjet;
import OutroExemplo.equipamentos.impressora.Impressora;
import OutroExemplo.equipamentos.impressora.Laserjet;
import OutroExemplo.multifuncional.EquipamentoMultifuncional;

public class fabrica {
    public static void main(String[] args) {
        EquipamentoMultifuncional em = new EquipamentoMultifuncional();
        
        Impressora impressora = em;
        Digitalizadora digitalizadora = em;
        Copiadora copiadora = em;

        impressora.imprimir();
        digitalizadora.digitalizar();
        copiadora.copiar();
    }
}
