package com.tpb.TPB;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@RestController
public class TpbApplication {

	public static void main(String[] args) {
		SpringApplication.run(TpbApplication.class, args);
	}
	@GetMapping("/hello")
	public String hello(@RequestParam(value = "name", defaultValue = "World") String name) {
		return String.format("Hello %s!", name);
	}
	@GetMapping("/cadastro_paciente")
	public void cadastro_paciente(
			@RequestParam(value = "nome", required = true) String nome,
			@RequestParam(value = "cpf", required = true) String cpf,
			@RequestParam(value = "dataNasc", required = true) String dataNasc,
			@RequestParam(value = "nomeMae", required = true) String nomeMae,
			@RequestParam(value = "telefone", required = true) String telefone,
			@RequestParam(value = "cep", required = true) String cep,
			@RequestParam(value = "cns", required = true) String cns


	){}

	@GetMapping("/cadastro_profissional")
	public void cadastro_profissional(
			@RequestParam(value = "nome", required = true) String nome,
			@RequestParam(value = "cpf", required = true) String cpf,
			@RequestParam(value = "dataNasc", required = true) String dataNasc,
			@RequestParam(value = "nomeMae", required = true) String nomeMae,
			@RequestParam(value = "telefone", required = true) String telefone,
			@RequestParam(value = "cep", required = true) String cep,
			@RequestParam(value = "conselho", required = true) String conselho,
			@RequestParam(value = "numeroConselho", required = true) String numeroConselho,
			@RequestParam(value = "cns", required = true) String cns,
			@RequestParam(value = "cbo", required = true) String cbo
	){}

	@GetMapping("/registrar_consulta")
	public void registrar_consulta(
			@RequestParam(value = "paciente", required = true) Integer registroPaciente,
			@RequestParam(value = "medico", required = true) Integer registroMedico
	){}


}