package dp.behavioral.memento;

import java.util.ArrayList;
import java.util.List;

public class DocumentCreator {
	private final Document document;
	private final List<Memento> mementos = new ArrayList<>();

	public DocumentCreator(Document document) {
		this.document = document;
	}

	public void writeDocument(String newContent) {
		Memento memento = this.document.memento();
		this.mementos.add(memento);
		this.document.setContent(newContent);
	}

	public void getBack() {
		Memento memento = this.mementos.remove(this.mementos.size() - 1);
		this.document.setMemento(memento);
	}
}
