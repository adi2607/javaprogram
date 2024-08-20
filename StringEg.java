//non primitive data type - size not fixed or variable in size
//collection or group of characters 
//i am learning core java String topic
//string constant pool
// no modify/immutable

package string;

public class StringEg {

	public static void main(String[] args) {
		//String literal
		String name = "itvedant";
		String n1 = "itvedant"; // check in pool first if exists only added reference to existing object
		String n2 = "vedant"; // check in pool first if doesn't exists added new object
		System.out.println(name);
		System.out.println(n1);
		System.out.println(n2);
		
		//or
		char[] namee = {'i','t','v','e','d','a','n','t'}; // character array
		System.out.println(namee);
		
		//new keyword
		String name1 = new String("itvedant");
		System.out.println(name1);
		
		String name2 = new String("itvedant");
		System.out.println(name2);
		
		// == : check object reference & equals(): check for value
		System.out.println(name==n1); // true as both variable object reference is same
		System.out.println(name1==name2); // false as both variable object reference is different 
		System.out.println(name1.equals(name2)); // true as both object VALUE is same
		
	}

}
