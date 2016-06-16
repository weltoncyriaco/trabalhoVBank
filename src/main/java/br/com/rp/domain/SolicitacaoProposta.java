package br.com.rp.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Email;

@Entity
@Table(name = "solicitacao_proposta")
public class SolicitacaoProposta extends BaseEntity {

    @Column(name = "nome", length = 100, nullable = false)
    @Size(min = 3, max = 100)
    private String nome;
    @Column(name = "email", nullable = false)
    @Email
    private String email;
    
    @Column(name = "motivo_rejeicao")
    private String motivoRejeicao;
    //@cep
    private String cep;

    public SolicitacaoProposta() {
    }

    public SolicitacaoProposta(String nome, String email, String cep) {
        this.nome = nome;
        this.email = email;
        this.cep = cep;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMotivoRejeicao() {
        return motivoRejeicao;
    }

    public void setMotivoRejeicao(String motivoRejeicao) {
        this.motivoRejeicao = motivoRejeicao;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

}
