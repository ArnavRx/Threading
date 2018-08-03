
public class EventImpl implements Event {

	@Override
	public void doSomething() {
		System.out.println("First event Implementation");
	}

	static class InnerEventImpl implements Event {
		@Override
		public void doSomething() {
			System.out.println("second event Implementation");
		}
	}

	public void doingSomething() {
		class InnerMostImpl implements Event {

			@Override
			public void doSomething() {
				System.out.println("Third event Implementation");
			}

		}
		;
		new InnerMostImpl().doSomething();
	}

	public void doingSomethingAgain() {
		new Event() {

			@Override
			public void doSomething() {
				System.out.println("fourth implementation");
			}
		}.doSomething();
	}

	private void doingSomethingOneLastTime() {
		Event e = () -> System.out.println("fifth implementation");
		e.doSomething();
	}

	public static void main(String[] args) {
		EventImpl impl = new EventImpl();
		impl.doSomething();

		InnerEventImpl innerImpl = new EventImpl.InnerEventImpl();
		innerImpl.doSomething();
		impl.doingSomething();
		impl.doingSomethingAgain();
		impl.doingSomethingOneLastTime();
	}
}
