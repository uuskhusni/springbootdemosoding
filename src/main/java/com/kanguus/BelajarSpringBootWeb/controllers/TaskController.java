package com.kanguus.BelajarSpringBootWeb.controllers;

import com.kanguus.BelajarSpringBootWeb.models.Mahasiswa;
import com.kanguus.BelajarSpringBootWeb.models.Task;
//import com.kanguus.BelajarSpringBootWeb.services.MahasiswaService;
import com.kanguus.BelajarSpringBootWeb.services.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class TaskController {

    private TaskService taskService;

    @Autowired
    public void setTaskService(TaskService taskService){
        this.taskService = taskService;
        //System.out.println("Hai");
    }

    @RequestMapping("/")
    public String home(Model model){
        //model.addAttribute("task", taskService.listTask());
        //System.out.println("Hai2");
        return "taskhome";
    }


    @RequestMapping("/task")
    public String TaskList(Model model){
        model.addAttribute("task", taskService.listTask());
        //System.out.println("Hai2");
        return "task";
    }

    @RequestMapping(value="/task/create", method = RequestMethod.GET)
    public String tampilkanForm(Model model){
        model.addAttribute("task", new Task());
        return "formTask";
    }

    @RequestMapping(value="/task/create", method = RequestMethod.POST)
    public String simpanDataTask(Model model, Task task){
        model.addAttribute("task", taskService.SaverorUpdate(task));
        return "redirect:/task";
    }

    @RequestMapping(value="/task/edit/{id}", method = RequestMethod.GET)
    public String editData(@PathVariable Integer id,  Model model){
        model.addAttribute("task", taskService.getIdTask(id));
        return "formTask";
    }

    @RequestMapping(value="/task/hapus/{id}")
    public String hapus(@PathVariable Integer id){
        taskService.hapus(id);
        return "redirect:/task";
    }
}
