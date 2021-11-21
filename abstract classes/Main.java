

abstract class MyClass2{
    abstract void printer();
}

abstract class MyClass{
    abstract void printer();
}

class MyanotherClass extends  MyClass2{
    void println(){
        System.out.println("hello from println");
    }
    
    void printer(){
        System.out.println("hello from printer");
    }
}

public class Main
{
	public static void main(String[] args) {
		
		MyanotherClass moyaclasstwo = new MyanotherClass();
		
		moyaclasstwo.println();
		moyaclasstwo.printer();
	}
}






