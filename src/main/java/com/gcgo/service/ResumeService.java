package com.gcgo.service;

import com.gcgo.pojo.Resume;

import java.util.List;

public interface ResumeService {
    //新增
    public void save(Resume resume);

    //查询所有
    public List<Resume> findAll();

    //修改
    public void updateResume(Resume resume);

    //删除
    public void deleteById(Long id);
}
