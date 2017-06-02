package com.perepelitsya.service.interfaces;

import com.perepelitsya.entity.Student;

import java.util.List;

/**
 * Created by Andriu on 10.04.2017.
 */
public interface IStudentService {
    Student save(Student student);
    Student update(Student student);
    void delete(long id);
    List<Student> getAll();
    String infoStudent();

}
