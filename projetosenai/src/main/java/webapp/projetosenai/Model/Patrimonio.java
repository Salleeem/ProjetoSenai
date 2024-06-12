package webapp.projetosenai.Model;

import jakarta.persistence.*;
import java.io.Serializable;
import java.sql.Date;

@Entity
public class Patrimonio implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idPatri;

    private String descri;
    private Double valorPatri;
    private Date dataAqc;
    private String status;

    @ManyToOne
    @JoinColumn(name = "idFunc")
    private Funcionario func;

    // Getters and Setters

    public Long getIdPatri() {
        return idPatri;
    }

    public void setIdPatri(Long idPatri) {
        this.idPatri = idPatri;
    }

    public String getDescri() {
        return descri;
    }

    public void setDescri(String descri) {
        this.descri = descri;
    }

    public Double getValorPatri() {
        return valorPatri;
    }

    public void setValorPatri(Double valorPatri) {
        this.valorPatri = valorPatri;
    }

    public Date getDataAqc() {
        return dataAqc;
    }

    public void setDataAqc(Date dataAqc) {
        this.dataAqc = dataAqc;
    }

    public Funcionario getFunc() {
        return func;
    }

    public void setFunc(Funcionario func) {
        this.func = func;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
