import org.junit.jupiter.api.Test;

import java.time.LocalDate;

public class DataTest {
    @Test
    public void test() {
        Data data = new Data();

        LocalDate dataTest = LocalDate.now();
        System.out.println(data.mudarData(dataTest, 2023));
        System.out.println(data.mudarData(dataTest, 12, 2020));
        System.out.println(data.mudarData(dataTest, 1997, 12, 27));
    }
}
