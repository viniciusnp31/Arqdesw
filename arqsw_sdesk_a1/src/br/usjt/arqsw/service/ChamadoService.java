package br.usjt.arqsw.service;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import br.usjt.arqsw.dao.ChamadoDAO;
import br.usjt.arqsw.dao.FilaDAO;
import br.usjt.arqsw.entity.Chamado;
import br.usjt.arqsw.entity.Fila;


    public class ChamadoService {
	   private ChamadoDAO dao;
	
	   public ChamadoService() {
		   this.dao = new ChamadoDAO();
	   }
	   		public int criarChamados (Chamado chamado) throws IOException{
	   			chamado.setStatus(Chamado.ABERTO);
	   			chamado.setDataAbetura(new Date());
	   			return dao.criarChamado(chamado);
	   		}
	   		
	   		public ArrayList<Chamado> listarChamados(Fila fila) throws IOException{
	   			return dao.listarChamados();
	   		}
}
