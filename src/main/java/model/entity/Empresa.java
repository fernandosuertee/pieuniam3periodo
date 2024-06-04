package model.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Empresa {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String nomeinstituicao;
    private String tipo_instituicao;
    private String cep;
    private String endereco;
    private String complemento;
    private String bairro;
    private String cidade;
    private String estado;
    private String pais_origem;
    private String email_empresa;
    private String telefone_empresa;

    public Empresa() {}

    public Empresa(Long id, String nomeinstituicao, String tipo_instituicao, String cep, String endereco, String complemento, String bairro, String cidade, String estado, String pais_origem, String email_empresa, String telefone_empresa) {
        this.id = id;
        this.nomeinstituicao = nomeinstituicao;
        this.tipo_instituicao = tipo_instituicao;
        this.cep = cep;
        this.endereco = endereco;
        this.complemento = complemento;
        this.bairro = bairro;
        this.cidade = cidade;
        this.estado = estado;
        this.pais_origem = pais_origem;
        this.email_empresa = email_empresa;
        this.telefone_empresa = telefone_empresa;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNomeinstituicao() {
        return nomeinstituicao;
    }

    public void setNomeinstituicao(String nomeinstituicao) {
        this.nomeinstituicao = nomeinstituicao;
    }

    public String getTipo_instituicao() {
        return tipo_instituicao;
    }

    public void setTipo_instituicao(String tipo_instituicao) {
        this.tipo_instituicao = tipo_instituicao;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getPais_origem() {
        return pais_origem;
    }

    public void setPais_origem(String pais_origem) {
        this.pais_origem = pais_origem;
    }

    public String getEmail_empresa() {
        return email_empresa;
    }

    public void setEmail_empresa(String email_empresa) {
        this.email_empresa = email_empresa;
    }

    public String getTelefone_empresa() {
        return telefone_empresa;
    }

    public void setTelefone_empresa(String telefone_empresa) {
        this.telefone_empresa = telefone_empresa;
    }
}
