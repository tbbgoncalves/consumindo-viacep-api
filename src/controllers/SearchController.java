package controllers;

import models.Endereco;
import utils.FileBuilder;

import java.io.IOException;

public class SearchController {
    private HttpController httpController;
    private JsonController jsonController;
    private Endereco endereco;

    public Endereco search(String cep) throws IOException, InterruptedException {
        //mensagem de início da busca
        System.out.println("Realizando a busca, aguarde um momento...");

        //faz a requisição para a API
        this.httpController = new HttpController(cep);

        //desserializa o JSON
        this.jsonController = new JsonController(this.httpController.getJson());

        //pega o JSON convertido para EnderecoRecord e instancia a classe Endereco
        this.endereco = new Endereco(this.jsonController.getEnderecoRecord());

        return this.endereco;
    }

    public void save() throws IOException {
        FileBuilder.build(endereco.getCep(), this.jsonController.toJson(this.endereco));
    }
}