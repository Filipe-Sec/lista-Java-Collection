import java.util.ArrayList;

public class questao3 {
    public static void main(String[] args) {
        ArrayList<Object> frutas = new ArrayList<>();

        frutas.add("maçã");
        frutas.add("banana");
        frutas.add("laranja");
        frutas.add("abacaxi");

        if (frutas.contains("banana")) {
            int index = frutas.indexOf("banana");
            System.out.println("A fruta 'banana' está no índice: " + index);
        } else {
            System.out.println("A fruta 'banana' não foi encontrada na lista.");
        }

    }
}
