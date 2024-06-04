package model.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.util.Date;

@Entity
public class Demanda {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String titulo;
    private String curso;
    private int qtd_grupo;
    private String descricao;
    private String resultado_esperado;
    private Date expectativa_termino;
    private String impacto;
    private String nome_mentor;
    private String email_mentor;
    private int demandante_id;
    private String anexo;

    public Demanda() {}

    public Demanda(Long id, String titulo, String curso, int qtd_grupo, String descricao, String resultado_esperado, Date expectativa_termino, String impacto, String nome_mentor, String email_mentor, int demandante_id, String anexo) {
        this.id = id;
        this.titulo = titulo;
        this.curso = curso;
        this.qtd_grupo = qtd_grupo;
        this.descricao = descricao;
        this.resultado_esperado = resultado_esperado;
        this.expectativa_termino = expectativa_termino;
        this.impacto = impacto;
        this.nome_mentor = nome_mentor;
        this.email_mentor = email_mentor;
        this.demandante_id = demandante_id;
        this.anexo = anexo;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public int getQtd_grupo() {
        return qtd_grupo;
    }

    public void setQtd_grupo(int qtd_grupo) {
        this.qtd_grupo = qtd_grupo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getResultado_esperado() {
        return resultado_esperado;
    }

    public void setResultado_esperado(String resultado_esperado) {
        this.resultado_esperado = resultado_esperado;
    }

    public Date getExpectativa_termino() {
        return expectativa_termino;
    }

    public void setExpectativa_termino(Date expectativa_termino) {
        this.expectativa_termino = expectativa_termino;
    }

    public String getImpacto() {
        return impacto;
    }

    public void setImpacto(String impacto) {
        this.impacto = impacto;
    }

    public String getNome_mentor() {
        return nome_mentor;
    }

    public void setNome_mentor(String nome_mentor) {
        this.nome_mentor = nome_mentor;
    }

    public String getEmail_mentor() {
        return email_mentor;
    }

    public void setEmail_mentor(String email_mentor) {
        this.email_mentor = email_mentor;
    }

    public int getDemandante_id() {
        return demandante_id;
    }

    public void setDemandante_id(int demandante_id) {
        this.demandante_id = demandante_id;
    }

    public String getAnexo() {
        return anexo;
    }

    public void setAnexo(String anexo) {
        this.anexo = anexo;
    }
}
