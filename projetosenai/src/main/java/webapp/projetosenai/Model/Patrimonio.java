package webapp.projetosenai.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;



import java.time.LocalDate;

@Entity
public class Patrimonio {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_patri;
    private int id_bloco;
    private int id_sala;
    private String nome_func;
    private int id_cat;
    private int id_uni;
    private int valor_patri;
    private LocalDate data_aqc;

    // Getters and Setters
    public Long getId_patri() {
        return id_patri;
    }

    public void setId_patri(Long id_patri) {
        this.id_patri = id_patri;
    }

    public int getId_bloco() {
        return id_bloco;
    }

    public void setId_bloco(int id_bloco) {
        this.id_bloco = id_bloco;
    }

    public int getId_sala() {
        return id_sala;
    }

    public void setId_sala(int id_sala) {
        this.id_sala = id_sala;
    }

    public String getNome_func() {
        return nome_func;
    }

    public void setNome_func(String nome_func) {
        this.nome_func = nome_func;
    }

    public int getId_cat() {
        return id_cat;
    }

    public void setId_cat(int id_cat) {
        this.id_cat = id_cat;
    }

    public int getId_uni() {
        return id_uni;
    }

    public void setId_uni(int id_uni) {
        this.id_uni = id_uni;
    }

    public int getValor_patri() {
        return valor_patri;
    }

    public void setValor_patri(int valor_patri) {
        this.valor_patri = valor_patri;
    }

    public LocalDate getData_aqc() {
        return data_aqc;
    }

    public void setData_aqc(LocalDate data_aqc) {
        this.data_aqc = data_aqc;
    }
}
