package com.ssm.mapper;

import com.ssm.model.Test;

public interface TestMapper {
    Test selectByPrimaryKey(Integer id);
}
