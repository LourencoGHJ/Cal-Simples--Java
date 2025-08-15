package Calc;

import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite o primeiro número:");
        double num1 = input.nextDouble();

        System.out.println("Digite o segundo número:");
        double num2 = input.nextDouble();

        System.out.println("Escolha a operação (+, -, *, /):");
        char operacao = input.next().charAt(0);

        double resultado;

        switch (operacao) {
            case '+':
                resultado = num1 + num2;
                break;
            case '-':
                resultado = num1 - num2;
                break;
            case '*':
                resultado = num1 * num2;
                break;
            case '/':
                if (num2 != 0) {
                    resultado = num1 / num2;
                } else {
                    System.out.println("Erro: divisão por zero!");
                    input.close();
                    return;
                }
                break;
            default:
                System.out.println("Operação inválida!");
                input.close();
                return;
        }

        System.out.println("Resultado: " + resultado);
        input.close();
    }
}
