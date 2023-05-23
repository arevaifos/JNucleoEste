package com.nucleoEste.nucleoEste.model;


import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "noticia")
public class Noticia implements Serializable {

    private static final long serialVersionUID=1l;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "codigo", nullable = false)
    private Long codigo;
    @Column(name = "titulo")
    private String titulo;
    @Column(name = "descricao")
    private String descricao;
    @Column(name = "data")
    private String data;
    @Column(name = "maisInformacao")
    private String maisInformacao;

    public Long getCodigo() {
        return codigo;
    }

    public void setCodigo(Long codigo) {
        this.codigo = codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getMaisInformacao() {
        return maisInformacao;
    }

    public void setMaisInformacao(String maisInformacao) {
        this.maisInformacao = maisInformacao;
    }
}
