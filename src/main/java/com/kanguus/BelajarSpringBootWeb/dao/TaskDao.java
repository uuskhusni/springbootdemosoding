package com.kanguus.BelajarSpringBootWeb.dao;

//import com.kanguus.BelajarSpringBootWeb.models.Mahasiswa;
import com.kanguus.BelajarSpringBootWeb.models.Task;
//import com.kanguus.BelajarSpringBootWeb.services.MahasiswaService;
import com.kanguus.BelajarSpringBootWeb.services.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import java.util.List;
//import com.kanguus.BelajarSpringBootWeb.models.Mahasiswa;

@Service
public class TaskDao implements TaskService {

    private EntityManagerFactory emf;


    @Autowired
    public void setEmf(EntityManagerFactory emf){
        this.emf = emf;
    }

    @Override
    public List<Task> listTask() {
        //return null;
        EntityManager em = emf.createEntityManager();
        return em.createQuery("from Task", Task.class).getResultList();
    }

    @Override
    public Task SaverorUpdate(Task task) {
        //return null;
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        Task saved = em.merge(task);
        em.getTransaction().commit();
        return saved;
    }

    @Override
    public Task getIdTask(Integer id) {
        EntityManager em = emf.createEntityManager();
        return em.find(Task.class, id);
    }

    @Override
    public void hapus(Integer id) {
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        em.remove(em.find(Task.class, id));
        em.getTransaction().commit();
    }
}
