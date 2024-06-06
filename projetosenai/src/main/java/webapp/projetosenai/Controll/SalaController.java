package webapp.projetosenai.Controll;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import java.util.List;
import webapp.projetosenai.Model.Sala;
import webapp.projetosenai.Repository.SalaRepository;

@Controller
public class SalaController {

    @Autowired
    private SalaRepository salaRepository;

    @GetMapping("/cadastrosala")
    public String cadastroSala(Model model) {
        model.addAttribute("sala", new Sala());
        return "cadastrosala";
    }

    @PostMapping("/cadastrarSala")
    public String cadastrarSala(@ModelAttribute("sala") Sala sala, BindingResult result) {
        if (result.hasErrors()) {
            return "cadastrosala";
        }
        salaRepository.save(sala);
        return "redirect:/sucessocapa";
    }

    @GetMapping("/listarsala")
    public String listarSala(Model model) {
        List<Sala> salas = salaRepository.findAll();
        model.addAttribute("salas", salas);
        return "listarsala";
    }
}
