import java.util.Scanner;

public class main {
    public main() {
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int contador = 0;
        int salarioSoma = 0;
        int maiorSalario = 0;
        double mediaSalario = 0.0;
        double mediaFilhos = 0.0;
        double somaFilhos = 0.0;
        System.out.println("Número de participantes da entrevista: ");

        for(int habitantes = scanner.nextInt(); contador < habitantes; ++contador) {
            System.out.println("Digite seu salario: ");
            int salario = scanner.nextInt();
            salarioSoma += salario;
            System.out.println("Informe o número de filhos: ");
            int filhos = scanner.nextInt();
            somaFilhos += (double)filhos;
            if (salario > maiorSalario) {
                maiorSalario = salario;
            }
        }

        mediaSalario = (double)(salarioSoma / contador);
        mediaFilhos = somaFilhos / (double)contador;
        System.out.println("Media salarial entre os Habitantes = R$ " + mediaSalario);
        System.out.println("Media de filhos entre os Habitantes = " + mediaFilhos);
        System.out.println("Maior Salário entre os Habitantes = R$ " + maiorSalario);
    }
}