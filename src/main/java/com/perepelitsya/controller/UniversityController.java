package com.perepelitsya.controller;

import com.perepelitsya.entity.University;
import com.perepelitsya.repository.UniversityRepository;
import com.perepelitsya.service.impls.UniversityServiceImpl;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by Andriu on 12.04.2017.
 */
@RestController
@RequestMapping(value = "/univer")
public class UniversityController {

    @Autowired
    private UniversityServiceImpl universityService;

    @Autowired
    private UniversityRepository universityRepository;



    @ApiOperation("Well. I can search all student of group")
    @RequestMapping(value = "/getAll", method = RequestMethod.GET)
    public List<University> getUniver()
    {
        return  universityService.getAll();
    }


    @ApiOperation("We can get All Universities")
    @RequestMapping(value = "/findbyfullname", method = RequestMethod.GET)
    public String finByFullname(@RequestParam("fullname") String fullname){
        String result = "";
        for (University university : universityRepository.findByFullname(fullname)) {
            result += university.toString();
        }
        return result;
    }
}
