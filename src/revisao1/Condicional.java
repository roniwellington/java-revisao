package revisao1;

public class Condicional {
    public static void main(String[] args) {
        int anoDeLancamento = 2022;
        boolean incluidoNoPlano = true;
        double notaDoFilme = 8.1;
        String tipoPlano = "plus";

        if (anoDeLancamento >= 2022) {
            System.out.println("Lançamentos que os clientes estão curtindo!");
        } else {
            System.out.println("revisao2.modelo.Filme retrô que vale a pena assistir");
        }

        if (incluidoNoPlano || tipoPlano.equals("plus")) {
            System.out.println("revisao2.modelo.Filme liberado");
        } else {
            System.out.println("Deve pagar a locação");
        }

    }
}
