public class Condicional {
    public static void main(String[] args) {

        System.out.println("\n***************  TRABALHANDO COM IF/ELSE/&& (END)/ || (OU)  **************\n");

        int anoDeLancamento = 2022;
        boolean incluidoNoPlano = false;
        double notaDoFilme = 8.1;
        String tipoPlano = "normal";

        if (anoDeLancamento >= 2022) {
            System.out.println("Lançamento que os clientes estão curtindo!");
        } else {
            System.out.println("Filme retrô que vale a pena assistir!");
        }
        if (incluidoNoPlano == true || tipoPlano.equals("Plus") && anoDeLancamento < 2025) {
            System.out.println("Filme Liberado!");
        } else {
            System.out.println("Deve pagar a Locação!");
        }

        System.out.println("\n***************  TRABALHANDO SWITCH CASE **************\n");

        int dia = 3;
        String nomeDia;

        switch (dia) {
            case 1:
                nomeDia = "Domingo";
                break;
            case 2:
                nomeDia = "Segunda";
                break;
            case 3:
                nomeDia = "terça-feira";
                break;
            case 4:
                nomeDia = "quarta-feira";
                break;
            case 5:
                nomeDia = "quinta-feira";
                break;
            case 6:
                nomeDia = "sexta-feira";
                break;
            case 7:
                nomeDia = "sábado";
                break;
            default:
                nomeDia = "Nome do dia inválido!";
        }
        System.out.println("O dia " + dia + " é " + nomeDia);
    }
}
