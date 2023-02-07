package trabalhandocomarquivos;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Programa003 {
	
	//Versão que acrescenta informações no arquivo
	
	public static void main(String[] args) {
		
		String[] lines = new String[] {"Bom dia!", "Boa tarde", "Boa noite"};
		
		String path = "C:\\Users\\diego\\eclipse-workspace\\trabalhandocomarquivos\\saida.txt";
		
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))) {
			for (String line : lines) {
				bw.write(line);
				bw.newLine();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
