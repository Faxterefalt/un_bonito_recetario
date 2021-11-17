
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class RecipesTester
{
    public RecipesTester()
    {
    }

    @BeforeEach
    public void setUp()
    {
    }

    @Test
    public void testAceptarIngredientes(){
        Receta receta = new Receta();
        String[] nuevosIngredientes= {"sal","papa","leche","arroz"};
        boolean report=receta.ingresarIngredientes(nuevosIngredientes);
        assertEquals(true,report);
    }

    @Test
    public void testAceptarIngredientes2(){
       Receta receta=new Receta();
       try{
            boolean report=receta.ingresarIngredientes(null);
            assert fail("por favor ingrese un ingrediente :(");
       }catch(Exception ejem){
        //
        }
    }
}

    
    
    
    
    
    
    
    

