package chapter07.mission.model;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum LoanStatus {
    CHECK_IN(1, "대출"),
    CHECK_OUT(2, "반납");
    private final int order;
    private final String type;

    public static LoanStatus valueOf(int order) {
        if (CHECK_IN.order == order) {
            return CHECK_IN;
        }
        return CHECK_OUT;
    }
}
