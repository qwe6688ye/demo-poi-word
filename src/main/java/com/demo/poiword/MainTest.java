package com.demo.poiword;


import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class MainTest {
    @Autowired
    private WordUtils wordUtils;

    public void exportWord(HttpServletResponse response) throws IOException, InvalidFormatException {
        String path="";
        Map<String,Object> params=new HashMap<>();
        String filename="";
        //图片参数 1 多张图片
        Map<String,Object> imgs1=new HashMap<>();
        imgs1.put("style",1);
        imgs1.put("imgpath","E:\\studydemo\\poi-word");
        List<Map<String,Object>> list=new ArrayList<>();
        list.add(imgs1);

        wordUtils.exportWord(path,params,filename,response);

    }
}
