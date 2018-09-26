package bootwildfly;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWildFlyController {
    
    final DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");


    @RequestMapping("hello")
    public String sayHello(){
        return ("Hello, SpringBoot on Wildfly");
    }
    
    
    @RequestMapping("horaoficial")
    public String getHoraOficial(){
        System.out.println(dateFormat.format(now.getTime()))
        return ("HoraOficial");
    }
}
