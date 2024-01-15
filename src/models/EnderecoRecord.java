package models;

public record EnderecoRecord(String cep, String logradouro, String complemento,
                             String bairro, String localidade, String uf, boolean erro) {
}
