package InnerClass;

//	Access Outer Class From Inner Class
public class OuterClass {
    int x = 10;

    class InnerClass {
        public int myInnerMethod() {
            return x;
        }
    }
}

//	Java Inner Classes
//	class OuterClass {
//	  int x = 10;
//
//	  class InnerClass {
//	    int y = 5;
//	  }
//	}
//
//	Private Inner Class
//	class OuterClass {
//	  int x = 10;

//	  private class InnerClass {
//	    int y = 5;
//	  }
//	}