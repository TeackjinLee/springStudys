package hello.core.member;
//회원 가입, 회원 조회 기능 만들기
public interface MemberService {

    void join(Member member);

    Member findMember(Long memberId);
}
