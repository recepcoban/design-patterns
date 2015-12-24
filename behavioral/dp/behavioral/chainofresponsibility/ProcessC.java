package dp.behavioral.chainofresponsibility;

public class ProcessC extends Process {
	@Override
	protected void runProcess(String data) {
		System.out.println("Process C is done : " + data);
	}
}
