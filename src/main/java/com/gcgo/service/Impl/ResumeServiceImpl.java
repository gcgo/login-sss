package com.gcgo.service.Impl;

import com.gcgo.dao.ResumeDao;
import com.gcgo.pojo.Resume;
import com.gcgo.service.ResumeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class ResumeServiceImpl implements ResumeService {
    @Autowired
    private ResumeDao resumeDao;

    @Override
    public void save(Resume resume) {
        resumeDao.save(resume);
    }

    @Override
    public List<Resume> findAll() {
        return resumeDao.findAll();
    }

    @Override
    public Resume findById(Long id) {
        Optional<Resume> optional = resumeDao.findById(id);
        return optional.get();
    }

    @Override
    public void updateResume(Resume resume) {
        resumeDao.save(resume);
    }

    @Override
    public void deleteById(Long id) {
        resumeDao.deleteById(id);
    }
}
