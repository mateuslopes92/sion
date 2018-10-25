package com.br.sion.repositorios;

import com.br.sion.modelo.Aluno;
import com.br.sion.modelo.Curso;
import com.br.sion.modelo.Usuario;
import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;


public class AlunosRowMapper implements RowMapper<Aluno> {

    @Override
    public Aluno mapRow(ResultSet rs, int i) throws SQLException {
        Long aluno_ra = rs.getLong("aluno_ra");
        String aluno_nome = rs.getString("aluno_nome");
        Boolean aluno_monitor = rs.getBoolean("aluno_monitor");
        int aluno_periodo = rs.getInt("aluno_periodo");
        String aluno_email = rs.getString("aluno_email");
        
        Long curso_id = rs.getLong("curso_id");
        String curso_nome = rs.getString("curso_nome");
        int curso_periodo = rs.getInt("curso_periodo");
        Long usuario_id = rs.getLong("usuario_id");
        String usuario_nome = rs.getString("usuario_nome");
        String usuario_senha = rs.getString("usuario_senha");
    
        Curso curso = new Curso();
        curso.setCurso_id(curso_id);
        curso.setCurso_nome(curso_nome);
        curso.setCurso_periodo(curso_periodo);
        
        Usuario usuario = new Usuario();
        usuario.setUsuario_id(usuario_id);
        usuario.setUsuario_nome(usuario_nome);
        usuario.setUsuario_senha(usuario_senha);
        
        return new Aluno(aluno_ra, aluno_nome, aluno_monitor, aluno_periodo, aluno_email, curso, usuario);
    }
    
}
