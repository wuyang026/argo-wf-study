import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

@SpringBootApplication
@RestController
public class ExitCodeApplication {

    public static void main(String[] args) {
        SpringApplication.run(ExitCodeApplication.class, args);
    }

    @GetMapping("/exit")
    public void exitWithCode(@RequestParam("param") int param) {
        if (param == 1) {
            System.exit(1);
        } else if (param == 2) {
            System.exit(2);
        } else {
            System.exit(99);  // 未定義パラメータは99を返す
        }
    }
}
