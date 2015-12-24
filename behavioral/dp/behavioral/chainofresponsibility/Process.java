package dp.behavioral.chainofresponsibility;

public abstract class Process {
	protected Process next;

	protected Process setNextProcess(Process next) {
		this.next = next;
		return next;
	}

	protected void run(String data) {
		// run process
		runProcess(data);

		// pass next process if not null
		if (this.next != null) {
			this.next.run(data);
		}
	}

	protected abstract void runProcess(String data);
}
