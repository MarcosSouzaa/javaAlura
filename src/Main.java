public class Main {
    public static void main(String[] args) {

        System.out.println("\n************* IMPRIMINDO ALGO  **************\n");
        System.out.println("Esse é o Screen Match");
        System.out.println(" Filme: Top Gun: Maverick");

        System.out.println("\n************* VARIÁVEIS  **************\n");
        int anoDeLancamento = 2022;
        System.out.println("Ano de Lançamento: " + anoDeLancamento);
        boolean incluidoNoPlano = true;
        double notaDoFilme = 8.1;

        /*Existem também operadores de atribuição combinados, que são uma forma abreviada de atribuição. Por exemplo,
         o operador "+=" adiciona um valor à variável existente.*/
        int valor = 10;
        valor += 15;  //Equivalente a valor = valor + 15, atribui o valor 25 à variável valor

        System.out.println("\n************* OPERADOR COM PROCEDÊNCIA  **************\n");
        double media = (9.8 + 6.3 + 8.0) / 3;
        System.out.println(media);

        System.out.println("\n************* FAZENDO CASTING (MOLDAR, TRANSFORMAR OU FUNDIR)  **************\n");
        /*
        Neste caso, o Casting é usado para converter um valor de um tipo de dado primitivo para outro. Exemplo Prático
        (numérico): Imagine que você tem uma variável de 64 bits (long) e precisa armazenar esse valor NUMA variável
        de 32 bits (int).
        */

        int classificacao = (int)(media/2); // Cating de double para int
        System.out.println(String.format("O filme recebeu %d estrelas \n", classificacao));
        //O filme recebeu 4 estrelas

        long numeroLongo = 156486599945L;
        int numeroInteiro = (int) numeroLongo; // aqui está o Casting;
        System.out.println("Valor estourado de Casting de Long = 156486599945L;para int- OverFlow: "+ numeroInteiro);

        // Nosso valor perigoso
        long valorLong = 156486599945L;

// Limite máximo do int: 2147483647
        long LIMITE_MAXIMO_INT = Integer.MAX_VALUE;

        if (valorLong  > LIMITE_MAXIMO_INT) {
            // Ação: Lançar um erro, registrar um aviso, ou tratar a perda.
            System.out.println("⚠️ ALERTA: Valor muito grande! O casting causará estouro.");

            // O casting forçado
            int resultado = (int) valorLong;
            System.out.println("Resultado do Casting (com perda): " + resultado);

        } else {
            // Ação: Fazer o casting de forma segura.
            int resultadoSeguro = (int) valorLong;
            System.out.println("Casting seguro: " + resultadoSeguro);
        }

        System.out.println("\n************* OPERADORES ARITMÉTICOS  **************\n");

        /*Os operadores aritméticos são usados para realizar operações matemáticas básicas. São eles:

       "+" (adição)
       "-" (subtração)
       "*" (multiplicação)
       "/" (divisão)
       "%" (resto da divisão)

       Por exemplo:*/
        int a = 10 + 5; // Atribui o valor 15 à variável a
        System.out.println("A = 10 + 5, Atribui o valor 15 à variável A = " + a);
        int b = 10 - 5; // Atribui o valor 5 à variável b
        System.out.println("B = 10 - 5, Atribui o valor 5 à variável B = " + b);
        int c = 10 * 5; // Atribui o valor 50 à variável c
        System.out.println("C = 10 * 5, Atribui o valor 50 à variável C = " + c);
        int d = 10 / 5; // Atribui o valor 2 à variável d
        System.out.println("D = 10 / 5, Atribui o valor 2 à variável D = " + d);
        int e = 10 % 3; // Atribui o valor 1 à variável e (o resto da divisão de 10 por 3 é 1)
        System.out.println("E = 10 % 3, Atribui o valor 1 à variável e (o resto da divisão de 10 por 3 é 1) E = " + e);

        System.out.println("\n******************* OPERADORES RELACIONAIS ******************\n");
        /*
        Os operadores relacionais são usados para comparar valores. Eles retornam um valor booleano (verdadeiro ou falso)
        Trabalharemos melhor com eles quando estivermos na aula de condicionais, onde vamos modificar o fluxo da aplicação
        dada alguma condição. São eles:
        "==" (igual a)
        "!=" (diferente de)
        ">" (maior que)
        ">=" (maior ou igual a)
        "<" (menor que)
        "<=" (menor ou igual a)
         Exemplo:
         */

        int x = 10; // Atribui o valor 10 à variável a
        int y = 5; // Atribui o valor 5 à variável b
        int z = 30; // Atribui o valor 30 à variável c

        boolean igual = (y == x); //Nesse caso a variável igual ficará com o valor *false*
        System.out.println("É igual? R= " + igual);
        boolean diferente = (y != z); //A variável diferente ficará com o valor *true*
        System.out.println("É diferente? R= " + diferente);
        boolean maior = (y > x); //A variável maior ficará com o valor *false*
        System.out.println("É maior? R= " + maior);
        boolean menorIgual = (y <= z); //A variável menorIgual ficará com o valor *true*
        System.out.println("É menor ou igual? R= " + menorIgual);

        System.out.println("\n******************* OPERADORES LÓGICOS ******************");
        /*
        Esses operadores são usados quando queremos verificar duas ou mais condições e/ou expressões na aplicação.

        Eles fazem a comparação de valores booleanos e retornam também um resultado booleano.

        São três operadores: AND (&&), OR (||) e NOT (!). */

        System.out.println("******************* OPERADOR AND (&&) ******************\n");
        /*
        O operador AND (&&), que traduzindo para o português seria o E, é usado para verificar se duas condições são
        verdadeiras. Se ambas as condições forem verdadeiras, o resultado será verdadeiro. Caso contrário, o resultado
        será falso. Aqui está um exemplo: */

        // Este código não será executado, já que g é verdadeiro e h falso
        boolean g = true;
        boolean h = false;
        if (g && h) {
            System.out.println("Código executado");
        }else{
            System.out.println("Código não executado porque uma opção é falsa!");        }


            System.out.println("\n******************* OPERADOR AND (&&) ******************\n");
           /*
            O operador OR (||), que traduzindo para o português seria o OU, é usado para verificar se pelo menos uma
            das condições é verdadeira. Se pelo menos uma das condições for verdadeira, o resultado será verdadeiro.
            Caso contrário, o resultado será falso. Aqui está um exemplo:
            */

            boolean r = true;
            boolean s = false;
            if (r || s) {
                // Este código será executado, já que a é verdadeiro, mesmo que b seja falso.
                System.out.println("Código executou porque uma opção é verdadeiro!");
            }

            System.out.println("\n******************* OPERADOR NOT (!) ******************\n");
            /*
            O operador NOT (!) é usado para negar uma condição. Se a condição for verdadeira, o resultado será falso.
            Se a condição for falsa, o resultado será verdadeiro. Aqui está um exemplo:
             */
            boolean k = true;
            if (!k) {
                // Este código não será executado, já que a é verdadeiro.
                System.out.println("executa!!");
            }else{
                System.out.println("Este código não será executado porque está tentando negar uma condição verdadeira!");
            }

            System.out.println("\n******************* OPERADORES DE INCREMENTO ******************\n");
            /*
            Além dos operadores citados anteriormente, o operador de incremento é usado para aumentar o valor de uma
            variável em 1. Existem dois tipos de operadores de incremento: o operador de pré-incremento (++variavel)
            e o operador de pós-incremento (variavel++).
                    O operador de pré-incremento (++variavel) aumenta o valor da variável em 1 antes de usar a variável
            numa expressão. Aqui está um exemplo:
             */
            int num = 5;
            int resultado = ++num; //num é incrementado para 6 e depois atribuído a resultado
            System.out.println( "Implementou 1 na variável ++num: " + num); // imprime 6
            System.out.println("Mostra o resultado após a implementação: " + resultado); // imprime 6

            System.out.println("\n******************* OPERADORES PÓS-INCREMENTO ******************\n");
            /*
            Já o operador de pós-incremento (variavel++) aumenta o valor da variável em 1 após usar a variável
            numa expressão. Aqui está um exemplo:
            */
            int num2 = 5;
            int resultado2 = num2++; //num2 é atribuído primeiramente à variável resultado2 e depois incrementado para 6
            System.out.println("num2 é atribuído primeiramente à variável resultado2 e depois incrementado: " + num2); // imprime 6
            System.out.println("Aqui a variável resultado2 recebe num2 sem incrementação: " + resultado2); // imprime 5

            System.out.println("\n********USANDO STRING COM TEXT BLOCK e concatenação *********\n");
            // Variável para guardar texto eu uso 'String', que é uma classe e não um tipo.
            // A partir do java 15 entrou o recurso Text Blocks, eu consigo formatar a minha 'string' com espaço

            String sinopse;
            sinopse = """
                      Filme Top Gun
                      Filme de aventura com galã dos anos 80
                      Muito Bom!
                      Ano de Lançamento
                    """ + anoDeLancamento;

            System.out.println(sinopse);

            System.out.println("\n******************* FORMATAÇÃO DE TEXTO  ********************\n");

            String nome = "Maria";
            int idade = 30;
            double valor1 = 55.9999;

            System.out.println(String.format(" Meu nome é %s, eu tenho %d anos e e hoje gastei R$ %.2f reais", nome,idade,valor1));
            System.out.println("teste");

        System.out.println("\n************ CONVERTA UMA TEMPERATURA EM GRAUS CELSIUS PARA FAHRENHEIT ************\n");
        // (temperatura * 1.8) + 32

        double grausCelsius = 35.5;
        double temperatura = (int) ((grausCelsius * 1.8) + 32);

        System.out.println(String.format("A temperatura em Graus Celsius %d °C convertida para Graus Fahrenheit é %d °F", (int)grausCelsius, (int)temperatura ));

        }
    }
