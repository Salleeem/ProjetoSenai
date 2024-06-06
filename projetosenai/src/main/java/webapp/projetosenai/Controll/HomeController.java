package webapp.projetosenai.Controll;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;
import webapp.projetosenai.Model.Funcionario;
import webapp.projetosenai.Repository.FuncionarioRepository;

import java.util.List;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class HomeController {

    private final FuncionarioRepository funcionarioRepository;

    public HomeController(FuncionarioRepository funcionarioRepository) {
        this.funcionarioRepository = funcionarioRepository;
    }

    @GetMapping("/")
    public String index() {
        return "index";
    }

    @GetMapping("/cadastro")
    public String cadastro() {
        return "cadastro";
    }

    @GetMapping("/cadastrofunc")
    public String cadastroFunc() {
        return "cadastrofunc";
    }

    @GetMapping("/sucessoca")
    public String sucessoca() {
        return "sucessoca";
    }

    @GetMapping("/sucessocapa")
    public String sucessocapa() {
        return "sucessocapa";
    }

    @GetMapping("/listarpatrimonios")
    public String listarpatrimonios() {
        return "listarpatrimonios";
    }



    
    

    @GetMapping("/listarFuncionario")
    public String listarFuncionario(Model model) {
        List<Funcionario> funcionarios = funcionarioRepository.findAll();
        model.addAttribute("funcionarios", funcionarios);
        return "listarFuncionario";
    }

    

    @PostMapping("/cadastrarFuncionario")
    public ModelAndView cadastrarFuncionario(@ModelAttribute Funcionario funcionario) {
        funcionarioRepository.save(funcionario);
        return new ModelAndView("redirect:/sucessoca");
    }
}
