package chapter07.mission.service;

import chapter07.mission.model.LoanStatus;

public class LibraryService {
    public String readRecord(
            final String userName,
            final String userId,
            final LoanStatus loanStatus
    )  {
        return String.format(
                "%s - 사용자ID: %s, 도서ID: %s\n",
                loanStatus.getType(),
                userId,
                userName
        );


    }
}
