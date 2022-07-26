package hawk.controller;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@Controller
public class HiddenController {

    @GetMapping("/hidden")
    public String index(Model model) {
        model.addAttribute("title", "Hidden Page");
        return "hidden";
    }

    @GetMapping("/hidden/hidden2")
    public String jwtAuth(Model model) {
        model.addAttribute("title", "Rando hidden page");
        return "hidden2";
    }

    @GetMapping("/hidden/BitLocker")
    @ResponseStatus(code = HttpStatus.FOUND)
    public String bitLocker(Model model) {
        model.addAttribute("title", "BitLocker");
        return "Class Level HTTP Status Overriden. The HTTP Status will be FOUND (CODE 302)";
    }
}
