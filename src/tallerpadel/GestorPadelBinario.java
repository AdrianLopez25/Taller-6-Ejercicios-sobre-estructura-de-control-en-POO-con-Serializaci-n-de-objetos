
package tallerpadel;
import java.io.*;
import java.util.ArrayList;

public class GestorPadelBinario {
    public void guardarPartidos(ArrayList<PartidoPadel> lista) {
        try {
            FileOutputStream fos = new FileOutputStream("partidos.dat");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            
            oos.writeObject(lista);
            
            oos.close();
            fos.close();
            System.out.println("Guardado en binario (.dat) listo.");
        } catch (Exception e) {
            System.out.println("Error al guardar: " + e.getMessage());
        }
    }

    public ArrayList<PartidoPadel> obtenerPartidos() {
        ArrayList<PartidoPadel> lista = new ArrayList<>();
        try {
            FileInputStream fis = new FileInputStream("partidos.dat");
            ObjectInputStream ois = new ObjectInputStream(fis);
            
            lista = (ArrayList<PartidoPadel>) ois.readObject();
            
            ois.close();
            fis.close();
            System.out.println("Cargado desde binario (.dat) listo.");
        } catch (Exception e) {
            System.out.println("El archivo binario aún no existe o está vacío.");
        }
        return lista;
    }
}
    
