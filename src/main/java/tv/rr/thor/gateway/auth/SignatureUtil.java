package tv.rr.thor.gateway.auth;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

/**
 *
 * @title 数字签名工具�?
 * @description
 * @usage
 * @copyright Copyright 2014 RENRENMEIJU Corporation. All rights reserved.
 * @company 上海众多美网络科�?有限公司
 * @author Jimmy
 * @create 2017�?12�?13�? 上午10:56:11
 */
public class SignatureUtil {

    /**
     * 校验前面是否正确
     * @param paramsMap    参数map
     * @param secretKey    约定的秘�?
     * @param sign        待验证的sign
     * @return
     * @author Shenfeng
     */
    public static boolean validateSign(Map<String, String> paramsMap, String secretKey, String sign) {
        if (sign != null) {
            return sign.equals(SignatureUtil.createSign(paramsMap, secretKey));
        }
        return false;
    }

    /**
     * 生成数字签名
     * @param paramsMap    参数列表
     * @param secretKey    约定的秘�?
     * @return
     * @author Shenfeng 2017�?12�?13日上�?10:57:12
     */
    public static String createSign(Map<String, String> paramsMap, String secretKey) {
        Map<String, String> sortedMap = SignatureUtil.sortMapByKey(paramsMap);
        StringBuffer md5SourceBuffer = new StringBuffer();
        for (String key : sortedMap.keySet()) {
            String value = sortedMap.get(key);
            if (!value.isEmpty()) {
                md5SourceBuffer.append(key).append("=").append(value).append("&");
            }
        }
        md5SourceBuffer.append(secretKey);
        String md5Sign = md5SourceBuffer.toString();
        return SimpleMD5.md5(md5Sign);
    }

    private static Map<String, String> sortMapByKey(Map<String, String> map) {
        if (map == null || map.isEmpty()) {
            return null;
        }

        Map<String, String> sortMap = new TreeMap<String, String>(new Comparator<String>() {
            public int compare(String str1, String str2) {
                return str1.compareTo(str2);
            }
        });

        sortMap.putAll(map);

        return sortMap;
    }

    public static void main(String[] args) {

        String secretKey = "cOyM1VOd7x2JzQzkjs5R3vtDNmkjutOn";
        Map<String, String> paramsMap = new HashMap<>();

        paramsMap.put("accessToken", "ya29.GmfeBgQq4n7Dy1_3WUmAOtczlaKTkHlY7h8z273n85QR1794bFI4jC_R7QKfE6S6XgwOT88CeF56AlKB6WN62a0tEYPDuPD2hbimJgEzjyvdUGZBu4MtqFMiWCHTF1CpTDvdEcCUxLZ4");
        long time = System.currentTimeMillis();
        paramsMap.put("time", time+"");
        System.out.println(time);
        String sign = SignatureUtil.createSign(paramsMap, secretKey);
        System.out.println(sign);

    }

}
