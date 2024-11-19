import java.util.ArrayList;
import java.util.Collections;

public class questao4 {
    public static void main(String[] args) {
        ArrayList<Object> numeros = new ArrayList<>();

        numeros.add(50);
        numeros.add(20);
        numeros.add(10);
        numeros.add(40);
        numeros.add(30);

        Collections.sort((ArrayList<Integer>)(Object)numeros);

        System.out.println("Lista ordenada em ordem crescente: " + numeros);



        }
    }
}