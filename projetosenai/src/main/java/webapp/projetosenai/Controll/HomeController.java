package webapp.projetosenai.Controll;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import webapp.projetosenai.Model.Patrimonio;
import webapp.projetosenai.Repository.PatrimonioRepository;

@Controller
public class HomeController {

    @Autowired
    private PatrimonioRepository patrimonioRepository;

    @GetMapping("/")
    public String index() {
        return "index"; // Isso retorna o nome do arquivo HTML sem a extensão
    }
    
    @GetMapping("/cadastro")
    public String cadastro() {
        return "cadastro"; // Retorna o nome do arquivo de template
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
