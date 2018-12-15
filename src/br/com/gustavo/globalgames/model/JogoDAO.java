package br.com.gustavo.globalgames.model;

import br.com.gustavo.globalgames.domain.Jogo;

import java.util.List;

public interface JogoDAO {

    public void salvar(Jogo jogo);

    public List<Jogo> findAll();
}
