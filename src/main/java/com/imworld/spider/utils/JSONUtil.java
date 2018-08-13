package com.imworld.spider.utils;

import com.alibaba.fastjson.JSONObject;

import java.util.HashMap;
import java.util.Map;

public class JSONUtil {
    public static Map<String,Object> jsonParseMap(JSONObject json){
        Map<String,Object> jsonMap=new HashMap<>();
        for (String str:json.keySet()){
            jsonMap.put(str,json.get(str));
        }
        return jsonMap;
    }
}
