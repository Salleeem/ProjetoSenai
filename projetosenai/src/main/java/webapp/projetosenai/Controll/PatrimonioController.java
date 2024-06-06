package webapp.projetosenai.Controll;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import webapp.projetosenai.Model.Patrimonio;
import webapp.projetosenai.Repository.PatrimonioRepository;

import java.util.List;

@Controller
public class PatrimonioController {

    private final PatrimonioRepository patrimonioRepository;

    public PatrimonioController(PatrimonioRepository patrimonioRepository) {
        this.patrimonioRepository = patrimonioRepository;
    }

    @GetMapping("/listarPatrimonios")
    public String listarPatrimonios(Model model) {
        List<Patrimonio> patrimonios = patrimonioRepository.findAll();
        model.addAttribute("patrimonios", patrimonios);
        return "listarPatrimonios";
    }
}
