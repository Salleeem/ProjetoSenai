package webapp.projetosenai.Controll;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import webapp.projetosenai.Model.Funcionario;
import webapp.projetosenai.Repository.FuncionarioRepository;

@Controller
public class FuncionarioController {

    private final FuncionarioRepository funcionarioRepository;

    public FuncionarioController(FuncionarioRepository funcionarioRepository) {
        this.funcionarioRepository = funcionarioRepository;
    }

    @GetMapping("/cadastroFuncionario")
    public String cadastroFuncionario(Model model) {
        model.addAttribute("funcionarioForm", new Funcionario());
        return "cadastroFuncionario";
    }
}
