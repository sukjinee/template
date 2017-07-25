package adcapsulecms.cms;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.io.IOException;

/**
 * Created by sukjinee on 2017-07-17.
 */
@Controller
public class TemplateController {

    /**
	 *
	 * @param model
	 * @return
	 * @throws IOException
	 */
	@RequestMapping("/template")
    public String main(Model model) throws IOException {


        System.out.println("바로바로");
        return "template/main";
    }
}
