package model.reposity;


import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import model.entity.LogAdmin;

import java.util.List;


public class LogAdminDAO extends GenericDAO<LogAdmin> {

    public LogAdminDAO() {
        super(LogAdmin.class);
    }

    public List<LogAdmin> findByUsuario(String usuario) {
        EntityManager em = getEntityManager();
        try {
            TypedQuery<LogAdmin> query = em.createQuery("SELECT l FROM LogAdmin l WHERE l.usuario = :usuario", LogAdmin.class);
            query.setParameter("usuario", usuario);
            return query.getResultList();
        } finally {
            em.close();
        }
    }
}

