package webapp.projetosenai.Controll;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import webapp.projetosenai.Model.Patrimonio;
import webapp.projetosenai.Repository.PatrimonioRepository;

@Controller
@RequestMapping("/cadastrar")
public class CadastroController {

    @Autowired
    private PatrimonioRepository patrimonioRepository;

    @GetMapping
    public String mostrarFormulario() {
        return "formulario";
    }

    @PostMapping("/cadastrar-patrimonio")
public String cadastrarPatrimonio(
        @RequestParam int idBloco,
        @RequestParam int idSala,
        @RequestParam String nomeFuncionario,
        @RequestParam int idCategoria,
        @RequestParam int idUnidade,
        @RequestParam int valorPatrimonio,
        @RequestParam LocalDate dataAquisicao
) {
    // Aqui você pode salvar os dados do patrimônio no banco de dados
    Patrimonio novoPatrimonio = new Patrimonio();
    novoPatrimonio.setId_bloco(idBloco);
    novoPatrimonio.setId_sala(idSala);
    novoPatrimonio.setNome_func(nomeFuncionario);
    novoPatrimonio.setId_cat(idCategoria);
    novoPatrimonio.setId_uni(idUnidade);
    novoPatrimonio.setValor_patri(valorPatrimonio);
    novoPatrimonio.setData_aqc(dataAquisicao);
    
    patrimonioRepository.save(novoPatrimonio);

    return "redirect:/"; // Redireciona para a página index após o cadastro ser realizado
}

}
