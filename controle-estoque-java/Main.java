import java.util.Scanner;

class Produto {
    String nome;
    double preco;
    int quantidade;

    void exibirAntes() {
        System.out.println("Produto: " + nome);
        System.out.printf("Preço: R$ %.2f\n", preco);
        System.out.println("Estoque antes da venda: " + quantidade + " unidades");
    }

    void vender(int quantidadeVendida) {
        if (quantidadeVendida > quantidade) {
            System.out.println("Estoque insuficiente para realizar a venda.");
        } else {
            quantidade -= quantidadeVendida;
            System.out.println("Venda realizada: " + quantidadeVendida + " unidades");
        }
    }

    void exibirDepois() {
        System.out.println("Estoque atualizado: " + quantidade + " unidades");
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Produto p = new Produto();

        System.out.print("Nome do produto: ");
        p.nome = sc.nextLine();

        System.out.print("Preço: ");
        p.preco = sc.nextDouble();

        System.out.print("Quantidade em estoque: ");
        p.quantidade = sc.nextInt();

        System.out.print("Quantidade vendida: ");
        int venda = sc.nextInt();

        System.out.println();

        p.exibirAntes();
        p.vender(venda);
        p.exibirDepois();

        sc.close();
    }
}