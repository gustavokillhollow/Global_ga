package br.com.gustavo.globalgames.model;

import br.com.gustavo.globalgames.domain.Jogo;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;

@Transactional
@Repository
public class JogoDAOImpl implements JogoDAO {

    @PersistenceContext
    EntityManager manager;

    @Override
    public void salvar(Jogo jogo) {
        manager.persist(jogo);
    }

    @Override
    public List<Jogo> findAll() {
        Query query = manager.createQuery("from Jogo");
        return query.getResultList();
    }
}
