package webapp.projetosenai.Model;

import java.io.Serializable;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Patrimonio implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idPatri;
    private String idBloco;
    private String idSala;
    private Funcionario nome;
    private String descri;
    private String idUni;
    private double valorPatri;
    private String dataAqc;

    public Long getIdPatri() {
        return idPatri;
    }

    public void setIdPatri(Long idPatri) {
        this.idPatri = idPatri;
    }

    public String getIdBloco() {
        return idBloco;
    }

    public void setIdBloco(String idBloco) {
        this.idBloco = idBloco;
    }

    public String getIdSala() {
        return idSala;
    }

    public void setIdSala(String idSala) {
        this.idSala = idSala;
    }

    public Funcionario getNome() {
        return nome;
    }

    public void setNome(Funcionario nome) {
        this.nome = nome;
    }

    public String getDescri() {
        return descri;
    }

    public void setDescri(String descri) {
        this.descri = descri;
    }

    public String getIdUni() {
        return idUni;
    }

    public void setIdUni(String idUni) {
        this.idUni = idUni;
    }

    public double getValorPatri() {
        return valorPatri;
    }

    public void setValorPatri(double valorPatri) {
        this.valorPatri = valorPatri;
    }

    public String getDataAqc() {
        return dataAqc;
    }

    public void setDataAqc(String dataAqc) {
        this.dataAqc = dataAqc;
    }
}
