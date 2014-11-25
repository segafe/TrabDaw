/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package maria.negocios;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.util.Calendar;

/**
 *
 * @author alunos
 */
public class FichaPolicial {
    private Long id;
    private String nome;
    private String cpf;
    private String residencia;
    private String delito;
    private String data;
    private String hora;
    private String local;
    private String estado;
    private String avatar;

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public String getEstado() {
        return estado;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }


    public void setNome(String nome) {
        this.nome = nome;
    }

    public Long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public String getResidencia() {
        return residencia;
    }

    public String getDelito() {
        return delito;
    }

    public String getData() {
        return data;
    }

    public String getHora() {
        return hora;
    }

    public String getLocal() {
        return local;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setResidencia(String residencia) {
        this.residencia = residencia;
    }

    public void setDelito(String delito) {
        this.delito = delito;
    }

    public void setData(String data) {
        this.data = data;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    

    
    
}
