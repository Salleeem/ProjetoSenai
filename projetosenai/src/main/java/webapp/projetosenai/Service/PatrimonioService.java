package webapp.projetosenai.Service;

import webapp.projetosenai.Model.Patrimonio;
import webapp.projetosenai.Repository.PatrimonioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PatrimonioService {

    @Autowired
    private PatrimonioRepository patrimonioRepository;

    public List<Patrimonio> findAll() {
        return patrimonioRepository.findAll();
    }

    public Optional<Patrimonio> findById(Long id) {
        return patrimonioRepository.findById(id);
    }

    public Patrimonio save(Patrimonio patrimonio) {
        return patrimonioRepository.save(patrimonio);
    }

    public void deleteById(Long id) {
        patrimonioRepository.deleteById(id);
    }
}
