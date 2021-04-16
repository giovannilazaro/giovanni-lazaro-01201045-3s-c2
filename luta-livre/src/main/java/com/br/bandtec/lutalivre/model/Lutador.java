package com.br.bandtec.lutalivre.model;


import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.*;

public class Lutador {


@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Integer idLutadorBate;

@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Integer idLutadorApanha;

@NotBlank
@Size(min = 3, max = 10)
private String nome;

@PositiveOrZero
private Double forcaGolpe;
private Double vida = 100.0;
private boolean vivo;
private Integer concentracoesRealizadas = 0;


    public Lutador(Integer idLutadorBate, Integer idLutadorApanha, @NotBlank @Size(min = 3, max = 10) String nome,
                   @PositiveOrZero Double forcaGolpe, Double vida, boolean vivo, Integer concentracoesRealizadas) {
        this.idLutadorBate = idLutadorBate;
        this.idLutadorApanha = idLutadorApanha;
        this.nome = nome;
        this.forcaGolpe = forcaGolpe;
        this.vida = vida;
        if (vida > 0){
            this.vivo = true;
        }else {

            this.vivo = false;
        }

        this.concentracoesRealizadas = concentracoesRealizadas;
    }

    public Integer getIdLutadorBate() {
        return idLutadorBate;
    }

    public void setIdLutadorBate(Integer idLutadorBate) {
        this.idLutadorBate = idLutadorBate;
    }

    public Integer getIdLutadorApanha() {
        return idLutadorApanha;
    }

    public void setIdLutadorApanha(Integer idLutadorApanha) {
        this.idLutadorApanha = idLutadorApanha;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getForcaGolpe() {
        return forcaGolpe;
    }

    public void setForcaGolpe(Double forcaGolpe) {
        this.forcaGolpe = forcaGolpe;
    }

    public Double getVida() {
        return vida;
    }

    public void setVida(Double vida) {
        this.vida = vida;
    }

    public boolean isVivo() {
        return vivo;
    }

    public void setVivo(boolean vivo) {
        this.vivo = vivo;
    }

    public Integer getConcentracoesRealizadas() {
        return concentracoesRealizadas;
    }

    public void setConcentracoesRealizadas(Integer concentracoesRealizadas) {
        this.concentracoesRealizadas = concentracoesRealizadas;
    }
}
