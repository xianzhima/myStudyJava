package controller;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class hhh {

    //设定当前方法的访问映射地址
    @RequestMapping("/save")
    //设置当前方法返回值类型为String，用于指定请求完成后跳转的页面
    public String save(){
        System.out.println("user mvc controller is running ...");
        //设定具体跳转的页面
        return "hhhx.jsp";
    }

}
