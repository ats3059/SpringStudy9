package hello.typeconverter.controller;

import hello.typeconverter.type.IpPort;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
public class HelloController {

    @GetMapping("/hello-v1")
    public String helloV1(HttpServletRequest request){
        String data = request.getParameter("data");// 문자 타입 조회
        Integer integer = Integer.valueOf(data);
        return "ok";
    }

    @GetMapping("/hello-v2")
    public String helloV2(Integer data){
        System.out.println("data = " + data);
        return "ok";
    }

    @GetMapping("/ip-port")
    public String ipPort(@RequestParam  IpPort ipPort){
        System.out.println("data = " + ipPort);
        return "ok";
    }


}
