package br.usjt.arqsw.dao;

import java.io.IOException;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import br.usjt.arqsw.entity.Chamado;
import br.usjt.arqsw.entity.Fila;

public class ChamadoDAO {
	
	
	public int criarChamado(Chamado chamado) throws IOException {
		
		Date dataAbertura = new Date(chamado.getDataAbetura().getTime());
		
		// TODO Auto-generated method stub
		return 0;
	}
	
	public ArrayList<Chamado> listarChamados() throws IOException {
		String query = "select id_fila, nm_fila from fila";
		ArrayList<Chamado> lista = new ArrayList<>();
		try(Connection conn = ConnectionFactory.getConnection();
			PreparedStatement pst = conn.prepareStatement(query);
			ResultSet rs = pst.executeQuery();){
			
			while(rs.next()) {
				Chamado chamado = new Chamado();
				chamado.setNumero(rs.getInt("id_fila"));
				chamado.setNome(rs.getString("nm_fila"));
				lista.add(chamado);
			}
			
		} catch (SQLException e) {
			throw new IOException(e);
		}
		return lista;
	}

}
