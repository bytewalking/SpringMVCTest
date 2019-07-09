import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

public class MyHandler implements Controller {

    @Override
    public ModelAndView handleRequest(javax.servlet.http.HttpServletRequest httpServletRequest, javax.servlet.http.HttpServletResponse httpServletResponse) throws Exception {
        // 装载模型数据和逻辑视图
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("name","Tom");
        modelAndView.setViewName("show");
        return modelAndView;
    }
}
