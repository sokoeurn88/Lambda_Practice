package lambdaConcept;

public class lanbdaDeclaration {

	public static void main(String[] args) {
		// can't instantiate interface to class like this: use Annonymous Inner
		// Type=WebPage w1 = new WebPage(+ctrl+space
		//use lambda, remove:new WebPage() {
		//		@Override
		//		public void header
		//(String value)
		//};
		
		//lambda is the body of method
		
		WebPage w1 = (value, age) ->  {System.out.println("hi " + value +" age: " +age);};
		WebPage w2 = (value, age) ->  System.out.println("hello " + value.toUpperCase()+" age: "+ age);
		WebPage w3 = (value, age) ->  System.out.println("hello " + value.toUpperCase().length() +" age: "+ age);

//		WebPage w2 = new WebPage() {
//
//			@Override
//			public void header(String value) {
//
//				System.out.println("hello " + value);
//
//			}
//		};
		w1.header("google", 1998);
		w2.header("sokoeurn chay", 34);
		w3.header("Kosal Im", 32);
//		w2.header("facebook");
	}

}
