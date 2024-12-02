package application;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Program {
    public static void main(String[] args) {

        // Inicializa um conjunto (Set) do tipo LinkedHashSet.
        // LinkedHashSet mantém a ordem de inserção dos elementos.
        Set<String> set = new LinkedHashSet<>();
        // As seguintes linhas comentadas mostram outras opções de Set:
        // Set<String> set = new TreeSet<>(); // TreeSet mantém os elementos ordenados de acordo com a ordem natural.
        // Set<String> set = new HashSet<>(); // HashSet não garante a ordem dos elementos.

        // Adiciona elementos ao conjunto.
        set.add("Tv");
        set.add("Tablet");
        set.add("Notebook");

        // As seguintes linhas comentadas demonstram operações adicionais que podem ser feitas no conjunto:
        // System.out.println(set.contains("Notebook")); // Verifica se "Notebook" está presente no conjunto.
        // set.remove("Tablet"); // Remove "Tablet" do conjunto.
        // set.removeIf(x -> x.length() >= 3); // Remove elementos cujo comprimento é maior ou igual a 3.

        // Remove elementos do conjunto que começam com a letra 'T'.
        set.removeIf(x -> x.charAt(0) == 'T');

        // Itera sobre os elementos restantes no conjunto e os imprime.
        for (String p : set) {
            System.out.println(p);
        }
    }
}