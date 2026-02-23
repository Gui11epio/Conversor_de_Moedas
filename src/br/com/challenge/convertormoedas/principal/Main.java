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

        Scanner sc = new Scanner(System.in);
        int sair = 1;

        while(sair == 1){
            System.out.println("""
                *************************************************
                
                <--- Bem-vindo/Bem-vinda ao programa de Conversor de Moedas! --->
                
                1) Dólar ==> Peso Argentino
                2) Peso Argentino ==> Dolár
                3) Dólar ==> Real Brasileiro
                4) Real Brasileiro ==> Dólar
                5) Peso Colombiano ==> Peso Argentino
                6) Dólar ==> Peso Colombiano
                7) Sair
                """);

            System.out.println("Escolha um tipo de conversão: ");
            System.out.println("*************************************************");
            String escolha = sc.nextLine();

            switch (escolha){
                case "1":
                    try{
                        ConversorMoeda conversorMoeda = new ConversorMoeda();
                        conversorMoeda.busca("https://v6.exchangerate-api.com/v6/aa99808fda5a92b7b9a9971d/pair/USD/ARS");
                        break;
                    }catch (Exception e){
                        System.out.println(e.getMessage());
                    }

                case "2":
                    try{
                        ConversorMoeda conversorMoeda = new ConversorMoeda();
                        conversorMoeda.busca("https://v6.exchangerate-api.com/v6/aa99808fda5a92b7b9a9971d/pair/ARS/USD");
                        break;
                    }catch (Exception e){
                        System.out.println(e.getMessage());
                    }

                case "3":
                    try{
                        ConversorMoeda conversorMoeda = new ConversorMoeda();
                        conversorMoeda.busca("https://v6.exchangerate-api.com/v6/aa99808fda5a92b7b9a9971d/pair/USD/BRL");
                        break;
                    }catch (Exception e){
                        System.out.println(e.getMessage());
                    }


                case "4":
                    try{
                        ConversorMoeda conversorMoeda = new ConversorMoeda();
                        conversorMoeda.busca("https://v6.exchangerate-api.com/v6/aa99808fda5a92b7b9a9971d/pair/BRL/USD");
                        break;
                    }catch (Exception e){
                        System.out.println(e.getMessage());
                    }

                case "5":
                    try{
                        ConversorMoeda conversorMoeda = new ConversorMoeda();
                        conversorMoeda.busca("https://v6.exchangerate-api.com/v6/aa99808fda5a92b7b9a9971d/pair/COP/ARS");
                        break;
                    }catch (Exception e){
                        System.out.println(e.getMessage());
                    }


                case "6":
                    try{
                        ConversorMoeda conversorMoeda = new ConversorMoeda();
                        conversorMoeda.busca("https://v6.exchangerate-api.com/v6/aa99808fda5a92b7b9a9971d/pair/USD/COP");
                        break;

                    }catch (Exception e){
                        System.out.println(e.getMessage());
                    }

                case "7":
                    sair = 0;

            }
        }







    }
}
