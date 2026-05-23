
package tallerpadel;
import java.io.Serializable;

public class PartidoPadel implements Serializable {
    private String pareja1;
    private String pareja2;
    private String marcador;

    public PartidoPadel(String p1, String p2, String m) {
        pareja1 = p1;
        pareja2 = p2;
        marcador = m;
    }

    public void establecerPareja1(String p1) {
        pareja1 = p1;
    }

    public void establecerPareja2(String p2) {
        pareja2 = p2;
    }

    public void establecerMarcador(String m) {
        marcador = m;
    }

    public String obtenerPareja1() {
        return pareja1;
    }

    public String obtenerPareja2() {
        return pareja2;
    }

    public String obtenerMarcador() {
        return marcador;
    }

    @Override
    public String toString() {
        String cadena = String.format("%s VS %s | Resultado: %s", 
                obtenerPareja1(), obtenerPareja2(), obtenerMarcador());
        return cadena;
    }
}
    

    

