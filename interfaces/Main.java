

interface  MyClass2{
     void printer();
}

interface  MyClass{
     void printer();
}

class MyanotherClass implements  MyClass2,MyClass{
    public void println(){
        System.out.println("hello from println");
    }
    
    public void printer(){
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







