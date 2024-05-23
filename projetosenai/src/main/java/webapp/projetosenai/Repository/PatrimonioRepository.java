package webapp.projetosenai.Repository;

import webapp.projetosenai.Model.Patrimonio;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PatrimonioRepository extends JpaRepository<Patrimonio, Long> {
}
