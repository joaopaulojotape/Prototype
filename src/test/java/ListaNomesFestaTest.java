import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.Assert.*;

public class ListaNomesFestaTest {

    @Test
    void testarNovosNomes() throws CloneNotSupportedException {
        ListaNomesFesta nm = new ListaNomesFesta();
        nm.convidados();
        ListaNomesFesta nomeAdd = (ListaNomesFesta) nm.clone();
        List<String> list = nomeAdd.novosNomes();
        list.add("Joaõ");
        list.add("Paulo");
        list.add("Carol");
        assertEquals(list, nomeAdd.novosNomes());
    }


}