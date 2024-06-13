package webapp.projetosenai.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import webapp.projetosenai.Model.Funcionario;

public interface FuncionarioRepository extends JpaRepository<Funcionario, Long> {
    // Métodos específicos de consulta, se necessário
}
