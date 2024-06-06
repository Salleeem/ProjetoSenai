package webapp.projetosenai.Model;

import java.io.Serializable;
import java.sql.Date;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

public class Consumiveis implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idCons;

    @ManyToOne
    @JoinColumn(name = "idFunc")
    private Funcionario func;
    
    private Date sol;
    private int qtnd;

    // Getters and Setters
    public long getIdCons() {
        return idCons;
    }

    public void setIdCons(long idCons) {
        this.idCons = idCons;
    }

    public Funcionario getFunc() {
        return func;
    }

    public void setFunc(Funcionario func) {
        this.func = func;
    }

    public Date getSol() {
        return sol;
    }

    public void setSol(Date sol) {
        this.sol = sol;
    }

    public int getQtnd() {
        return qtnd;
    }

    public void setQtnd(int qtnd) {
        this.qtnd = qtnd;
    }
}
