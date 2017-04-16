package com.perepelitsya.service.impls;

import com.perepelitsya.entity.Student;
import com.perepelitsya.repository.StudentRepository;
import com.perepelitsya.service.interfaces.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Andriu on 10.04.2017.
 */
@Service
public class StudentServiceImpl implements IStudentService {

    @Autowired
    private StudentRepository studentRepository;

    @Override
    public Student save(Student student) {
        Student saved = studentRepository.saveAndFlush(student);
        return saved;
    }

    @Override
    public Student update(Student student) {
        return studentRepository.saveAndFlush(student);
    }

    @Override
    public void delete(long id) {
        studentRepository.delete(id);
    }

    @Override
    public List<Student> getAll() {
        return studentRepository.findAll();
    }

    @Override
    public String infoStudent() {
        String a = null;
        try {
            for (Student st : studentRepository.findAll()) {
                a += st.toString() + st.getGroupStudent().toString() + st.getGroupStudent().getFaculty().toString() + st.getGroupStudent().getFaculty().getUniversity().toString();
            }
        }
        catch (Exception e){
            e.getMessage();

        }
        return a;
    }
}