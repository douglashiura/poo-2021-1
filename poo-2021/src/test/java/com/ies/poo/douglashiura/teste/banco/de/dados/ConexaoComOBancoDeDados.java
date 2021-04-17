package com.ies.poo.douglashiura.teste.banco.de.dados;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;

public class ConexaoComOBancoDeDados {

	public Connection obterConexao() throws SQLException {
		String url = "jdbc:postgresql://localhost/douglas";
		String usuarioDoBanco = "comex";
		String senha = "comex";
		return DriverManager.getConnection(url, usuarioDoBanco, senha);
	}

	public void persistir(Pessoa pessoa) throws SQLException {
		Connection conexao = obterConexao();
		PreparedStatement afirmacao = conexao
				.prepareStatement("INSERT INTO Pessoa (nome, idade) VALUES (?, ?) RETURNING id;");
		afirmacao.setString(1, pessoa.getNome());
		if (pessoa.getIdade() == null) {
			afirmacao.setObject(2, null);
		} else {
			afirmacao.setInt(2, pessoa.getIdade());
		}
		afirmacao.execute();
		ResultSet resultado = afirmacao.getResultSet();
		resultado.next();
		pessoa.setId(resultado.getInt(1));
		resultado.close();
		afirmacao.close();
		conexao.close();
	}

	public List<Pessoa> lista() throws SQLException {
		Connection conexao = obterConexao();
		CallableStatement chamada = conexao.prepareCall("SELECT id, nome, idade FROM Pessoa;");
		chamada.execute();
		ResultSet resultado = chamada.getResultSet();
		List<Pessoa> pessoas = new LinkedList<Pessoa>();
		while (resultado.next()) {
			Pessoa pessoa = new Pessoa();
			pessoa.setId(resultado.getInt(1));
			pessoa.setNome(resultado.getString(2));
			pessoa.setIdade(resultado.getInt(3));
			pessoas.add(pessoa);
		}
		resultado.close();
		chamada.close();
		conexao.close();
		return pessoas;
	}

	public void limparPessoasDoBanco() throws SQLException {
		Connection conexao = obterConexao();
		PreparedStatement afirmacao = conexao.prepareStatement("DELETE FROM Pessoa;");
		afirmacao.execute();
		afirmacao.close();
		conexao.close();
	}

}
