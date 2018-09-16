/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import atividadetriangulo.Triangulo;
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
                assertEquals("Válido", propriedade);
            }else if (i == 2){
                assertEquals("Equilátero", propriedade);
            }
            
            i ++;
        }
    }
    
     @Test
    public void TestTrianguloIsósceles() {
        Triangulo t = new Triangulo(5, 5, 3);
        int i = 1;
        
        for (String propriedade : t.getPropriedades()) {
            if (i == 1){
                assertEquals("Válido", propriedade);
            }else if (i == 2){
                assertEquals("Isósceles", propriedade);
            }
            
            i ++;
        }
    }
    
     @Test
    public void TestTrianguloEscaleno() {
        Triangulo t = new Triangulo(5, 8, 7);
        int i = 1;
        
        // invertido as ordens da propriedade pois o objeto Set trazem ordem diferente 
        for (String propriedade : t.getPropriedades()) {
            if (i == 1){
                assertEquals("Escaleno", propriedade);
            }else if (i == 2){
                assertEquals("Válido", propriedade);
            }
            
            i ++;
        }
    }
    
     @Test
    public void TestTrianguloRetângulo() {
        Triangulo t = new Triangulo(5, 4, 3);
        int i = 1;
        
        // invertido as ordens da propriedade pois o objeto Set trazem ordem diferente 
        for (String propriedade : t.getPropriedades()) {
            if (i == 1){
                assertEquals("Escaleno", propriedade);
            }else if (i == 2){
                assertEquals("Válido", propriedade);
            }else if (i == 3){
                assertEquals("Retângulo", propriedade);
            }
            
            i ++;
        }
    }
}
