package controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class ArgowfStudyController {
	
    @GetMapping("/exit")
    public Integer exitWithCode(@RequestParam("param") int param) {
        if (param == 1) {
            return 1;
        } else if (param == 2) {
        	    return 2;
        } else {
        		return 99;  // 未定義パラメータは99を返す
        }
    }

}
