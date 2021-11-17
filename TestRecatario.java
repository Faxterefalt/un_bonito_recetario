
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.*;
/**
 * The test class TestRecatario.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class TestRecatario
{
    /**
     * Default constructor for test class TestRecatario
     */
    public TestRecatario()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @BeforeEach
    public void setUp()
    {
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @AfterEach
    public void tearDown()
    {
    }
    //reconocer la cantidad de ingredientes en total
    @Test
    public void testDevolverCantIngredientes() {
        Receta receta =new Receta("ni idea");
        receta.setIngredientes(2.5, "litros"," de agua");  
        receta.setIngredientes(8,"tomates");
        receta.setIngredientes(1.0,"manojo", "de perejil");
        assertEquals(3,receta.getcantIngredientes());
    }
    @Test
    public void testDevolverCantIngredientes2() {
        Receta receta =new Receta("ni idea otra vez");
        receta.setIngredientes(1.3, "litros", "de agua");  
        receta.setIngredientes(5,"duraznos");
        receta.setIngredientes(4.0, "kilos", "de chorizo");
        receta.setIngredientes(13,"sandías");
        receta.setIngredientes(7,"ajos");
        receta.setIngredientes(9.5, "tazas", "de café");
        assertEquals(6,receta.getcantIngredientes());
    }
    @Test
    public void testDevolverIngredientes(){
        Receta receta = new Receta();
        receta.getIngredientes();
        
    }
}
