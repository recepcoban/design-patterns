package dp.behavioral.memento;

public class User {

	public static void main(String[] args) {
		Document document = new Document();
		document.setContent("");

		DocumentCreator documentCreator = new DocumentCreator(document);
		documentCreator.writeDocument("1");
		documentCreator.writeDocument("2");
		documentCreator.writeDocument("3");
		documentCreator.writeDocument("4");

		// the last created is 4 and previous content hold
		System.out.println("Last Content : " + document.getContent());

		// get back last 3 process
		documentCreator.getBack();
		documentCreator.getBack();
		documentCreator.getBack();

		// after get back the result
		System.out.println("After get back 3 process : "
				+ document.getContent());
	}

}
