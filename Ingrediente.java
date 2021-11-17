public class Ingrediente
{
    private String nombre, unidad;
    private double cantidad;
    private int cantidad2;
    public Ingrediente(){

    }
    public Ingrediente(int cantidad2,String nombre){
        this.cantidad2=cantidad2;
        this.nombre=nombre;
    }
    
    public Ingrediente(double cantidad,String unidad, String nombre){
        this.nombre=nombre;
        this.unidad=unidad;
        this.cantidad=cantidad;
    }

}






