package com.perepelitsya.controller;

import com.perepelitsya.entity.Faculty;
import com.perepelitsya.repository.FacultyRepository;
import com.perepelitsya.service.impls.FacultyServiceImpl;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by Andriu on 12.04.2017.
 */
@RestController
@RequestMapping(value = "/faculty")
public class FacultyController {

    @Autowired
    private FacultyRepository facultyRepository;

    @Autowired
    private FacultyServiceImpl facultyService;

    @ApiOperation("Well. We need to get All info about all facuty")
    @RequestMapping(value = "/getAll", method = RequestMethod.GET)
    public List<Faculty> getAll(){
        return facultyService.getAll();
    }
}
