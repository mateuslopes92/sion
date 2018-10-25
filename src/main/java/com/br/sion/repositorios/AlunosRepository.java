package com.br.sion.repositorios;

import com.br.sion.modelo.Aluno;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;


@Component
public class AlunosRepository {

    @Autowired
    private JdbcTemplate template;
    
    public List<Aluno> lista() {
        String sql = "select * from alunos";
        return template.query(sql, new AlunosRowMapper());
    }
    
    public Aluno busca(Long aluno_ra) {
        String sql = "select * from alunos where aluno_ra = ?";
        Object[] parametros = { aluno_ra };
        return template.queryForObject(sql, parametros, new AlunosRowMapper());
    }
    
    public void salva(Aluno aluno) {
        String sql = 
                "insert into alunos (aluno_ra, aluno_nome, aluno_monitor,aluno_periodo, aluno_email, curso_id, curso_nome, curso_periodo, usuario_id, usuario_nome, usuario_senha) " +
                "values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        Object[] parametros = {
            aluno.getAluno_ra(), aluno.getAluno_nome(),aluno.getAluno_monitor(),aluno.getAluno_periodo(), aluno.getAluno_email(),
            aluno.getCurso(),aluno.getUsuario()
        };
        template.update(sql, parametros);
    }
    
    public void atualiza(Long aluno_ra, Aluno aluno) {
        String sql = 
                "update alunos set aluno_ra = ?, aluno_nome = ?, aluno_monitor = ?,aluno_periodo = ?, aluno_email = ?, curso_id = ?, curso_nome = ?, curso_periodo = ?, usuario_id = ?, usuario_nome = ?, usuario_senha = ? " +
                "where aluno_ra = ?";
        Object[] parametros = {
            aluno.getAluno_nome(),aluno.getAluno_monitor(),aluno.getAluno_periodo(), aluno.getAluno_email(),
            aluno.getCurso(),aluno.getUsuario(), aluno_ra
        };
        template.update(sql, parametros);
    }
    
    public void remove(Long aluno_ra) {
        String sql = "delete from alunos where aluno_ra = ?";
        Object[] parametros = { aluno_ra };
        template.update(sql, parametros);
    }
    
}
