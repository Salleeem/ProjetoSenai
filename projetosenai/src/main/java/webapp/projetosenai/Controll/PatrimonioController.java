package webapp.projetosenai.Controll;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import webapp.projetosenai.Model.Patrimonio;
import webapp.projetosenai.Repository.PatrimonioRepository;

@Controller
public class PatrimonioController {

    @Autowired
    private PatrimonioRepository patrimonioRepository;

    @GetMapping("/cadastropatri")
    public String cadastroPatrimonio(Model model) {
        model.addAttribute("patrimonio", new Patrimonio());
        return "cadastropatri";
    }

    @PostMapping("/cadastrarPatrimonio")
    public String cadastrarPatrimonio(@ModelAttribute("patrimonio") Patrimonio patrimonio, BindingResult result) {
        if (result.hasErrors()) {
            return "cadastropatri";
        }
        patrimonioRepository.save(patrimonio);
        return "redirect:/sucessoca";
    }
}
