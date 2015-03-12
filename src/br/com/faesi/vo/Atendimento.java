package br.com.faesi.vo;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;





@Entity
public class Atendimento {

	@Id
	@GeneratedValue
	private long id;
	private String marca; 
	private String modelo;
	private String cor;
	private String placa;
	private String anomalia;
	private Date dataEntrada;
	private Date dataServico;
	private Date dataConclusao;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public String getPlaca() {
		return placa;
	}
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	public String getAnomalia() {
		return anomalia;
	}
	public void setAnomalia(String anomalia) {
		this.anomalia = anomalia;
	}
	public Date getDataEntrada() {
		return dataEntrada;
	}
	public void setDataEntrada(Date dataEntrada) {
		this.dataEntrada = dataEntrada;
	}
	public Date getDataServico() {
		return dataServico;
	}
	public void setDataServico(Date dataServico) {
		this.dataServico = dataServico;
	}
	public Date getDataConclusao() {
		return dataConclusao;
	}
	public void setDataConclusao(Date dataConclusao) {
		this.dataConclusao = dataConclusao;
	}
	
	
	
	
	
	
}
