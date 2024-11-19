import java.util.HashSet;

public class questao6 {
    public static void main(String[] args) {
        HashSet<String> cidades = new HashSet<>();
        cidades.add("Cajazeiras");
        cidades.add("Uírauna");
        cidades.add("São José de Piranhas");
        cidades.add("Sousa");
        cidades.add("Triunfo");

        System.out.println("Lista de cidades:");
        for (String cidade : cidades) {
            System.out.println(cidade);
        }
    }
}