package adcapsulecms.repository;

public class Template {

	int key;
	String html;

	public Template (int key, String html) {

		this.key = key;
		this.html = html;
	}

	public int getKey() {
		return key;
	}

	public void setKey(int key) {
		this.key = key;
	}

	public String getHtml() {
		return html;
	}

	public void setHtml(String html) {
		this.html = html;
	}
}
