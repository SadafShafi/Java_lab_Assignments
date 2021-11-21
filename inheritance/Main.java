


//  Inheritance of classes 
class MyClass  {
    public void printer(){
        System.out.println("hello from printer");
    }
}

class MyClass2 extends MyClass{
    public void printer(){
        
        super.printer();
        System.out.println("hello from printer of MyClass2");
    }
}

class MyanotherClass extends MyClass2{
    void println(){
        System.out.println("hello from println");
    }
}

public class Main
{
	public static void main(String[] args) {
// 		System.out.println("Hello World");
		
// 		MyClass moyaclass = new MyClass();
// 		moyaclass.printer();
		
		MyanotherClass moyaclasstwo = new MyanotherClass();
// 		moyaclasstwo.println();
		moyaclasstwo.printer();
// 		moyaclasstwo.printer();
		
// 		moyaclasstwo.printer2();
	}
}





