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
    
    public Aluno busca(Long ra) {
        String sql = "select * from alunos where ra = ?";
        Object[] parametros = { ra };
        return template.queryForObject(sql, parametros, new AlunosRowMapper());
    }
    
    public void salva(Aluno aluno) {
        String sql = 
                "insert into alunos (ra, nome, monitor, periodo) " +
                "values (?, ?, ?, ?)";
        Object[] parametros = {
            aluno.getRa(), aluno.getNome(),
            aluno.getMonitor(), aluno.getPeriodo()
        };
        template.update(sql, parametros);
    }
    
    public void atualiza(Long ra, Aluno aluno) {
        String sql = 
                "update alunos set nome = ?, monitor = ?, periodo = ? " +
                "where ra = ?";
        Object[] parametros = {
            aluno.getNome(),
            aluno.getMonitor(), aluno.getPeriodo(), ra
        };
        template.update(sql, parametros);
    }
    
    public void remove(Long ra) {
        String sql = "delete from alunos where ra = ?";
        Object[] parametros = { ra };
        template.update(sql, parametros);
    }
    
}
