package br.com.gustavo.globalgames.model;

import br.com.gustavo.globalgames.domain.Cliente;

import java.util.List;

public interface ClienteDAOImpl {

    public void salvar(Cliente cliente);

    public void findCPF(String cpf);

    public List<Cliente> findAll();
}
