/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividadetriangulo;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author Felipe Pedreli
 */
public class Triangulo {
    private double a;
    private double b;
    private double c;

    public Triangulo(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }
    
    public double getHipotenusa(){
        double hipotenusa = a;
        if (hipotenusa < b) {
            hipotenusa = b;
        }
        if (hipotenusa < c) {
            hipotenusa = c;
        }
        
        return hipotenusa;
    }
    
    public Set<String> getPropriedades(){
        Set<String> propriedades = new HashSet<String>();
       
        if ((a + b + c - getHipotenusa()) > getHipotenusa()) {
            propriedades.add("Válido");
            if (a == b || b == c || c == a) {
                if (a == b && b == c) {
                    propriedades.add("Equilátero");
                } else {
                    propriedades.add("Isósceles");
                }
            }
            if (a != b && b != c && c != a) {
                propriedades.add("Escaleno");
            }
            if (((a * a + b * b + c * c) - getHipotenusa() * getHipotenusa()) == getHipotenusa()
                    * getHipotenusa()) {
                propriedades.add("Retângulo");
            }
        } else {
            propriedades.add("Inválido");
        }
        return propriedades;
    }
}
