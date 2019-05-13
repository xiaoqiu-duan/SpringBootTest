package com.vince;

import com.vince.dao.JimDb;
import org.junit.Test;

/**
 * Package: com.vince
 * User: 段小秋
 * Email: duanxiaoqiu@jd.com
 * Date: 2019/5/6
 * Time: 16:33
 * Description:
 */
public class XQTest {

    @Test
    public void testHbase(){


        /*hbaseService.createTableBySplitKeys("test_base", Arrays.asList("f","back"),hbaseService.getSplitKeys(null));

        //插入三条数据
        hbaseService.putData("test_base","66804_000001","f",new String[]{"project_id","varName","coefs","pvalues","tvalues","create_time"},new String[]{"40866","mob_3","0.9416","0.0000","12.2293","null"});
        hbaseService.putData("test_base","66804_000002","f",new String[]{"project_id","varName","coefs","pvalues","tvalues","create_time"},new String[]{"40866","idno_prov","0.9317","0.0000","9.8679","null"});
        hbaseService.putData("test_base","66804_000003","f",new String[]{"project_id","varName","coefs","pvalues","tvalues","create_time"},new String[]{"40866","education","0.8984","0.0000","25.5649","null"});

        //查询数据
        //1. 根据rowKey查询
        Map<String,String> result1 = hbaseService.getRowData("test_base","66804_000001");
        System.out.println("+++++++++++根据rowKey查询+++++++++++");
        result1.forEach((k,value) -> {
            System.out.println(k + "---" + value);
        });
        System.out.println();*/
    }


    @Test
    public void redisTest(){

        JimDb.getJimdb().pfadd("uuid","testa");
        JimDb.getJimdb().pfadd("uuid","testb");
        JimDb.getJimdb().pfadd("uuid","testb");
        System.out.println(JimDb.getJimdb().pfcount("uuid"));
        System.out.println(JimDb.getJimdb().pfcount("uuid1"));
        /*JimDb.getJimdb().set("test_1","123");
        JimDb.getJimdb().set("test_2","234");
        System.out.println(JimDb.getJimdb().keys("test_*").size());*/
    }

}
