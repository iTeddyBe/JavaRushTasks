package task16xx;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

//https://javarush.com/quests/lectures/questsyntaxpro.level16.lecture04
/*
  Комментарий: 8 июля 2022, 16:10
  Проверить "скорость" компьютера
 */
public class NanoSecTest {
    public static void main(String[] args) {
        List<LocalTime> timeList = new ArrayList<>();
        timeList.add(LocalTime.now());
        for(int i = 0, count = 0; i < 10000; i++) {
            LocalTime newTime = LocalTime.now();
            if (timeList.get(count).isBefore(newTime)) {
                timeList.add(newTime);
                System.out.println(++count + ". " + timeList.get(count));
            }
        }
    }
}
