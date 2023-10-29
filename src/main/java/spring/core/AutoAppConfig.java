package spring.core;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import spring.core.member.MemberRepository;
import spring.core.member.MemoryMemberRepository;

@Configuration
@ComponentScan(
        basePackages = "spring.core.",
        basePackageClasses = AutoAppConfig.class, //(현재 클래스의 package가 spring.core이니 그 하위부터 검색
        excludeFilters = @ComponentScan.Filter(type = FilterType.ANNOTATION, classes = Configuration.class)
        //@Configuration 으로 등록된(AppConfig)는 자동스캔의 대상에서 exclude 시킨다//
)
public class AutoAppConfig {

    /*@Bean(name = "memoryMemberRepository")
    public MemberRepository memberRepository() {
        return new MemoryMemberRepository();
    }*/

}
