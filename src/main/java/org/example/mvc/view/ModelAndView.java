package org.example.mvc.view;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * author :  sanghoonkim
 * date : 2022/12/30
 */
public class ModelAndView {
    private Object view;
    private Map<String, Object> model = new HashMap<>();
    public ModelAndView(String viewName) {
        view = viewName;
    }

    public Map<String,Object> getModel() {
        return Collections.unmodifiableMap(model);
    }

    public String getViewName() {
        return (this.view instanceof String? (String) this.view : null);
    }
}
