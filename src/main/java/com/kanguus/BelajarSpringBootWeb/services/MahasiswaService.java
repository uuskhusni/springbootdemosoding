package com.kanguus.BelajarSpringBootWeb.services;

import com.kanguus.BelajarSpringBootWeb.models.Mahasiswa;

import java.util.List;

public interface MahasiswaService {
    List<Mahasiswa> listMahasiswa();

    Mahasiswa SaverorUpdate(Mahasiswa mahasiswa);

    Mahasiswa getIdMahasiswa(Integer id);

    void hapus (Integer id);
}
