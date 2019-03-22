package com.vince.service.impl;

import com.vince.dao.StudentDao;
import com.vince.model.Enum.ResultEnum;
import com.vince.model.StudentEbo;
import com.vince.service.StudentService;
import com.vince.util.InvokeException;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Package: com.vince.service.impl
 * User: 诸葛子房
 * Email: xiaoiqu2017wy@163.com
 * Date: 2019/3/21
 * Time: 11:42
 * Description:
 */
@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentDao studentDao;

    @Override
    public List<StudentEbo> findAll() {
        return studentDao.findAll();
    }

    @Override
    public List<StudentEbo> getByName(String name) throws Exception {
        if (StringUtils.isBlank(name)) {
            throw new InvokeException(ResultEnum.FAILED.toCode(), "name不能为空");
        }
        return studentDao.listStu(name);
    }
}
