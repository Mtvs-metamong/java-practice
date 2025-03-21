package chapter06.mission.model;

public class Record {
    private String trade;
    private String date;

    public Record(String trade, String date) {
        this.trade = trade;
        this.date = date;
    }

    public String getTrade() {
        return trade;
    }
    public void setTrade(String trade) {
        this.trade = trade;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
    @Override
    public String toString() {
        return "Record {trade=" + trade + ", date=" + date + "}";
    }
}
