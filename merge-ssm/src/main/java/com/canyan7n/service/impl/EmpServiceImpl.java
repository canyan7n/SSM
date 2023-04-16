package com.canyan7n.service.impl;

import com.canyan7n.mapper.EmpMapper;
import com.canyan7n.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author ：macheng
 * @version V1.0
 * @ClassName :EmpServiceImpl
 * @date ：2023/4/15 17:43
 * @description：TODO
 */
@Service
public class EmpServiceImpl implements EmpService {

    @Autowired
    private EmpMapper empMapper;
}
