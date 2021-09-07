import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CelularXiaomiTest {

    @Test
    void testeClone() {
        CelularModelo2525 CelularModelo2626 = new CelularModelo2525();
        CelularXiaomi CelularModelo2626Clone = CelularModelo2626.clonar();
        CelularModelo2626Clone.setValorVenda(1000);
        CelularModelo2626Clone.infoCelular();
        assertEquals("O celular possui tela 7,5 polegadas e custa 1000.0", CelularModelo2626Clone.infoCelular());
       // assertEquals(1890.0, CelularModelo2626Clone.getValorVenda());
    }

    @Test
    void testeClone2() {
        CelularModelo3535 CelularModelo3626 = new CelularModelo3535();
        CelularXiaomi CelularModelo3636Clone =  CelularModelo3626.clonar();
        CelularModelo3636Clone.setValorVenda(1500);
        CelularModelo3636Clone.infoCelular();
        assertEquals("O Celular possui tela 7 polegadas e custa 1500.0", CelularModelo3636Clone.infoCelular());

    }
}