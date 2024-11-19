import java.util.ArrayList;

public class questao2 {
    public static void main(String[] args) {
        ArrayList<Object> numeros = new ArrayList<>();

        numeros.add(10);
        numeros.add(20);
        numeros.add(30);
        numeros.add(40);
        numeros.add(50);

        numeros.remove(Integer.valueOf(30));

        for (Object numero : numeros) {
            System.out.println(numero);
        }
    }
}