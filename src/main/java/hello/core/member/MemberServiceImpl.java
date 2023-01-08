package hello.core.member;

public class MemberServiceImpl implements MemberService {
    // 추상화와 구현체 모두 의존하는 문제
    // 추상화 MemberRepository / 구현체 MemoryMemberRepository()
    private final MemberRepository memberRepository = new MemoryMemberRepository();

    @Override
    public void join(Member member) {
        memberRepository.save(member);
    }

    @Override
    public Member findMember(Long memberId) {
        return memberRepository.findById(memberId);
    }
}
