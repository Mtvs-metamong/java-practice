package chapter03;

public class Member {
    private String name;
    private int month;

    private Member(
            final String name,
            final int month
    ) {
        this.name = name;
        this.month = month;
    }

    public static Member of(
            final String name,
            final int month
    ) {
        return new Member(name, month);
    }

    public String enroll(int month) {
        if (month < 1 && this.month < 1) {
           return "1개월 이상부터 등록 가능합니다." ;
        }

        if (this.month > 0) {
            month += this.month;
        }

        setMonth(month);
        return this.name + " 회원님의 이용이 " + this.month + "개월 등록되었습니다.";
    }

    public void setMonth(int month) {
        this.month = month;
    }
}
