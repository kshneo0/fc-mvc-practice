package org.example.mvc;

import org.example.mvc.controller.Controller;
import org.example.mvc.controller.HomeController;

import java.util.HashMap;
import java.util.Map;

/**
 * author :  sanghoonkim
 * date : 2022/12/30
 */
public class RequestMappingHandlerMapping {
    private Map<String, Controller> mappings = new HashMap<>();

    void init(){
        mappings.put("/",new HomeController());
    }

    public Controller findHandler(String uriPath) {
        return mappings.get(uriPath);
    }
}
