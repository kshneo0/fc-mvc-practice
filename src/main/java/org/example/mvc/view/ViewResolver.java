package org.example.mvc.view;

/**
 * author :  sanghoonkim
 * date : 2022/12/30
 */
public interface ViewResolver {
    View resolveView(String viewName);
}
