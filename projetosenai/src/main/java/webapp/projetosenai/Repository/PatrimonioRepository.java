package webapp.projetosenai.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import webapp.projetosenai.Model.Patrimonio;

public interface PatrimonioRepository extends JpaRepository<Patrimonio, Long> {
}
