package com.kanguus.BelajarSpringBootWeb.controllers;

import com.kanguus.BelajarSpringBootWeb.models.Mahasiswa;
import com.kanguus.BelajarSpringBootWeb.services.MahasiswaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MahasiswaController {

    /*8private MahasiswaService mahasiswaService;

    @Autowired
    public void setMahasiswaService(MahasiswaService mahasiswaService){
        this.mahasiswaService = mahasiswaService;
        //System.out.println("Hai");
    }

    @RequestMapping("/")
    public String home(Model model){
        model.addAttribute("mahasiswa", mahasiswaService.listMahasiswa());
        //System.out.println("Hai2");
        return "mahasiswa";
    }


    @RequestMapping("/mahasiswa")
    public String MahasiswaList(Model model){
        model.addAttribute("mahasiswa", mahasiswaService.listMahasiswa());
        //System.out.println("Hai2");
        return "mahasiswa";
    }

    @RequestMapping(value="/mahasiswa/create", method = RequestMethod.GET)
    public String tampilkanForm(Model model){
        model.addAttribute("mahasiswa", new Mahasiswa());
        return "formMahasiswa";
    }

    @RequestMapping(value="/mahasiswa/create", method = RequestMethod.POST)
    public String simpanDataMahasiswa(Model model, Mahasiswa mahasiswa){
        model.addAttribute("mahasiswa", mahasiswaService.SaverorUpdate(mahasiswa));
        return "redirect:/mahasiswa";
    }

    @RequestMapping(value="/mahasiswa/edit/{id}", method = RequestMethod.GET)
    public String editData(@PathVariable Integer id,  Model model){
        model.addAttribute("mahasiswa", mahasiswaService.getIdMahasiswa(id));
        return "formMahasiswa";
    }

    @RequestMapping(value="/mahasiswa/hapus/{id}")
    public String hapus(@PathVariable Integer id){
        mahasiswaService.hapus(id);
        return "redirect:/mahasiswa";
    }*/
}
