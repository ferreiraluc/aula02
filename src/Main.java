import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        List<Pessoa> pessoas = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));


        String mensagem = "Cadastro de pessoas e endereço";
        String linha = "====================================";
        System.out.println("\n" + linha);
        System.out.println("= " + mensagem + " =");
        System.out.println(linha);
        System.out.println("\nDigite o número de pessoas que deseja cadastrar: ");
        int qtdPessoas = scanner.nextInt();



        // Cadastrar pessoas com n endereços
        for (int i = 0; i < qtdPessoas; i++) {
            System.out.println("Digite o nome: ");
            String nome = reader.readLine();
            System.out.println("Digite a idade: ");
            int idade = scanner.nextInt();
            System.out.println("Digite a quantidade de endereços: ");
            int qtdEndereco = scanner.nextInt();

            List<Endereco> enderecos = new ArrayList<>();
            for (int j = 0; j < qtdEndereco; j++) {
                System.out.println("Digite o endereço:");
                String rua = reader.readLine();
                System.out.println("Digite o número do endereço:");
                int numero = scanner.nextInt();
                enderecos.add(new Endereco(rua, numero));
            }

            pessoas.add(new Pessoa(nome, idade, enderecos));
        }

        // Criar uma lista de pessoas
        for (Pessoa pessoa : pessoas) {
            System.out.println("Nome: " + pessoa.getNome());
            System.out.println("Idade: " + pessoa.getIdade());
            List<Endereco> enderecos = pessoa.getEnderecos();
            System.out.print("Endereço:");
            for (Endereco endereco : enderecos) {
                System.out.print(endereco.getRua() + ", " + endereco.getNumero());
            }
        }

        System.out.println();

        // Buscar uma pessoa pelo nome e imprimir os dados na tela
        System.out.println("Digite o nome da pessoa que deseja buscar: ");
        String nomeBuscado = scanner.next();
        for (Pessoa pessoa : pessoas) {
            if (pessoa.getNome().equalsIgnoreCase(nomeBuscado)) {
                System.out.println("Nome: " + pessoa.getNome());
                System.out.println("Idade: " + pessoa.getIdade());
                List<Endereco> enderecos = pessoa.getEnderecos();
                System.out.print("Endereço:");
                for (Endereco endereco : enderecos) {
                    System.out.print(endereco.getRua() + ", " + endereco.getNumero());
                }
                return;
            }
        }


        System.out.println("Pessoa com o nome " + nomeBuscado + " não encontrada.");
    }
}
