package test.action;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by LK on 2017/9/26.
 */
@Controller
public class TestAct {
    @RequestMapping(value = "testMain")
    public String testMain(HttpServletRequest request, HttpServletResponse response, ModelMap model) {
        return "test/main";
    }

    @RequestMapping(value = "testAjax")
    public String testAjax(String temp, HttpServletRequest request, HttpServletResponse response, ModelMap model) {
        if (temp == null || temp.isEmpty()) {
            return "test/temp1";
        }
        if ("temp1".equals(temp)) {
            return "test/temp1";
        }
        if ("temp2".equals(temp)) {
            return "test/temp2";
        }
        if ("temp3".equals(temp)) {
            return "test/temp3";
        }
        return "test/main";
    }
}
