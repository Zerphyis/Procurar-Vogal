package dev.Zerphyis.challengeJava.vogal;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import lombok.EqualsAndHashCode;

@Entity
@EqualsAndHashCode(of = "id")
public class Vogal {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Long id;

    private String palavraPassada;

    private char vogal;

    private String tempoTotal;


    public Vogal(DadosVogal dados){
        this.palavraPassada=dados.palavraPassada();
        this.vogal= dados.vogal();
        this.tempoTotal=dados.tempoTotal();
    }

    public  Vogal(){

    }



    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPalavraPassada() {
        return palavraPassada;
    }

    public void setPalavraPassada(String palavraPassada) {
        this.palavraPassada = palavraPassada;
    }

    public char getVogal() {
        return vogal;
    }

    public void setVogal(char vogal) {
        this.vogal = vogal;
    }

    public String getTempoTotal() {
        return tempoTotal;
    }

    public void setTempoTotal(String tempoTotal) {
        this.tempoTotal = tempoTotal;
    }
}
