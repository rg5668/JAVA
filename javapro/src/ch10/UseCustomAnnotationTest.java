package ch10;
import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;
import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;

class CustomPropSet {
	@MyPropLable("db")
	String dbHost="127.0.0.1";
	@MyPropLable(value="web", strDefault="localhost")
	String serverHost;
	@MyPropLable("db")
	String dbPort;
	@MyPropLable(value="web", strDefault="8080")
	String serverPort;
}

@Retention(RUNTIME)
@Target(FIELD)
@interface MyPropLable {
	String value();
	String strDefault() default "아직 값 설정 전";
}
public class UseCustomAnnotationTest {
	public static void main(String[] args) throws Exception{
		CustomPropSet cps = new CustomPropSet();
		Field[] fields = CustomPropSet.class.getDeclaredFields();
		for (Field field : fields) {
			MyPropLable annotation = field.getDeclaredAnnotation(MyPropLable.class);
			
			if (field.get(cps) == null) {
				field.set(cps, annotation.strDefault());
			}
			if (annotation.value().equals("web")) {
				System.out.println(field.getName() + ":" + field.get(cps));
			} else {
				System.out.println(field.getName() + ":" + field.get(cps));
			}
			System.out.println("===" + field.getName() + ":" + annotation.value() + "," + annotation.strDefault());
		}
	}
}
