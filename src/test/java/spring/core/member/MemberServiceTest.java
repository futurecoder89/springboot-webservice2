package spring.core.member;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import spring.core.AppConfig;

public class MemberServiceTest {


    MemberService memberService;
    @BeforeEach //각 테스트전에 무조건 실행됨
    public void beforeEach() {
        AppConfig appConfig = new AppConfig();
        memberService = appConfig.memberService();
    }

    @Test
    void Join() {
        //given
        Member member = new Member(1L, "MemberA", Grade.VIP);
        //when
        memberService.join(member);
        Member findMember = memberService.findMember(1L);
        //then
        Assertions.assertThat(member).isEqualTo(findMember); //org.assertj.core

    }
}
