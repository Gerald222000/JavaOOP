package InnerClass;

//	Access Outer Class From Inner Class
//	One advantage of inner classes, is that they can access attributes
//	and methods of the outer class:
public class Main {
    public static void main(String[] args) {

        OuterClass myOuter = new OuterClass();
        OuterClass.InnerClass myInner = myOuter.new InnerClass();
        System.out.println(myInner.myInnerMethod());
    }
}

//	Java Inner Classes
//	In Java, it is also possible to nest classes (a class within a class).
//	The purpose of nested classes is to group classes that belong together,
//	which makes your code more readable and maintainable.
//
//	To access the inner class, create an object of the outer class,
//	and then create an object of the inner class:

//	public class Main {
//		  public static void main(String[] args) {
//		    OuterClass myOuter = new OuterClass();
//		    OuterClass.InnerClass myInner = myOuter.new InnerClass();
//		    System.out.println(myInner.y + myOuter.x);
//		  }
//		}

//	Private Inner Class
//	Unlike a "regular" class, an inner class can be private or
//	protected. If you don't want outside objects to access the
//	inner class, declare the class as private:

//	public class Main {
//		  public static void main(String[] args) {
//		    OuterClass myOuter = new OuterClass();
//		    OuterClass.InnerClass myInner = myOuter.new InnerClass();
//		    System.out.println(myInner.y + myOuter.x);
//		  }
//		}