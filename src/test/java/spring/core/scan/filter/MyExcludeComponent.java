package spring.core.scan.filter;

import java.lang.annotation.*;

@Target(ElementType.TYPE) //필드에 어디에붙냐는 설정인데 Type이면 클래스에 붙는다는 말임
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface MyExcludeComponent {
}
