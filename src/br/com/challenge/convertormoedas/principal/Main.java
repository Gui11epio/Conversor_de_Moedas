package br.com.challenge.convertormoedas.principal;

import br.com.challenge.convertormoedas.metodo.ConversorMoeda;
import com.google.gson.*;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {


        String url = "https://v6.exchangerate-api.com/v6/aa99808fda5a92b7b9a9971d/pair/EUR/GBP";

        HttpClient client = HttpClient.newHttpClient();

        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(url))
                .GET()
                .build();

        try{
            HttpResponse<String> resposta = client.send(request, HttpResponse.BodyHandlers.ofString());
            JsonElement elemento = JsonParser.parseString(resposta.body());
            JsonObject objectRoot = elemento.getAsJsonObject();
            // Accessando o JsonObject
            double taxa = objectRoot.get("conversion_rate").getAsDouble();
            ConversorMoeda conversorMoeda = new ConversorMoeda();
            conversorMoeda.Conversao(100, taxa);
        }catch (Exception e){
            System.out.println(e);
        }
    }
}
