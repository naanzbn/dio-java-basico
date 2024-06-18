package OutroExemplo.multifuncional;

import OutroExemplo.equipamentos.copiadora.Copiadora;
import OutroExemplo.equipamentos.digitalizadora.Digitalizadora;
import OutroExemplo.equipamentos.impressora.Impressora;


public class EquipamentoMultifuncional implements Digitalizadora, Copiadora, Impressora{
    public void copiar() {
        System.out.println("COPIANDO VIA EQUIPAMENTO MULTIFUNCIONAL");
    }
    public void digitalizar() {
        System.out.println("DIGITALIZANDO VIA EQUIPAMENTO MULTIFUNCIONAL");
    }
    public void imprimir() {
        System.out.println("IMPRIMINDO VIA EQUIPAMENTO MULTIFUNCIONAL");
        
    }
    
}

// não permite: public class EquipamentoMultifuncional extends Impressora extends Copiadora {}