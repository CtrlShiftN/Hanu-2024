package tut03;


import com.github.javaparser.JavaParser;
import com.github.javaparser.ast.CompilationUnit;

public class JavaParserTest {
	public static void main(String[] args) {
		// program text
		String progText = "class Hello { " 
						+ "public static void main(String[] args) { "
						+ " System.out.println(\"Hello world!\"); " 
						+ "} " + "}";
		// parse the program text
		CompilationUnit codeUnit = JavaParser.parse(progText);
		// obtain the generated source code
		System.out.println(codeUnit);
	}
}

