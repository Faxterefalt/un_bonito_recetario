import java.util.*;
public class Receta{
    String título;
    ArrayList<Ingrediente> ingredientes;
    
     public Receta(String título){
        this.título=título;
        ingredientes=new ArrayList<Ingrediente>();
    }
    //sólo para verificar que el ingrediente se encuentra
    //no hay mucha ciencia
    //
    public boolean setIngredientes(double cantidad, String unidad, String nombre){
        Ingrediente nuevoIngre=new Ingrediente(cantidad,unidad,nombre);
        return ingredientes.add(nuevoIngre);
    }
    public void setIngredientes(int cantidad, String nombre){
        Ingrediente nuevoIngre2=new Ingrediente(cantidad,nombre);
        ingredientes.add(nuevoIngre2);
    }
    public int getcantIngredientes(){
        int tamaño=ingredientes.size();
        return tamaño;
    }
  
     
}














