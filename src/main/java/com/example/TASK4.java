package com.example;

/**
 * Create an implementation of a Rest API client.
 * Prints out how many records exists for each gender and save this file to s3 bucket
 * API endpoint=> https://3ospphrepc.execute-api.us-west-2.amazonaws.com/prod/RDSLambda 
 * AWS s3 bucket => interview-digiage
 *
 */
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import com.google.gson.Gson;

public class TASK4 {
    static String webService = "https://3ospphrepc.execute-api.us-west-2.amazonaws.com/prod/RDSLambda ";
    static int codigoSucesso = 200;

    public static void main(String[] args) {
        try {
            Endereco e = buscaEnderecoPelo("");
            System.out.println(e.toString());
            System.out.println("Final do programa");
        } catch (Exception exception) {

        }
    }

    /**
     * @param api
     * @return
     * @throws Exception
     */
    public static Endereco buscaEnderecoPelo(String api) throws Exception {
        final String urlParaChamada = webService + api + "";

        try {
            final URL url = new URL(urlParaChamada);
            HttpURLConnection conexao = (HttpURLConnection) url.openConnection();

            if (conexao.getResponseCode() != codigoSucesso)
                throw new RuntimeException("HTTP error code : " + conexao.getResponseCode());

            BufferedReader resposta = new BufferedReader(new InputStreamReader((conexao.getInputStream())));
            String jsonEmString = Util.converteJsonEmString(resposta);
            System.out.println(jsonEmString);
            Gson gson = new Gson();
            Endereco endereco = gson.fromJson(jsonEmString, Endereco.class);
            return endereco;
        } catch (Exception e) {
            throw new Exception("ERRO: " + e);
        }
    }
}