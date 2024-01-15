package controllers;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class HttpController {
    HttpRequest request;
    HttpResponse<String> response;

    public HttpController(String cep) throws IOException, InterruptedException {
        String url = "https://viacep.com.br/ws/" + cep + "/json/";

        this.request = HttpRequest.newBuilder()
                .uri(URI.create(url))
                .build();

        this.response = HttpClient
                .newHttpClient()
                .send(this.request, HttpResponse.BodyHandlers.ofString());
    }

    public String getJson() {
        return this.response.body();
    }
}