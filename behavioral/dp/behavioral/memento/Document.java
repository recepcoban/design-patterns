package dp.behavioral.memento;

public class Document {
	private String content;

	public String getContent() {
		return this.content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Memento memento() {
		return new Memento(this);
	}

	public void setMemento(Memento memento) {
		this.content = memento.getContent();
	}
}
