package utils;

import java.io.FileWriter;
import java.io.IOException;

public interface FileBuilder {
    public static void build(String cep, String json) throws IOException {
        FileWriter output = new FileWriter(cep + ".json");
        output.write(json);
        output.close();
    }
}
