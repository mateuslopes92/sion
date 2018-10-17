package com.br.sion.modelo;

public class Usuario {
    public Long usuario_id;
    public String usuario_nome;
    public String usuario_senha;

public Usuario(){}

public Usuario(Long usuario_id,String usuario_nome,String usuario_senha){
this.usuario_id = usuario_id;
this.usuario_nome = usuario_nome;
this.usuario_senha = usuario_senha;
}
 public Long getUsuario_id() {
        return usuario_id;
    }

    public void setUsuario_id(Long usuario_id) {
        this.usuario_id = usuario_id;
    }

    public String getUsuario_nome() {
        return usuario_nome;
    }

    public void setUsuario_nome(String usuario_nome) {
        this.usuario_nome = usuario_nome;
    }
    
    

    public void setUsuario_senha(String usuario_senha) {
        this.usuario_senha = usuario_senha;
    }
    public String getUsuario_senha() {
            return usuario_senha;
    }
    
    
 @Override
    public String toString(){
        return "Usuario{" + "usuario_id=" + usuario_id + ", usuario_nome=" + usuario_nome + " usuario_senha=" + usuario_senha + '}';
    }    
}


