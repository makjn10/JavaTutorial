package oops4;


// Anonymous class are classes without a name
// They either extends some other class or implements an interface
// Anonymous class can be used only once

// Anonymous class are used in creating comparator (we will see it when learning collections framework)

public class LearnAnonymous {

/*	class InnerClass extends OuterClass {

	}*/

	// Subclass as anonymous class
	OuterClass obj = new OuterClass() {
		void sing () {

		}

		@Override
		public void outerMethod () {

		}
	};

	// This anonymous class implements OuterInterface
	OuterInterface outerInterface = new OuterInterface() {
		@Override
		public void interfaceMethod() {

		}

		void sing ()  {

		}
	};

}

class OuterClass {
	public void outerMethod() {

	}
}

interface OuterInterface {
	void interfaceMethod();
}