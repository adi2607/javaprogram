// mutable
// non- synchronized sequential execution
// more efficient 
// append, insert, replace, delete, length, substring,charAt

package string;

public class StringBuilderEg {

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("Hello Good Morning");
		System.out.println(sb); // Hello Good Morning 
		sb.append(" How are you?");
		System.out.println(sb); // Hello Good Morning How are you?
		sb.replace(27,30,"My students");
		System.out.println(sb); //Hello Good Morning How are My students?
		sb.insert(19, "students ");
		System.out.println(sb); // Hello Good Morning students How are My students?
		System.out.println(sb.length());
		String news = sb.substring(0,5);
		System.out.println(news); // hello
		System.out.println(sb.charAt(7)); // o
		System.out.println(sb);
	}

}
