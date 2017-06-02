package com.perepelitsya.controller;

import com.perepelitsya.dto.StudentDto;
import com.perepelitsya.entity.Student;
import com.perepelitsya.repository.StudentRepository;
import com.perepelitsya.service.impls.StudentServiceImpl;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by Andriu on 10.04.2017.
 */
@RestController
@RequestMapping(value = "/student")

public class StudentController {

    @Autowired
    private StudentRepository studentRepository;

    @Autowired

    private StudentServiceImpl studentService;

//    @ApiOperation("Let create a new student")
//    @RequestMapping(value = "/save", method = RequestMethod.POST)
//    public Student save(@Reques1tBody Student student) {
//        return studentService.save(student);
//    }

    @ApiOperation(value = "Save new User")
    @RequestMapping(value = "save", method = RequestMethod.POST)
    public ResponseEntity<Student> saveAccout(@RequestBody StudentDto studentDto) {
        Student student = new Student();
        student.setUsername(studentDto.getUsername());
        student.setPassword(studentDto.getPassword());
        student.setGender(studentDto.getGender());
        student.setEmail(studentDto.getEmail());
        student.setBirthDay(studentDto.getBirthDay());
        student.setPhoneNumber(studentDto.getPhoneNumber());
        studentService.save(student);
        return new ResponseEntity<Student>(student, HttpStatus.CREATED);

    }

    @ApiOperation(value = "I dont know what it is")
    @RequestMapping(value = "getAll", method = RequestMethod.GET)
    public List<Student> getAll() {
        return studentService.getAll();
    }

    @ApiOperation(value = "Delete User!")
    @RequestMapping(value = "delete/{id}", method = RequestMethod.POST)
    public ResponseEntity<String> removeAccount(@PathVariable("id") Long id) {
        Student student = studentRepository.getOne(id);
        studentRepository.delete(student);
        return new ResponseEntity<String>(HttpStatus.OK);
    }

    @ApiOperation(value = "Find by ID")
    @RequestMapping(value = "/findby/{id}", method = RequestMethod.GET)
    public Student findById(@RequestParam("id") Long id) {
        return studentRepository.findOne(id);
    }

//    @ApiOperation(value = "Find by Username")
//    @RequestMapping(value = "/findby/{username}", method = RequestMethod.GET)
//    public String findStudentByLastName(@RequestParam("username") String username) {
//        String result = new String();
//        result = String.valueOf(studentRepository.findByUsername(username));
//        return result;
//    }


    @ApiOperation(value = "Find by Username")
    @RequestMapping(value = "/findby/{username}", method = RequestMethod.GET)
    public String findStudentByLastName(@RequestParam("username") String username) {
        String result = new String();
        result = String.valueOf(studentRepository.findByUsername(username));
        return result;
    }

    @ApiOperation(value = "Info About All")
    @RequestMapping(value = "/info", method = RequestMethod.GET)
    public String num() {
        return studentService.infoStudent();
    }

}