import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexTester {
	public static void main(String[] args) {

		String str2search = "This is a line tttttttttttttttttttttttttttttttrump and trump and fuck it trump and trumpyo";
		String pattern2search = "(t+rump)([a-z]*)";
		Pattern filter;
		Matcher finder;

		filter = Pattern.compile(pattern2search);
		finder = filter.matcher(str2search);

		while (finder.find()) {
			System.out.println(finder.group());
		}

	}
}
