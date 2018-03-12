package br.usjt.arqsw.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * 
 * @author RA:201511080 Nome:Vinícius Neves Pereira Turma:SIN3AN-MCA1
 *
 */

public class Chamado implements Serializable {
	private static final long serialVersionUID = 1L;
	
	public static final String ABERTO  = "aberto";
	public static final String FECHADO = "fechado";
	private int numero;
	private String nome; 
	private Date dataAbetura;
	private Date dataFechamento;
	private String status;
	private Fila fila; 
	
	
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Date getDataAbetura() {
		return dataAbetura;
	}
	public void setDataAbetura(Date dataAbetura) {
		this.dataAbetura = dataAbetura;
	}
	public Date getDataFechamento() {
		return dataFechamento;
	}
	public void setDataFechamento(Date dataFechamento) {
		this.dataFechamento = dataFechamento;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Fila getFila() {
		return fila;
	}
	public void setFila(Fila fila) {
		this.fila = fila;
	}
	@Override
	public String toString() {
		return "Chamado [numero=" + numero + ", nome=" + nome + ", dataAbetura=" + dataAbetura + ", dataFechamento="
				+ dataFechamento + ", status=" + status + ", fila=" + fila + "]";
	}
	
	
	 
}
