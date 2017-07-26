package adcapsulecms.controller;

import adcapsulecms.service.TemplateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.io.IOException;
import java.util.List;

/**
 * Created by sukjinee on 2017-07-17.
 */
@Controller
@RequestMapping("/template")
public class TemplateController {

	String path = "/template";

	@Autowired
	TemplateService templateService;

    /**
	 * 메인
	 * @param model
	 * @return
	 * @throws IOException
	 */
	@RequestMapping(value = {"", "/"}, method = RequestMethod.GET)
    public String main (Model model) throws IOException {

		// TODO 통계등 간략한 정보 노출
        return path + "/main";
    }

	/**
	 * 작성
	 * @param model
	 * @return
	 * @throws IOException
	 */
	@RequestMapping(value = "/edit", method = RequestMethod.GET)
	public String write (Model model) throws IOException {

		return "edit";
	}

	/**
	 * 수정
	 * @param key
	 * @param model
	 * @return
	 * @throws IOException
	 */
	@RequestMapping(value = "/{key}/edit", method = RequestMethod.GET)
	public String modify (@PathVariable("key") String key, Model model) throws IOException {

		System.out.println("key");
		return "edit";
	}

	/**
	 * 템플릿 리스트
	 * @param model
	 * @return
	 * @throws IOException
	 */
	@RequestMapping(value = "/preview", method = RequestMethod.GET)
	public String list (Model model) throws IOException {

		List result = templateService.selectPriviewList();
		System.out.println("1123");
		model.addAttribute("list", result);
		return path + "/list";
	}

	/**
	 * 미리보기 생성
	 * @param model
	 * @return
	 * @throws IOException
	 */
	@RequestMapping(value = "/preview", method = RequestMethod.POST)
	@ResponseBody
	public ModelMap buildPreview (Model model) throws IOException {

		ModelMap result = new ModelMap();

		result.addAttribute("html", "<h1> 미리보기 생성 완료</h1>");
		return result;
	}

	/**
	 * 미리보기 조회
	 * @param model
	 * @return
	 * @throws IOException
	 */
	@RequestMapping(value = "/preview/{key}", method = RequestMethod.GET)
	@ResponseBody
	public String displayPreview (@PathVariable("key") String key, Model model) throws IOException {

		System.out.println("key");
		return "<h1> 미리보기 생성 완료</h1>";
	}


	/**
	 * 발행 목록
	 * @param key
	 * @param model
	 * @return
	 * @throws IOException
	 */
	@RequestMapping(value = "/publish", method = RequestMethod.GET)
	public String displayPublishList (@PathVariable("key") String key, Model model) throws IOException {

		System.out.println("key");
		return "main";
	}

	/**
	 * 발행
	 * @param key
	 * @param model
	 * @return
	 * @throws IOException
	 */
	@ResponseBody
	@RequestMapping(value = "/publish/{key}", method = RequestMethod.POST)
	public String publish (@PathVariable("key") String key, Model model) throws IOException {

		System.out.println("key");
		return "main";
	}

	/**
	 * 발행 조회
	 * @param key
	 * @param model
	 * @return
	 * @throws IOException
	 */
	@RequestMapping(value = "/publish/{key}", method = RequestMethod.GET)
	public String displayPublish (@PathVariable("key") String key, Model model) throws IOException {

		System.out.println("key");
		return "main";
	}

	/**
	 * 발행 이력(단건)
	 * @param key
	 * @param model
	 * @return
	 * @throws IOException
	 */
	@RequestMapping(value = "/publish/{key}/history", method = RequestMethod.GET)
	public String displayHistoryPublish (@PathVariable("key") String key, Model model) throws IOException {

		System.out.println("key");
		return "main";
	}

	/**
	 * 복원
	 * @param key
	 * @param model
	 * @return
	 * @throws IOException
	 */
	@RequestMapping(value = "/publish/{key}/resore", method = RequestMethod.GET)
	public String restorePastPublish (@PathVariable("key") String key, Model model) throws IOException {

		System.out.println("key");
		return "main";
	}
}
