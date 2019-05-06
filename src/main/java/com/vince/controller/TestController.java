package com.vince.controller;

import com.vince.model.Enum.ResultEnum;
import com.vince.service.StudentService;
import com.vince.util.InvokeException;
import com.vince.util.Response;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Package: com.vince.controller
 * User: 诸葛子房
 * Email: xiaoiqu2017wy@163.com
 * Date: 2019/3/20
 * Time: 21:46
 * Description:
 */
@RequestMapping("/")
@Controller
@Slf4j
public class TestController {

    @Autowired
    private StudentService studentService;

    @Value("${user.name}")
    private String userName;

    @RequestMapping("/")
    @ResponseBody
    public String index() {
        log.debug("=======1=======" + userName);
        return "hello world";
    }

    /*@RequestMapping("/all")
    @ResponseBody
    public Response all() {
        return Response.from(1, "success", studentService.findAll());
    }

    @RequestMapping("/get")
    @ResponseBody
    public Response get(String name) {
        try {
            return Response.from(1, "success", studentService.getByName(name));
        } catch (InvokeException e1) {
            return Response.from(e1.getCode(), e1.getMessage());
        } catch (Exception e2) {
            return Response.from(ResultEnum.FAILED.toCode(), ResultEnum.FAILED.toName());
        }
    }*/

}
