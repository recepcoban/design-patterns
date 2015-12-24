package dp.behavioral.chainofresponsibility;

public class ChainOfResponsibility {
	public static void main(String[] args) {
		// Chain objects
		Process chain, chain1, chain2, chain3;

		// chain1 => A > B > C
		chain1 = new ProcessA();
		chain = chain1.setNextProcess(new ProcessB());
		chain = chain.setNextProcess(new ProcessC());

		// chain2 => B > C > A
		chain2 = new ProcessB();
		chain = chain2.setNextProcess(new ProcessC());
		chain = chain.setNextProcess(new ProcessA());

		// chain3 => B > C
		chain3 = new ProcessB();
		chain3.setNextProcess(new ProcessC());

		// run chains
		chain1.run("running chain 1");
		chain2.run("running chain 2");
		chain3.run("running chain 3");
	}
}
