package src;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        List<Pessoa> pessoas = new ArrayList<>();
        pessoas.add(new Pessoa("ana", "feminino"));
        pessoas.add(new Pessoa("joao", "masculino"));
        pessoas.add(new Pessoa("maria", "feminino"));
        pessoas.add(new Pessoa("pedro", "masculino"));
        pessoas.add(new Pessoa("rebeca", "feminino"));

        // imprimir nome + sexo separados por vírgula
        pessoas.forEach(p -> System.out.println(p.getNome() + ", " + p.getSexo()));

        System.out.println("\n--- filtrando mulheres ---");

        // filtrar mulheres com lambda e if/else
        List<Pessoa> mulheres = pessoas.stream()
                .filter(p -> {
                    if (p.getSexo().equalsIgnoreCase("feminino")) {
                        return true;
                    } else {
                        return false;
                    }
                })
                .collect(Collectors.toList());

        mulheres.forEach(m -> System.out.println(m.getNome() + ", " + m.getSexo()));
    }
}
