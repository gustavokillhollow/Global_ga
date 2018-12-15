package br.com.gustavo.globalgames.config;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

public class ConnectionFactory {

   public static EntityManager manager;

    public static EntityManager getConnection()
    {
        if(manager == null)
            manager = Persistence.createEntityManagerFactory("locacao").createEntityManager();
        return  manager;
    }
}
