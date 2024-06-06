package webapp.projetosenai.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import webapp.projetosenai.Model.Sala;

@Repository
public interface SalaRepository extends JpaRepository<Sala, Long>{

    
} 
