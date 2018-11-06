package com.redistest;

import redis.clients.jedis.Jedis;

public class SimpleDemo {

    public static void main(String[] args) {
        //初始化jedis
        Jedis jedis = new Jedis("127.0.0.1", 6379);
        /**
         * 设置Jedis验证密码 jedis.auth("123");
         * 清空操作 jedis.flushDB();jedis.flushAll();
         */

        //--------字符串操作--------
    }
}
