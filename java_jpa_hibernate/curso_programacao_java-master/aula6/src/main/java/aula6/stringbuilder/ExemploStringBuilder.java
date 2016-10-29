package aula6.stringbuilder;

public class ExemploStringBuilder {

	public static void main(String[] args) {
		// Concatenacao "na mao"
		String minhaString = "Meu valor qualquer";
		minhaString += "Meu valor qualquer 1 ";
		minhaString += "Meu valor qualquer 2 ";
		minhaString += "Meu valor qualquer 3 ";
		minhaString += "Meu valor qualquer 4 ";

		// Concatenacao usando StringBuilder
		StringBuffer stringBuilder = new StringBuffer();
		stringBuilder.append("Meu valor qualquer");
		stringBuilder.append("Meu valor qualquer 1 ");
		stringBuilder.append("Meu valor qualquer 2 ");
		stringBuilder.append("Meu valor qualquer 3 ");
		stringBuilder.append("Meu valor qualquer 4 ");

		stringBuilder.setLength(stringBuilder.length() - 10);
		String conteudo = stringBuilder.toString();
		System.out.println(conteudo);

		// Exemplo com criacao de consulta em banco de dados
		StringBuffer sql = new StringBuffer();
		sql.append("SELECT p.* FROM Pessoa p ");
		sql.append("INNER JOIN endereco e ON p.id = e.pessoa_id ");
		sql.append("WHERE p.nome LIKE '%JUQUINHA%'");

		System.out.println(sql);
	}
}
