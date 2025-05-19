package com.matheus;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{

   


    public static void main( String[] args )
    {
        Scanner sc = new Scanner(System.in);

        Double Rendimento, Outras, TotalDeducoes, BaseCalculo, Imposto;
        int Dependentes;

        System.out.println("Qual foi o total do seu rendimento anual?");
        Rendimento = sc.nextDouble();

        System.out.println("Você tem dependentes? digite a quantidade");
        Dependentes = sc.nextInt();

        System.out.println("Total de outras deduções");
        Outras = sc.nextDouble();

        TotalDeducoes = (Outras + (Dependentes * 2275.08));
        BaseCalculo = Rendimento - TotalDeducoes;

        if (BaseCalculo < 0){BaseCalculo = 0.0;}

        Imposto = CalcularImposto(BaseCalculo);

        if(Imposto == 0){
            System.out.println("Você está insento do pagamento do Imposto de Renda");
        }else{
            System.out.printf("O Valor a ser pago é de: %.2f%n", Imposto);
        }


    }


    public static Double CalcularImposto(Double renda){
        double imposto = 0.0;

        if (renda <= 27870.40) {
            imposto = 0;
        } else if (renda <= 37751.55) {
            imposto = (renda - 27870.40) * 0.075;
        } else if (renda <= 50148.25) {
            imposto = (renda - 37751.55) * 0.15 +
                      (37751.55 - 27870.40) * 0.075;
        } else if (renda <= 64259.59) {
            imposto = (renda - 50148.25) * 0.225 +
                      (50148.25 - 37751.55) * 0.15 +
                      (37751.55 - 27870.40) * 0.075;
        } else {
            imposto = (renda - 64259.59) * 0.275 +
                      (64259.59 - 50148.25) * 0.225 +
                      (50148.25 - 37751.55) * 0.15 +
                      (37751.55 - 27870.40) * 0.075;
        }

        return imposto;
    }

}
