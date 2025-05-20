import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class GestortTransporteTest {
    @Test
    public void test1() {

        Colectivo cole = new Colectivo("Ramal U", 45, 1);
        Colectivo cole2 = new Colectivo("Ramal I", 45, 3.5);
        Colectivo cole3 = new Colectivo("Ramal L", 45, 2.4);
        Camion cm = new Camion(300, 50000, "El tito");
        Taxi tz = new Taxi("Master", 300);
        List<Transporte> list = new ArrayList<>();
        list.add(cole);
        list.add(cole2);
        list.add(cole3);
        list.add(cm);
        list.add(tz);
        GestorDeTransportes gt = new GestorDeTransportes(list);
        assertEquals("50306.9", gt.getCostoTotal());
    }


}
