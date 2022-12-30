package org.example.mvc.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * author :  sanghoonkim
 * date : 2022/12/30
 */
public interface Controller {
    String handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception;
}
