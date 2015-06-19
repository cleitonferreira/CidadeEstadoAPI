package br.com.cristiano.estado;

import java.util.List;

import br.com.cristiano.cidade.Cidade;

public enum Estado {
	AC(1, "AC", "Acre"),
	AL(2, "AL", "Alagoas"),
	AP(3, "AP", "Amap�"),
	AM(4, "AM", "Amazonas"),
	BA(5, "BA", "Bahia"),
	CE(6, "CE", "Cear�"),
	DF(7, "DF", "Distrito Federal"),
	ES(8, "ES", "Esp�rito Santo"),
	GO(9, "GO", "Goi�s"),
	MA(10, "MA", "Maranh�o"),
	MT(11, "MT", "Mato Grosso"),
	MS(12, "MS", "Mato Grosso do Sul"),
	MG(13, "MG", "Minas Gerais"),
	PA(14, "PA", "Par�"),
	PB(15, "PB", "Para�ba"),
	PR(16, "PR", "Paran�"),
	PE(17, "PE", "Pernambuco"),
	PI(18, "PI", "Piau�"),
	RJ(19, "RJ", "Rio de Janeiro"),
	RN(20, "RN", "Rio Grande do Norte"),
	RS(21, "RS", "Rio Grande do Sul"),
	RO(22, "RO", "Rond�nia"),
	RR(23, "RR", "Roraima"),
	SC(24, "SC", "Santa Catarina"),
	SP(25, "SP", "S�o Paulo"),
	SE(26, "SE", "Sergipe"),
	TO(27, "TO", "Tocantins");

	private Estado(int id, String sigla, String nome) {
		this.id = id;
		this.sigla = sigla;
		this.nome = nome;
	}
	
	private int id;
	private String sigla;
	private String nome;
	
	public int getId() {
		return id;
	}
	public String getSigla() {
		return sigla;
	}
	public String getNome() {
		return nome;
	}
	
	public static Estado getEstado(String sigla){
		for(Estado e : Estado.values()){
			if(e.getSigla().equalsIgnoreCase(sigla)){
				return e;
			}
		}
		return null;
	}
	
}
