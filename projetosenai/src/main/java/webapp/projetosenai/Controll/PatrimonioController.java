package webapp.projetosenai.Controll;

import webapp.projetosenai.Model.Patrimonio;
import webapp.projetosenai.Service.PatrimonioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/patrimonios")
public class PatrimonioController {

    @Autowired
    private PatrimonioService patrimonioService;

    @GetMapping
    public List<Patrimonio> getAllPatrimonios() {
        return patrimonioService.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Patrimonio> getPatrimonioById(@PathVariable Long id) {
        Optional<Patrimonio> patrimonio = patrimonioService.findById(id);
        if (patrimonio.isPresent()) {
            return ResponseEntity.ok(patrimonio.get());
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @PostMapping
    public Patrimonio createPatrimonio(@RequestBody Patrimonio patrimonio) {
        return patrimonioService.save(patrimonio);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Patrimonio> updatePatrimonio(@PathVariable Long id, @RequestBody Patrimonio patrimonioDetails) {
        Optional<Patrimonio> patrimonio = patrimonioService.findById(id);
        if (patrimonio.isPresent()) {
            Patrimonio updatedPatrimonio = patrimonio.get();
            updatedPatrimonio.setId_bloco(patrimonioDetails.getId_bloco());
            updatedPatrimonio.setId_sala(patrimonioDetails.getId_sala());
            updatedPatrimonio.setNome_func(patrimonioDetails.getNome_func());
            updatedPatrimonio.setId_cat(patrimonioDetails.getId_cat());
            updatedPatrimonio.setId_uni(patrimonioDetails.getId_uni());
            updatedPatrimonio.setValor_patri(patrimonioDetails.getValor_patri());
            updatedPatrimonio.setData_aqc(patrimonioDetails.getData_aqc());
            return ResponseEntity.ok(patrimonioService.save(updatedPatrimonio));
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletePatrimonio(@PathVariable Long id) {
        if (patrimonioService.findById(id).isPresent()) {
            patrimonioService.deleteById(id);
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
