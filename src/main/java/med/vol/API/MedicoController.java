package med.vol.API;
import med.vol.API.endereco.Endereco;
import med.vol.API.medico.DadosCadastroMedico;
import med.vol.API.medico.Medico;
import med.vol.API.medico.MedicoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/medicos")
public class MedicoController {

    @Autowired
    private MedicoRepository repository;

    @PostMapping
    public void cadastrar(@RequestBody DadosCadastroMedico dados){
        repository.save(new Medico(dados));
    }
}



