package org.example.mvc;

/**
 * author :  sanghoonkim
 * date : 2022/12/30
 */
public interface HandlerMapping {
    Object findHandler(HandlerKey handlerKey);

}
