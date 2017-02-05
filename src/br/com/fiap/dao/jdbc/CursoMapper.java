package br.com.fiap.dao.jdbc;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import br.com.fiap.entidades.Curso;
import br.com.fiap.entidades.Escola;

public class CursoMapper implements RowMapper<Curso> {
	@Override
	public Curso mapRow(ResultSet rs, int arg1) throws SQLException {
		Curso curso = new Curso();
		curso.setId(rs.getInt("ID"));
		curso.setDescricao(rs.getString("DESCRICAO"));
		Escola escola = new Escola();
		escola.setId(rs.getInt("IDESCOLA"));
		curso.setEscola(escola);
		return curso;
	}

}
