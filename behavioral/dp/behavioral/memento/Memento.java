package dp.behavioral.memento;

public class Memento {
	private String content = "";

	public Memento(Document document) {
		this.content = document.getContent();
	}

	public String getContent() {
		return this.content;
	}
}
