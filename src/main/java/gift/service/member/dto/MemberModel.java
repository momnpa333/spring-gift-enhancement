package gift.service.member.dto;

import gift.model.member.Member;

public class MemberModel {

    public record Info(
        Long id,
        String email,
        String name
    ) {

        public static Info from(Member member) {
            return new Info(member.getId(), member.getEmail(), member.getName());
        }
    }

}
