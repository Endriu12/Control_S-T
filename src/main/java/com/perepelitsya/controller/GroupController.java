package com.perepelitsya.controller;

import com.perepelitsya.entity.GroupStudent;
import com.perepelitsya.repository.GroupStudentRepository;
import com.perepelitsya.service.impls.GroupStudentServiceImpl;
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
@RequestMapping(value = "/group")
public class GroupController {

    @Autowired
    private GroupStudentRepository groupStudentRepository;

    @Autowired
    private GroupStudentServiceImpl groupStudentService;

    @ApiOperation("Well. I can search all student of group")
    @RequestMapping(value = "/getAll", method = RequestMethod.GET)
    public List<GroupStudent> getGroup()
    {
        return  groupStudentService.getAllGroup();
    }

    @ApiOperation("We search by username")
    @RequestMapping(value = "/findbyusername", method = RequestMethod.GET)
    public String findByName(@RequestParam("name") String name) throws Exception {
        String result = "";
        for (GroupStudent groupStudent : groupStudentRepository.findByName(name)) {
            result += groupStudent.getStudentSet();
        }
        return result;
    }
}