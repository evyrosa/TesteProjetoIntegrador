package grupo2.projeto.integrador.projetointegrador.model;

import java.sql.Date;
import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name = "tb_card")
public class Card {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_card ;
	
	@NotNull
	private String funcao ;
	
	@NotNull
	private String nome_empresa ;
	
	@NotNull
	private String formacoes ;
	
	@DateTimeFormat(pattern="dd/MM/yyyy")
	@NotBlank
	private Date dataInicio ;
	
	@DateTimeFormat(pattern="dd/MM/yyyy")
	@NotBlank
	private LocalDate dataFinal ;
	
	private String imagem ;

	public Long getId_card() {
		return id_card;
	}

	public void setId_card(Long id_card) {
		this.id_card = id_card;
	}

	public String getFuncao() {
		return funcao;
	}

	public void setFuncao(String funcao) {
		this.funcao = funcao;
	}

	public String getNome_empresa() {
		return nome_empresa;
	}

	public void setNome_empresa(String nome_empresa) {
		this.nome_empresa = nome_empresa;
	}

	public String getFormacoes() {
		return formacoes;
	}

	public void setFormacoes(String formacoes) {
		this.formacoes = formacoes;
	}

	public Date getDataInicio() {
		return dataInicio;
	}

	public void setDataInicio(Date dataInicio) {
		this.dataInicio = dataInicio;
	}

	public LocalDate getDataFinal() {
		return dataFinal;
	}

	public void setDataFinal(LocalDate dataFinal) {
		this.dataFinal = dataFinal;
	}

	public String getImagem() {
		return imagem;
	}

	public void setImagem(String imagem) {
		this.imagem = imagem;
	}
	
	
	
}
