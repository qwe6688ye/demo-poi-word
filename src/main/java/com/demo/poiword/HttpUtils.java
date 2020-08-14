package com.demo.poiword;

import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;

public class HttpUtils {
    /**
     * description:
     *          通过图片URL地址得到文件流
     * @Author any
     * @Date 2020/8/14 11:51
     * @param url:图片地址
     * @return java.io.InputStream
     */
    public static InputStream getFileStream(String url){
        try {
            URL httpUrl = new URL(url);
            HttpURLConnection conn = (HttpURLConnection)httpUrl.openConnection();
            conn.setRequestMethod("GET");
            conn.setConnectTimeout(5 * 1000);
            InputStream inStream = conn.getInputStream();//通过输入流获取图片数据

            return inStream;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

}
