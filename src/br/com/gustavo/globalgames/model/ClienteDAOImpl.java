package br.com.gustavo.globalgames.model;

import br.com.gustavo.globalgames.domain.Cliente;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
public class ClienteDAOImpl implements  ClienteDAO {

    @PersistenceContext
    EntityManager manager;

    @Override
    public void salvar(Cliente cliente) {
        manager.persist(cliente);
    }

    @Override
    public void findCPF(String cpf) {

    }

    @Override
    public List<Cliente> findAll() {
        return null;
    }
}
