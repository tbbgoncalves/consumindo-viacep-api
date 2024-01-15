package principal;

import java.util.Scanner;

import controllers.*;
import utils.CepValidator;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SearchController searchController = new SearchController();

        try {
            //solicita o CEP ao usuário e valida
            System.out.println("Digite o CEP para ser buscado:");
            String cep = CepValidator.validate(scanner.nextLine());

            //realiza a busca e imprime na tela
            System.out.println(searchController.search(cep));

            //serializa o endereço e salva o JSON em arquivo
            searchController.save();
        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}