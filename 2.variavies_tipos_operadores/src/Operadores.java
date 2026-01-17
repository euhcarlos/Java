public class Operadores {
    public static void main(String[] args){
        operacoesAritimeticas();
        operacoesAtribuicao();
        operacoesIncrementoDecremento();
        operacoesRelacionais();
    }

    private static void operacoesRelacionais() {
        System.out.println("\n***************** operacoesRelacionais *********************************\n");

        int num1 = 10;
        int num2 = 10;

        boolean isMaior = num1 > num2;
        System.out.println("É maior: " + isMaior);

        boolean isIgual = num1 == num2;
        System.out.println("É igual: " + isIgual);

        boolean isDiferente = num1 != num2;
        System.out.println("É diferente: " + isDiferente);

        boolean isMaiorOuIgual = num1 >= num2;
        System.out.println("É maior ou igual: " + isMaiorOuIgual);

        boolean isMenorOuIgual = num1 <= num2;
        System.out.println("É menor ou igual: " + isMenorOuIgual);


        boolean dentroDe10 = num1 >= 1 && num1 <= 10;
        System.out.println("É dentro de 10: " + dentroDe10);

        boolean dentroOu10 = num1 >= 1 || num1 <= 10;
        System.out.println("É ou maior que 1 ou menor que 10: " + dentroDe10);

        boolean alcontrarioDentroOu10 = num1 >= 1 || num1 <= 10;
        System.out.println("É ou maior que 1 ou menor que 10: " + !dentroDe10);

    }

    private static void operacoesIncrementoDecremento() {
        System.out.println("\n***************** operacoesIncrementoDecremento *********************************\n");

        int valor = 1;
        valor++;
        System.out.println(valor);
        valor--;
        System.out.println(valor);
    }

    private static void operacoesAtribuicao() {
        System.out.println("\n***************** Operações atribuição *********************************\n");

        int valor = 10;
        int valor2 = 10;

        int valor3 = valor + valor2;
        System.out.println(valor3);


        valor3 += valor3;
        System.out.println(valor3);
    }

    private static void operacoesAritimeticas() {
        System.out.println("\n***************** Operações aritimeticas *********************************\n");
        int num1 = 10;
        int num2 = 20;

        int resultadoSoma = num1 + num2;
        int resultadoSubtracao = num1 - num2;
        int resultadoDivisao = num2 / num1;
        int resultadoMulti = num1 * num2;

        System.out.println(resultadoSoma);
        System.out.println(resultadoSubtracao);
        System.out.println(resultadoDivisao);
        System.out.println(resultadoMulti);
    }


}
