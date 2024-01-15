package controllers;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import models.Endereco;
import models.EnderecoRecord;

public class JsonController {
    Gson gson = new GsonBuilder()
            .setLenient()
            .setPrettyPrinting()
            .create();
    EnderecoRecord enderecoRecord;

    public JsonController(String json) {
        this.enderecoRecord = this.gson.fromJson(json, EnderecoRecord.class);

        //após deserializado, verifica se foi encontrado o CEP
        if(enderecoRecord.erro()) {
            throw new RuntimeException("CEP não encontrado");
        }
    }

    public EnderecoRecord getEnderecoRecord() {
        return enderecoRecord;
    }

    public String toJson(Endereco endereco) {
        return this.gson.toJson(endereco);
    }
}
