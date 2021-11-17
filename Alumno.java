public class Alumno
{
    private String nom;
    private int matri;
    private char grup;
    private int grado;
    public Alumno(){
    nom="";
    matri=0;
    grup=' ';
    grado=0;
    
    }
    
    public Alumno(String n, int m, char g, int gr){
    nom=n;
    matri=m;
    grup=g;
    grado=gr;
    
    
    
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public void setNombre(String n){
    nom=n;
    }
    public void setMatrícula(int m){
    matri=m;
    }
    public void setGrup(char g){
    grup=g;
    }
    public void setGrado(int gr){
    grado=gr;
    }
    public String getNombre(){
    return nom;
    }
    public int getMatrícula(){
    return matri;
    }
    public char getGrup(){
    return grup;
    }
    public int getGrado(){
    return grado;
    }
}
