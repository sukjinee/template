package adcapsulecms.service;

import adcapsulecms.repository.Template;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TemplateService {

	/**
	 * 미리보기 목록 조회
	 * @return
	 */
	public List<Template> selectPriviewList() {

		List<Template> result = new ArrayList<Template>();

		result.add(new Template(0, "<div>0</div>"));
		result.add(new Template(1, "<div>1</div>"));
		result.add(new Template(2, "<div>2</div>"));
		result.add(new Template(3, "<div>3</div>"));
		result.add(new Template(4, "<div>4</div>"));
		result.add(new Template(5, "<div>5</div>"));

		return result;
	};
}
