
package tallerpadel;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<PartidoPadel> lista = new ArrayList<>();
        PartidoPadel p1 = new PartidoPadel("Juan/Pedro", "Carlos/Luis", "6-4, 6-3");
        PartidoPadel p2 = new PartidoPadel("Ana/Maria", "Sofia/Elena", "7-5, 6-2");
        
        lista.add(p1);
        lista.add(p2);

        System.out.println("--- DATOS ORIGINALES ---");
        for (int i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i).toString());
        }

        System.out.println("\n--- PRUEBA ARCHIVO BINARIO ---");
        GestorPadelBinario gBinario = new GestorPadelBinario();
        gBinario.guardarPartidos(lista);
        
        ArrayList<PartidoPadel> cargadosBinario = gBinario.obtenerPartidos();
        for (int i = 0; i < cargadosBinario.size(); i++) {
            System.out.println(cargadosBinario.get(i).toString());
        }

        System.out.println("\n--- PRUEBA ARCHIVO TEXTO ---");
        GestorPadelTexto gTexto = new GestorPadelTexto();
        gTexto.guardarPartidos(lista);
        
        ArrayList<PartidoPadel> cargadosTexto = gTexto.obtenerPartidos();
        for (int i = 0; i < cargadosTexto.size(); i++) {
            System.out.println(cargadosTexto.get(i).toString());
        }
    }
}
    
