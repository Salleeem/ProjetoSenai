package webapp.projetosenai.Model;

import jakarta.persistence.*;
import java.io.Serializable;
import java.sql.Date;

@Entity
public class Movimentacao implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idMov;

    @ManyToOne
    @JoinColumn(name = "idPatri")
    private Patrimonio patrimonio;

    @ManyToOne
    @JoinColumn(name = "idSala")
    private Sala sala;

    @ManyToOne
    @JoinColumn(name = "idFunc")
    private Funcionario funcionario;

    private String tipoMov;
    private Integer qntPatri;
    private Date dataMov;

    // Getters and Setters

    public Long getIdMov() {
        return idMov;
    }

    public void setIdMov(Long idMov) {
        this.idMov = idMov;
    }

    public Patrimonio getPatrimonio() {
        return patrimonio;
    }

    public void setPatrimonio(Patrimonio patrimonio) {
        this.patrimonio = patrimonio;
    }

    public Sala getSala() {
        return sala;
    }

    public void setSala(Sala sala) {
        this.sala = sala;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    public String getTipoMov() {
        return tipoMov;
    }

    public void setTipoMov(String tipoMov) {
        this.tipoMov = tipoMov;
    }

    public Integer getQntPatri() {
        return qntPatri;
    }

    public void setQntPatri(Integer qntPatri) {
        this.qntPatri = qntPatri;
    }

    public Date getDataMov() {
        return dataMov;
    }

    public void setDataMov(Date dataMov) {
        this.dataMov = dataMov;
    }
}
