//package com.example.restdocs.member;
//
//import com.querydsl.jpa.JPQLQuery;
//import lombok.RequiredArgsConstructor;
//import org.springframework.data.domain.Sort;
//import org.springframework.data.jpa.repository.support.QuerydslRepositorySupport;
//import org.springframework.stereotype.Service;
//import org.springframework.transaction.annotation.Transactional;
//
//import java.util.List;
//import java.util.Objects;
//
//@Service
//@Transactional
//public class MemberService extends QuerydslRepositorySupport implements MemberRepositorySearch{
//
//
//    public MemberService() {
//        super(Member.class);
//    }
//
////    public Member create(MemberCreate.Request request) {
////        return memberRepository.save(Member.builder(request.getEmail())
////                .build());
////    }
//
//    public List<Member> getMembers(MemberSearchType type, String value) {
//
//        final QMember member = QMember.member;
//        final JPQLQuery<Member> query;
//
//        switch (type) {
//            case EMAIL:
//                query = from(member).where(member.email.likeIgnoreCase("%" + value + "%"));
//                break;
//            case REFERRAL_CODE:
//                query = from(member).where(member.value.likeIgnoreCase("%" + value + "%"));
//                break;
//            case ALL:
//                query = from(member).fetchAll();
//                break;
//            default:
//                break;
//        }
//
//        final List<Member> members =
//                Objects.requireNonNull(getQuerydsl())
//                        .applyPagination(null, query).fetch();
//        return members;
//
//    }
//}
