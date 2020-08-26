package utils;

import java.io.File;
import java.io.Writer;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.opencsv.CSVWriter;

public class GerarArquivo {

	private static String[] cabecalho = { "Logradouro/Nome", "Bairro/Distrito", "Localidade/UF", "CEP" };
	public static Date date = new Date();
	private static SimpleDateFormat formatterEvidenceDate = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
	
	@SuppressWarnings("resource")
	public static void gerarArquivo(List<String> logradouro, List<String> bairro, List<String> localidade,
			List<String> cep) throws Exception {

		String caminhoAtual = new File("").getAbsolutePath();
		String CaminhoArquivo = caminhoAtual + "\\resultados\\resultado_da_busca_" + (formatterEvidenceDate.format(date)).replace(" ", "_").replace(":", "-")
				+ ".csv";
		Writer writer = Files.newBufferedWriter(Paths.get(CaminhoArquivo));
		CSVWriter csvWriter = new CSVWriter(writer);
		csvWriter.writeNext(cabecalho);

		for (int i = 0; i < logradouro.size(); i++) {
			String[] registros = { logradouro.get(i), bairro.get(i), localidade.get(i), cep.get(i) };
			csvWriter.writeNext(registros);
		}
		csvWriter.flush();
		writer.close();
	}
}