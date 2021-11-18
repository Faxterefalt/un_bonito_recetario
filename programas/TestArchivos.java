package programas;



import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.io.IOException;

public class TestArchivos
{
    
    public TestArchivos()
    {
    }
    @BeforeEach
    public void setUp()
    {
    }
   
    @Test
    public void testExistenciaDeArchivo(){
        Archivo miArchivo = new Archivo();
        assertEquals(false,miArchivo.Existencia());
    }

    
}
