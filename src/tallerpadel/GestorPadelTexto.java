
package tallerpadel;
import java.io.*;
import java.util.ArrayList;

public class GestorPadelTexto {
    public void guardarPartidos(ArrayList<PartidoPadel> lista) {
        try {
            FileWriter fw = new FileWriter("partidos.txt");
            PrintWriter pw = new PrintWriter(fw);
            
            for (int i = 0; i < lista.size(); i++) {
                String linea = String.format("%s;%s;%s", 
                        lista.get(i).obtenerPareja1(), 
                        lista.get(i).obtenerPareja2(), 
                        lista.get(i).obtenerMarcador());
                pw.println(linea);
            }
            
            pw.close();
            fw.close();
            System.out.println("Guardado en texto (.txt) listo.");
        } catch (Exception e) {
            System.out.println("Error al guardar texto: " + e.getMessage());
        }
    }

    public ArrayList<PartidoPadel> obtenerPartidos() {
        ArrayList<PartidoPadel> lista = new ArrayList<>();
        try {
            FileReader fr = new FileReader("partidos.txt");
            BufferedReader br = new BufferedReader(fr);
            
            String linea = br.readLine();
            while (linea != null) {
                String[] partes = linea.split(";");
                PartidoPadel p = new PartidoPadel(partes[0], partes[1], partes[2]);
                lista.add(p);
                
                linea = br.readLine();
            }
            
            br.close();
            fr.close();
            System.out.println("Cargado desde texto (.txt) listo.");
        } catch (Exception e) {
            System.out.println("El archivo de texto aún no existe o está vacío.");
        }
        return lista;
    }
}

