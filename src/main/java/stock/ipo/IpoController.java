package stock.ipo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/ipo")
public class IpoController {
    @RequestMapping(value = "/main")
    public void main() {
        System.out.println("main test");
    }
}
