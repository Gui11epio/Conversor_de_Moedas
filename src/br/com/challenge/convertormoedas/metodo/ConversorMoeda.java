package br.com.challenge.convertormoedas.metodo;

public class ConversorMoeda {

    public double Conversao(double valorMoeda, double taxa) {
        double resultado = valorMoeda * taxa;
        System.out.println("Resultado: " + resultado);
        return resultado;
    }


}
