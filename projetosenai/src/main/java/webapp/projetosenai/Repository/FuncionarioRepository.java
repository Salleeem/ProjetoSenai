package webapp.projetosenai.Repository;


import webapp.projetosenai.Model.Funcionario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FuncionarioRepository extends JpaRepository<Funcionario, String> {
    // Aqui você pode adicionar métodos personalizados de consulta, se necessário
}
