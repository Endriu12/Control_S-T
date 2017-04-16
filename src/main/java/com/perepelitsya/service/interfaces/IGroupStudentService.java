package com.perepelitsya.service.interfaces;

import com.perepelitsya.entity.GroupStudent;

import java.util.List;

/**
 * Created by Andriu on 10.04.2017.
 */
public interface IGroupStudentService {

    List<GroupStudent> getAllGroup();
    void delete(long id);
    GroupStudent save(GroupStudent groupStudent);
    GroupStudent update(GroupStudent groupStudent);
}
