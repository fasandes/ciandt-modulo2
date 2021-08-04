package com.fsandes.services;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;

public class FileReaderService {

	/**
	 * @param fileName - nome do arquivo incluindo extensão
	 * @return string correspondente ao conteúdo do arquivo
	 * @throws URISyntaxException
	 * @throws IOException
	 */
	public static String ler(final String fileName) throws URISyntaxException, IOException {
		ClassLoader classLoader = ClassLoader.getSystemClassLoader();

		URL url = classLoader.getResource("json/"+ fileName);
		if (url != null) {
			return  Files.readString(Path.of(url.toURI()), StandardCharsets.UTF_8);
		} else {
			return "";
		}

	}

	public static void gravar(final String filename, final String conteudo) throws URISyntaxException, IOException {
		ClassLoader classLoader = ClassLoader.getSystemClassLoader();
		File file = new File(classLoader.getResource("json").getPath().concat("/").concat(filename));
		FileWriter writer = new FileWriter(file);

		try {
			writer.write(conteudo);
			writer.flush();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			writer.close();
		}

	}



}
