import java.util.Scanner;
public class Principal
{
    
    public static void main(String[] args){
    Scanner leer =new Scanner(System.in);
    Alumno alumno[]=new Alumno[2];
    /*
    alumno[0].setMatrícula(12);
    alumno[0].setNombre("chupapinga");
    alumno[0].setGrup('A');
    alumno[0].setGrado(2014);
    */
    String nombre="";
    int matri=0;
    char grup=' ';
    int grado=0;
    for(int i=0; i<alumno.length;i++){
    System.out.println("name:");
    nombre=leer.nextLine();
    System.out.println("matri:");
    matri=leer.nextInt();
    System.out.println("grad:");
    grado=leer.nextInt();
    System.out.println("group:");
    grup=leer.next().charAt(0);
    leer.nextLine();
    //a[]
    alumno[i]=new Alumno(nombre, matri,grup,grado);
    }
    for(int i=0; i<alumno.length;i++){
    System.out.println(alumno[i].getNombre()+" "+
    alumno[i].getMatrícula()+" "+alumno[i].getGrup()+" "+alumno[i].getGrado());
    
    }
    }
}
