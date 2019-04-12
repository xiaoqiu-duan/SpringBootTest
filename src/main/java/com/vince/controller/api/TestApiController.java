package com.vince.controller.api;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Package: com.vince.controller.api
 * User: 段小秋
 * Email: duanxiaoqiu@jd.com
 * Date: 2019/3/29
 * Time: 17:19
 * Description:
 */
@RequestMapping("/test/api/")
@Controller
@Slf4j
public class TestApiController {

    @RequestMapping("test.ajax")
    @ResponseBody
    public String test() {
        return "123";
    }

}
