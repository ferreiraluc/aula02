import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        List<Endereco> enderecos = new ArrayList<>();
        Pessoa lucas = new Pessoa("lucas", 25, enderecos);
        List<Pessoa> pessoas = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        for(int i=0; i<3; i++){
            System.out.println("Digite o nome: ");
            pessoas.add(new Pessoa(scanner.next(), scanner.nextInt(), enderecos));
        }

        for(int i=0; i<pessoas.size(); i++){
            System.out.println((pessoas.get(i).getNome()));
        }

        List<Pessoa> pessoas1 = new ArrayList<>();
        List<Endereco> enderecos1 = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        for(int i=0; i<2; i++){
            String nome = sc.next();
            int idade = sc.nextInt();
            int qtdEndereco = sc.nextInt();
            for(int j=0; j<qtdEndereco; j++){
                enderecos.add(new Endereco(sc.next(), sc.nextInt()));
            }
            pessoas.add(new Pessoa(nome, idade, enderecos));
            enderecos.clear();
        }

        List<Pessoa> pessoas2 = new ArrayList<>();
        List<Endereco> enderecos2 = new ArrayList<>();
        Endereco end1 = new Endereco("rua1", 1);
        Endereco end2 = new Endereco("rua2", 2);
        enderecos2.add(end1); enderecos2.add(end2);
        pessoas2.add(new Pessoa("will", 32, enderecos2));





//        for(Pessoa x:pessoas){
  //          System.out.println(x.getNome());
    //    }


    }
}