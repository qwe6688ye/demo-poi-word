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
