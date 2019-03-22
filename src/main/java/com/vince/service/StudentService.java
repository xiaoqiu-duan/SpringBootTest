package com.vince.service;

import com.vince.model.StudentEbo;
import com.vince.util.InvokeException;

import java.util.List;

/**
 * Package: com.vince.service
 * User: 诸葛子房
 * Email: xiaoiqu2017wy@163.com
 * Date: 2019/3/21
 * Time: 11:41
 * Description:
 */
public interface StudentService {
    List<StudentEbo> findAll();

    List<StudentEbo> getByName(String name) throws Exception;
}
