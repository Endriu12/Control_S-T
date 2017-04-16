package com.perepelitsya.service.impls;

import com.perepelitsya.entity.GroupStudent;
import com.perepelitsya.repository.GroupStudentRepository;
import com.perepelitsya.service.interfaces.IGroupStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Andriu on 10.04.2017.
 */
@Service
public class GroupStudentServiceImpl implements IGroupStudentService {

    @Autowired
    private GroupStudentRepository groupStudentRepository;

    @Override
    public List<GroupStudent> getAllGroup() {
        return  groupStudentRepository.findAll();
    }

    @Override
    public void delete(long id) {
        groupStudentRepository.delete(id);
    }

    @Override
    public GroupStudent save(GroupStudent groupStudent) {
        GroupStudent saved = groupStudentRepository.saveAndFlush(groupStudent);
        return saved;
    }

    @Override
    public GroupStudent update(GroupStudent groupStudent) {
        return groupStudentRepository.saveAndFlush(groupStudent);
    }

}
