package com.perepelitsya.service.impls;

import com.perepelitsya.entity.University;
import com.perepelitsya.repository.UniversityRepository;
import com.perepelitsya.service.interfaces.IUniversityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Andriu on 10.04.2017.
 */
@Service
public class UniversityServiceImpl implements IUniversityService {

    @Autowired
    private UniversityRepository universityRepository;

    @Override
    public List<University> getAll() {
        return universityRepository.findAll();
    }

    @Override
    public void delete(long id) {
        universityRepository.delete(id);
    }

    @Override
    public University save(University university) {
     University saved = universityRepository.saveAndFlush(university);
     return saved;
    }

    @Override
    public University update(University university) {
        return universityRepository.saveAndFlush(university);
    }
}