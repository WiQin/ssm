package com.ssm.service.impl;

/**
 * @ClassName TestServiceImpl
 * @Description
 * @Author Wangyw
 */
import com.ssm.mapper.TestMapper;
import com.ssm.model.Test;
import com.ssm.service.TestService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service("/testService")
public class TestServiceImpl implements TestService {
    @Autowired
    private TestMapper testMapper;

    public Test getById(int id) {
        return testMapper.selectByPrimaryKey(id);
    }
}
