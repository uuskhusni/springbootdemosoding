package com.kanguus.BelajarSpringBootWeb.dao;

import com.kanguus.BelajarSpringBootWeb.models.Mahasiswa;
import com.kanguus.BelajarSpringBootWeb.services.MahasiswaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import java.util.List;
import com.kanguus.BelajarSpringBootWeb.models.Mahasiswa;

@Service
public class MahasiswaDao implements MahasiswaService {

    private EntityManagerFactory emf;


    @Autowired
    public void setEmf(EntityManagerFactory emf){
        this.emf = emf;
    }

    @Override
    public List<Mahasiswa> listMahasiswa() {
        //return null;
        EntityManager em = emf.createEntityManager();
        return em.createQuery("from Mahasiswa", Mahasiswa.class).getResultList();
    }

    @Override
    public Mahasiswa SaverorUpdate(Mahasiswa mahasiswa) {
        //return null;
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        Mahasiswa saved = em.merge(mahasiswa);
        em.getTransaction().commit();
        return saved;
    }

    @Override
    public Mahasiswa getIdMahasiswa(Integer id) {
        EntityManager em = emf.createEntityManager();
        return em.find(Mahasiswa.class, id);
    }

    @Override
    public void hapus(Integer id) {
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        em.remove(em.find(Mahasiswa.class, id));
        em.getTransaction().commit();
    }
}
