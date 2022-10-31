package net.thucydides.showcase.cucumber.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;
import java.util.Random;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;

public class LoginArquivo {

	private String usuario;
	private String senha;
	
	private static Random random = new Random();

	

	public void Ler() throws IOException {
		File arquivoE = new File("src\\test\\resources\\Parametros\\Login.xls");
		String arquivoUsuarioSenha = arquivoE.getAbsolutePath();
		FileInputStream arquivo = null;

		try {
			arquivo = new FileInputStream(new File(arquivoUsuarioSenha));

			HSSFWorkbook workbook = new HSSFWorkbook(arquivo);

			HSSFSheet sheetMassa = workbook.getSheetAt(0);

			Iterator<Row> rowIterator = sheetMassa.iterator();

			while (rowIterator.hasNext()) {
				Row row = rowIterator.next();
				Iterator<Cell> cellIterator = row.cellIterator();

				// Descantando a primeira linha com o header
				if (row.getRowNum() == 0) {
					continue;
				}

				while (cellIterator.hasNext()) {
					Cell cell = cellIterator.next();
					switch (cell.getColumnIndex()) {
					case 0:
						setUsuario(cell.getStringCellValue());
						break;
					case 1:
						setSenha(cell.getStringCellValue());
						break;
					
					}
				}
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
			System.out.println("Arquivo Excel não encontrado!");
		} finally {
			try {
				if (arquivo != null)
					arquivo.close();
			} catch (IOException ex) {
				ex.printStackTrace();
			}
		}

	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public static int numeroQualquer() {
		int nrInicial = 0;
		int nrFinal = 1000000;
		int sorteio = random.nextInt(nrFinal - nrInicial); // Tamanho do intervalo
		return sorteio + nrInicial;
	}

}
