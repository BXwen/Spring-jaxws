package com.db.service.impl;

import com.db.service.TestService;
import org.springframework.stereotype.Service;

/**
 * @author Xiaowen
 * @Package com.db.service.impl
 **/
@Service
public class TestServiceImpl implements TestService {
    public String sayHello(String msg) {
        return msg;
    }
}
