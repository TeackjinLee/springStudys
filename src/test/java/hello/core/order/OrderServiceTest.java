package hello.core.order;

import hello.core.AppConfig;
import hello.core.discount.FixDiscountPolicy;
import hello.core.member.*;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static hello.core.member.Grade.BASIC;

public class OrderServiceTest {

    MemberService memberService;
    OrderService orderService;

    MemberRepository memberRepository;

    @BeforeEach
    public void beforeEach(){
        AppConfig appConfig = new AppConfig();
        memberService = appConfig.memberService();
        orderService = appConfig.orderService();
    }

    @Test
    void createOrder() {
        Long memberId = 1L;
        Member member = new Member(memberId, "memberA", Grade.VIP);
        memberService.join(member);

        Order order = orderService.createOrder(memberId, "itemA", 10000);
        Assertions.assertThat(order.getDiscountPrice()).isEqualTo(1000);

    }

//    @Test
//    void fieldInjectionTest(){
//        OrderServiceImpl orderService = new OrderServiceImpl();
//        memberRepository.save(new Member(1L,"item", BASIC));
//        orderService.setMemberRepository(new MemoryMemberRepository());
//        orderService.setDiscountPolicy(new FixDiscountPolicy());
//        orderService.createOrder(1L, "itemA", 10000);
//    }
}
