# Coversor de Moedas - Challenge ONE - Java

Esse projeto permite converter um valor em diferentes tipos de moedas em tempo real, utilizando uma API externa. Nessa program tem manipulação de JSON, consumo de API e principios da Orientação a Objeto.

## Funcionalidades

Possui um menu onde tem 6 opções de conversão de moedas:

1) Dólar ==> Peso Argentino
2) Peso Argentino ==> Dolár
3) Dólar ==> Real Brasileiro
4) Real Brasileiro ==> Dólar
5) Peso Colombiano ==> Peso Argentino
6) Dólar ==> Peso Colombiano

Basta escolher uma das conversões e colocar um valor, esse valor vai ser convertido em tempo real já dando a você o resultado

## Tecnologias utilizadas
 - Java 17
 - Biblioteca GSON
 - API: ExchangeRate-API

## Estrutura

1. **Main.java**, onde está o menu com as entradas do usuários e a url para o acesso da API
2. **ConversorMoeda.java**, onde está toda a lógica por trás da conversão

## Como Rodar

1. Acesse https://www.exchangerate-api.com/ para obter a sua chave da API
   
2. Clone o repositório
````
https://github.com/Gui11epio/Conversor_de_Moedas.git
````

3. Com a sua chave agora feita, use ela na **Main.java** na URL onde está escrito "SUA-CHAVE-API". Exemplo de como está na main: ````conversorMoeda.busca("https://v6.exchangerate-api.com/v6/SUA-CHAVE-API/pair/USD/ARS");````

4. Após trocar para a sua chave, só rodar o progrma e começar a fazer as conversões.
