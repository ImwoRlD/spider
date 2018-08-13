package com.imworld.spider.utils;

import com.alibaba.fastjson.JSONObject;

import java.util.Map;

public class TestMain {
    public static void main(String[] args){
        String s="{\"site_name\":\"信用中国-南京（正式环境）\",\"domain\":\"http://www.njcredit.gov.cn/cx/tyshxydm/\",\"table\":\"CreditChina\",\"user_agent\":\"Mozilla/5.0 (Windows NT 6.1; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/50.0.2661.87 Safari/537.36\",\"charset\":\"UTF-8\",\"retry_times\":5,\"sleep_times\":5,\"crawler\":\"GenericSpider\",\"effect\":\"信用南京企业名录爬虫\",\"occurs\":4,\"penalty\":1,\"download_strategy\":\"eager\",\"timeout\":30,\"proxy_group\":\"\",\"support_hamster\":0,\"linkAddress\":[{\"value\":\"http://app\\\\.nanjing\\\\.gov\\\\.cn/cxnj/qy/njqy_list_xy.jsp\\\\?callback=jQuery&iCurrPage=\\\\d+&iPageSize=\\\\d+\"}],\"urls_reg\":\"[\\\"http://app\\\\\\\\.nanjing\\\\\\\\.gov\\\\\\\\.cn/cxnj/qy/njqy_list_xy.jsp\\\\\\\\?callback=jQuery&iCurrPage=\\\\\\\\d+&iPageSize=\\\\\\\\d+\\\"]\",\"pages_reg\":\"[{\\\"url_regex\\\":\\\"http://app\\\\\\\\.nanjing\\\\\\\\.gov\\\\\\\\.cn/cxnj/qy/njqy_list_xy.jsp\\\\\\\\?callback=jQuery&iCurrPage=\\\\\\\\d+&iPageSize=\\\\\\\\d+\\\",\\\"section\\\":\\\"detail\\\",\\\"_url\\\":\\\"\\\",\\\"xpath\\\":\\\"content\\\",\\\"max_count\\\":100001,\\\"fields\\\":[{\\\"jsoup\\\":false,\\\"key\\\":\\\"UNICD\\\",\\\"value\\\":\\\"qyzch\\\"},{\\\"jsoup\\\":false,\\\"key\\\":\\\"COMPANYNAME\\\",\\\"value\\\":\\\"qymc\\\"},{\\\"jsoup\\\":false,\\\"key\\\":\\\"ESDATE\\\",\\\"value\\\":\\\"slrq\\\"}]}]\",\"fieldAddress\":[{\"section\":\"detail\",\"url_regex\":\"http://app\\\\.nanjing\\\\.gov\\\\.cn/cxnj/qy/njqy_list_xy.jsp\\\\?callback=jQuery&iCurrPage=\\\\d+&iPageSize=\\\\d+\",\"xpath\":\"content\",\"URL\":false,\"_url\":\"\",\"max_count\":100001,\"fields\":[{\"jsoup\":false,\"key\":\"UNICD\",\"value\":\"qyzch\"},{\"jsoup\":false,\"key\":\"COMPANYNAME\",\"value\":\"qymc\"},{\"jsoup\":false,\"key\":\"ESDATE\",\"value\":\"slrq\"}]}]}";
        JSONObject json=JSONObject.parseObject(s);
        Map mao=JSONUtil.jsonParseMap(json);
        String ss="";
    }
}
