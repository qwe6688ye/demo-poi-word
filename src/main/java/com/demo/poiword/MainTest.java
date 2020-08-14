<<<<<<< HEAD
package com.demo.poiword;


import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
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

    @RequestMapping("/test/mydocx")
    public void exportWord(HttpServletResponse response) throws IOException, InvalidFormatException {

        String path="F:\\testmodel\\model.docx";
        Map<String,Object> params=new HashMap<>();
        String filename="mydocxtest.docx";

        //一个单元格内一行字
        params.put("name","张三");
        params.put("sex","男");

        //一个单元格内多行字
        List<String> hobby=new ArrayList<>();
        hobby.add("1、打篮球");
        hobby.add("2、打羽毛球");
        hobby.add("3、游泳");
        params.put("hobby",hobby);


        //图片参数1 多张图片 图片多行竖排排列
        List<Map<String,Object>> imgs1List=new ArrayList<>();
        Map<String,Object> img=new HashMap<>();
        img.put("style",2);
        img.put("imgpath","F:\\mytestimg\\testimg1.jpg");
        imgs1List.add(img);
        img=new HashMap<>();
        img.put("style",2);
        img.put("imgpath","https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1597386736254&di=e25ddaabbe7e9259f00008f087cc8ab7&imgtype=0&src=http%3A%2F%2Fimg.mukewang.com%2Fszimg%2F5e3ae4bd096481b210320850.jpg");
        imgs1List.add(img);
        params.put("workimg",imgs1List);

        //图片参数2 多张图片 一行内横排排列
        List<Map<String,Object>> imgs2List=new ArrayList<>();
        Map<String,Object> img2=new HashMap<>();
        img2.put("style",1);
        img2.put("imgpath","F:\\mytestimg\\sign1.png");
        imgs2List.add(img2);
        img2=new HashMap<>();
        img2.put("style",1);
        img2.put("imgpath","F:\\mytestimg\\sign2.png");
        imgs2List.add(img2);
        img2=new HashMap<>();
        img2.put("style",1);
        img2.put("imgpath","F:\\mytestimg\\sign3.png");
        imgs2List.add(img2);
        params.put("signimg",imgs2List);


        //图片参数3 单张图片
        Map<String,Object> img3=new HashMap<>();
        img3.put("imgpath","F:\\mytestimg\\testimg1.jpg");
        params.put("otherimg",img3);

        wordUtils.exportWord(path,params,filename,response);
    }



}
=======
package com.demo.poiword;


import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.OutputStream;
import java.util.HashMap;
import java.util.Map;

@RestController
public class MainTest {
    @Autowired
    private WordUtils wordUtils;

    public void exportWord(HttpServletResponse response) throws IOException, InvalidFormatException {
        String path="";
        Map<String,Object> params=new HashMap<>();
        String filename="";
        wordUtils.exportWord(path,params,filename,response);

    }
}
>>>>>>> 620d3b1a5311b01f5fd49b3fdc870b3d93f23318
