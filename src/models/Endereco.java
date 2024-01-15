package models;

public class Endereco {
    String cep, logradouro, complemento, bairro, localidade, uf;

    public Endereco(EnderecoRecord enderecoRecord) {
        //inicializa os atributos com base no EnderecoRecord
        this.cep = enderecoRecord.cep();
        this.logradouro = enderecoRecord.logradouro();
        this.complemento = enderecoRecord.complemento();
        this.bairro = enderecoRecord.bairro();
        this.localidade = enderecoRecord.localidade();
        this.uf = enderecoRecord.uf();
    }

    public String getCep() {
        return cep;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public String getComplemento() {
        return complemento;
    }

    public String getBairro() {
        return bairro;
    }

    public String getLocalidade() {
        return localidade;
    }

    public String getUf() {
        return uf;
    }

    @Override
    public String toString() {
        return "Endereco{" +
                "cep='" + cep + '\'' +
                ", logradouro='" + logradouro + '\'' +
                ", complemento='" + complemento + '\'' +
                ", bairro='" + bairro + '\'' +
                ", localidade='" + localidade + '\'' +
                ", uf='" + uf + '\'' +
                '}';
    }
}
