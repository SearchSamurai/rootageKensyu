package stringbuilder;
public class StringSyukudai {
	public static void main(String[] args) {
		String s1 = "spring";
		String s2 = s1 + "summer";
		s1.concat("fail");
		s2.concat(s1);
		s1 += "winter";
		System.out.println(s1 + " " + s2);
	}

}
