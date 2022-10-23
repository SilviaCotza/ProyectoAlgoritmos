package archivo;

import java.io.*;
import javax.swing.JOptionPane;
public class Archivo {
    File archivo;
    
    public void crearArchivo() {
        try {
            archivo = new File("TableroTareas.txt");
            if (archivo.createNewFile()) {
                JOptionPane.showMessageDialog(null,"Archivo Creado");
            }
        } catch (IOException e) {
            System.out.println(e);
        }

    }
    
    public void escribirEnArchivo(Tablero tablero){
        try{
            FileWriter escritura = new FileWriter(archivo,true);
            escritura.write(tablero.getNombreTablero()+"%"+tablero.getNombreListaTareas()+"%"+tablero.getNombreTarea()+"%"+tablero.getDescripcionTarea()+"%"+tablero.getComentarios()+"%"+tablero.getListaActividades()+"%"+tablero.getActividades()+"\r\n");
            escritura.close();
        }catch(IOException e){
            System.out.println(e);
        }
    }

}
