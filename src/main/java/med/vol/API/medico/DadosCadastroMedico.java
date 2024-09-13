package med.vol.API.medico;

import med.vol.API.endereco.Endereco;

public record DadosCadastroMedico(String nome, String email, String crm, Especialidade especialidade, Endereco endereco){
}
