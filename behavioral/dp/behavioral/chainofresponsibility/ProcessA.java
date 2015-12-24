package dp.behavioral.chainofresponsibility;

public class ProcessA extends Process {
	@Override
	protected void runProcess(String data) {
		System.out.println("Process A is done : " + data);
	}
}
