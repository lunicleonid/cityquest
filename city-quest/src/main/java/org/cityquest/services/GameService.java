package org.cityquest.services;

import org.cityquest.model.Game;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;
import java.util.logging.Logger;


@Stateless
public class GameService {
    private static final Logger log = Logger.getLogger(GameService.class.getName());

    @PersistenceContext
    private EntityManager em;

    public void save(Game o) {
        em.persist(o);
    }

    public List list() {
        List list = em.createQuery("select g from org.cityquest.model.Game g").getResultList();
        if(list.size() == 0){
            log.warning("LIST zero waaa");
        }
        return list;
    }
}
