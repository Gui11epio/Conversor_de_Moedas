package br.com.challenge.convertormoedas.metodo;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class ConversorMoeda {

    public void busca(String url){
        Scanner moeda = new Scanner(System.in);
        System.out.println("Coloque um valor: ");
        double valor = moeda.nextDouble();

        try{
            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(url))
                    .GET()
                    .build();

            HttpResponse<String> resposta = client.send(request, HttpResponse.BodyHandlers.ofString());
            JsonElement elemento = JsonParser.parseString(resposta.body());
            JsonObject objectRoot = elemento.getAsJsonObject();

            double taxa = objectRoot.get("conversion_rate").getAsDouble();

            conversao(valor, taxa);
        }
        catch (Exception e){
            System.out.println(e);
        }
    }

    public double conversao(double valorMoeda, double taxa) {
        double resultado = valorMoeda * taxa;
        System.out.println("Valor convertido para a moeda escolhida: " + resultado );
        return resultado;
    }




}
