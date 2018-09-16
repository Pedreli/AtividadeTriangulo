/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import atividadetriangulo.Triangulo;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Felipe Pedreli
 */
public class TrianguloTest {
    
    public TrianguloTest() {
    }
    
    @Test
    public void TestTrianguloEquilatero() {
        Triangulo t = new Triangulo(5, 5, 5);
        int i = 1;
        
        for (String propriedade : t.getPropriedades()) {
            if (i == 1){
                assertEquals("Válidos", propriedade);
            }else if (i == 2){
                assertEquals("Equilátero", propriedade);
            }
            
            i ++;
        }
    }
}
