package programas;

import java.io.*; 
import javax.swing.JOptionPane;
public class Archivo{
    private File archivo; 
    public Archivo(){
        archivo =new File("utf-8");
    }
       
    
    public boolean Existencia(){
        return archivo.exists()==true;
    }
    //muchos archivos, (recetas) buscar la receta (recetaEspecífica)
    //
    
    public void CrearyEscribir(){
        PrintWriter escribir;
        File miArchivo= new File("recetaDeEjemplo.txt");
        if(!miArchivo.exists()){
            System.out.println("Archivo creado, ta bien");
            try{
                miArchivo.createNewFile();
            }catch(IOException ex){

            }
        }else{
        System.out.println("El archivo creado ahora tiene contenido.");
        try{
            escribir= new PrintWriter(miArchivo,"utf-8");
            String Título=JOptionPane.showInputDialog(null,"Registra el título de la receta");
            escribir.println(Título);
            escribir.close();
        }catch(IOException e){
            e.printStackTrace(); 
        }
    }
    }
    public void Leer(){
    
    
    
    
    }
}