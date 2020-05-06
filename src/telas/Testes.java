package telas;

import models.Agendamento;
import models.Cliente;
import models.Servico;
import models.Usuario;

public class Testes {

	public static void main(String[] args) {
		
		
		Cliente cliente = new Cliente("JONAS",'M',"44-9990-3533","787878565","Rua Trinta","45700000");
		Servico servico = new Servico(1,"corte",40);
		System.out.println(cliente.getEndereco());
		
		Usuario usuario = new Usuario("joao", 'M', "44-9990-3533", "787878565", "89898989", "TIPO_USUARIO");
        System.out.println(usuario.getTipoUsuario());
        
        Agendamento agendamento = new Agendamento(1, cliente, servico, 50, "10/02/2020  10:10");
        System.out.println(agendamento.getData());
        System.out.println(agendamento.getCliente().getNome());
	}

}
