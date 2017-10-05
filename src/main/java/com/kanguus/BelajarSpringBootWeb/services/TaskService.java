package com.kanguus.BelajarSpringBootWeb.services;


import com.kanguus.BelajarSpringBootWeb.models.Task;

import java.util.List;

public interface TaskService {
    List<Task> listTask();

    Task SaverorUpdate(Task task);

    Task getIdTask(Integer id);

    void hapus (Integer id);
}

