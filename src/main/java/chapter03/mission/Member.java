package chapter03.mission;

public class Member {

    private String name;
    private int month;

    public Member(String name) {
        this.name = name;
    }

    public String enroll() {
        if (this.month > 0) {
            return this.name + "님, " + this.month + "개월 등록되었습니다.";
        } else {
            return "1개월 이상부터 등록 가능합니다.";
        }
    }

    public void setMonth(int month) {
        this.month = month;
    }
}
