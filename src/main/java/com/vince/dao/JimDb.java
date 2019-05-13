package com.vince.dao;

import org.springframework.stereotype.Service;
import redis.clients.jedis.Jedis;

import java.util.Set;

/**
 * Package: com.vince.dao
 * User: 段小秋
 * Email: duanxiaoqiu@jd.com
 * Date: 2019/4/10
 * Time: 11:01
 * Description:
 */
@Service
public class JimDb {
    private static Jedis jedis = null;

    private JimDb() {

    }

    public static Jedis getJimdb() {
        if (jedis == null) {
            jedis = new Jedis("localhost");
            return jedis;
        } else {
            return jedis;
        }
    }

    public static void set(String key, String value) {
        getJimdb().set(key, value);
    }

    public static Set<String> scan(String key){
        return getJimdb().keys(key);
    }

    public static String get(String key) {
        return getJimdb().get(key);
    }

    public static void rPush(String key, String... value) {
        getJimdb().rpush(key, value);
    }

    public static String lPop(String key) {
        return getJimdb().lpop(key);
    }

}
