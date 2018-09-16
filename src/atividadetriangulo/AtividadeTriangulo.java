package atividadetriangulo;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
 
/**
 *
 * @author Felipe Pedreli
 */
public class AtividadeTriangulo {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Informa o tipo do triangulo");
        System.out.println("Informa o valor do lado a");
        double a = sc.nextDouble();
        System.out.println("Informa o valor do lado b");
        double b = sc.nextDouble();
        System.out.println("Informa o valor do lado c");
        double c = sc.nextDouble();

        Triangulo triangulo = new Triangulo(a, b, c);
        
        System.out.println("Propriedades do triangulo ->");
        for (String valor : triangulo.getPropriedades()) {
            System.out.println(valor);

        }

    }

}
