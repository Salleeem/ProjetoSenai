package webapp.projetosenai.Controll;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import webapp.projetosenai.Model.Patrimonio;
import webapp.projetosenai.Repository.FuncionarioRepository;
import webapp.projetosenai.Repository.PatrimonioRepository;

import java.util.List;

@Controller
public class PatrimonioController {

    private final PatrimonioRepository patrimonioRepository;
    private final FuncionarioRepository funcionarioRepository;

    public PatrimonioController(PatrimonioRepository patrimonioRepository,
                                FuncionarioRepository funcionarioRepository) {
        this.patrimonioRepository = patrimonioRepository;
        this.funcionarioRepository = funcionarioRepository;
    }

    @GetMapping("/listarpatrimonios")
    public String listarPatrimonios(Model model) {
        List<Patrimonio> patrimonios = patrimonioRepository.findAll();
        model.addAttribute("patrimonios", patrimonios);
        return "listarPatrimonios";
    }

    @GetMapping("/cadastroPatrimonio")
    public String formularioCadastroPatrimonio(Model model) {
        model.addAttribute("patrimonio", new Patrimonio());
        model.addAttribute("funcionarios", funcionarioRepository.findAll());
        return "cadastroPatrimonio";
    }

    @PostMapping("/cadastrarPatrimonio")
    public ModelAndView cadastrarPatrimonio(@ModelAttribute Patrimonio patrimonio) {
        patrimonioRepository.save(patrimonio);
        return new ModelAndView("redirect:/listarPatrimonios");
    }
}
