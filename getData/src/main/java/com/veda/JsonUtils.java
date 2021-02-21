package com.veda;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONException;

/**
 * @Author: fyq
 * @Date: Create in 22:19 2021/2/18
 * @Desc:
 */
public class JsonUtils {
    public static boolean isJSONValidate(String log){
        try {
            JSON.parse(log);
            return true;
        }catch (JSONException e){
            return false;
        }
    }

}
