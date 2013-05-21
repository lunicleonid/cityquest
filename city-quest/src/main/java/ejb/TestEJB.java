package ejb;

import persist.Persist;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 * Created with IntelliJ IDEA.
 * User: lunicl
 * Date: 13/05/13
 * Time: 14:15
 * To change this template use File | Settings | File Templates.
 */
@Stateless
public class TestEJB {
    @PersistenceContext
    private EntityManager em;

    public int increment(int i){
        em.persist(new Persist());
        return i + 5;
    }

    public long countSavedInstances(){
        return em.createQuery("select count(*) from Persist p", Long.class).getSingleResult();
    }
}
