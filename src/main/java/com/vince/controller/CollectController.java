package com.vince.controller;

/**
 * Package: com.vince.controller
 * User: 段小秋
 * Email: duanxiaoqiu@jd.com
 * Date: 2019/5/6
 * Time: 15:18
 * Description:
 */

import com.vince.model.Enum.ResultEnum;
import com.vince.util.Response;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@RestController
@RequestMapping("/kafka")
public class CollectController {
    protected final Logger logger = LoggerFactory.getLogger(this.getClass());
    @Autowired
    private KafkaTemplate kafkaTemplate;

    @RequestMapping(value = "/send", method = RequestMethod.GET)
    public Response sendKafka(HttpServletRequest request, HttpServletResponse response) {
        try {
            String message = request.getParameter("message");
            logger.info("kafka的消息={}", message);
            kafkaTemplate.send("test", "key", message);
            logger.info("发送kafka成功.");
            return Response.from(ResultEnum.SUCESS.toCode(), "发送kafka成功", null);
        } catch (Exception e) {
            logger.error("发送kafka失败", e);
            return Response.from(ResultEnum.FAILED.toCode(), "发送kafka失败", null);
        }
    }

}
