import java.math.BigDecimal;
import java.sql.Date;

public class SomeFunctions {
    public String getWelcomeText(String name) {
        return "Hello, " + name + "!";
    }

    public Long getMsFromDate(Date date) {
        return date.getTime();
    }

    public BigDecimal getEurFromUsd(Double amount, Double rate) {
        BigDecimal usd  = BigDecimal.valueOf(amount/rate);
        return usd.setScale(2, BigDecimal.ROUND_UP);
    }

    public int getCalories(int hours, int minutes) {
        return (hours*60 + minutes)*10;
    }


}
