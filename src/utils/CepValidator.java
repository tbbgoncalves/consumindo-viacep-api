package utils;

public interface CepValidator {
    static String validate(String cep) {
        String cepFormatado = cep.replaceAll("[^0-9]", "");

        if(cepFormatado.length() != 8) {
            throw new RuntimeException("CEP inválido");
        }
        else {
            return cepFormatado;
        }
    }
}
