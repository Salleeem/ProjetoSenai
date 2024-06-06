package webapp.projetosenai.Model;

import java.io.Serializable;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Sala implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idSala;

    @ManyToOne
    @JoinColumn(name = "idPatri")
    private Patrimonio patri;

    @ManyToOne
    @JoinColumn(name = "idFunc")
    private Funcionario func;

    private String bloco;
    private String unidade;
    
    // Getters and Setters
    public long getIdSala() {
        return idSala;
    }

    public void setIdSala(long idSala) {
        this.idSala = idSala;
    }

    public Patrimonio getPatri() {
        return patri;
    }

    public void setPatri(Patrimonio patri) {
        this.patri = patri;
    }

    public Funcionario getFunc() {
        return func;
    }

    public void setFunc(Funcionario func) {
        this.func = func;
    }

    public String getBloco() {
        return bloco;
    }

    public void setBloco(String bloco) {
        this.bloco = bloco;
    }

    public String getUnidade() {
        return unidade;
    }

    public void setUnidade(String unidade) {
        this.unidade = unidade;
    }
}
