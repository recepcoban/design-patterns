package dp.behavioral.chainofresponsibility;

public class ProcessB extends Process {
	@Override
	protected void runProcess(String data) {
		System.out.println("Process B is done : " + data);
	}
}
