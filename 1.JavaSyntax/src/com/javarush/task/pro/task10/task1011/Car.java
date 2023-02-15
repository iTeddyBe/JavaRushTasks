package com.javarush.task.pro.task10.task1011;

import java.util.Objects;

/* 
Создаем свой hashCode
*/

public class Car {
    private String model;
    private int year;

    public Car(String model, int year) {
        this.model = model;
        this.year = year;
    }

    @Override
    // == В каких случаях надо писать @Override?
    // ==
    // ==Не "надо", а "можно". Аннотация @Override не является обязательной для переопределённых методов.
    // Она используется скорее для самопроверки - если в базовом классе нет метода с сигнатурой, совпадающей с методом,
    // к которому применена аннотация @Override, то класс не скомпилируется.
    // https://ru.stackoverflow.com/questions/351628/%D0%92-%D0%BA%D0%B0%D0%BA%D0%B8%D1%85-%D1%81%D0%BB%D1%83%D1%87%D0%B0%D1%8F%D1%85-%D0%BD%D0%B0%D0%B4%D0%BE-%D0%BF%D0%B8%D1%81%D0%B0%D1%82%D1%8C-override

    public int hashCode() {
        // = этот вариант из разбора задачи https://javarush.com/help/82555
        // == ЧИТАТЬ КОММЕНТАРИИ чел (Стас Пасинков) ОЧЕНЬ хорошо разъяснил (!!!) как придумать свой hashCode()
        int result = (this.model == null) ? 0 : this.model.hashCode();
        result = 31 * result + this.year;
        return result;

        // = вариант от JavaRush (вообще не понятно откуда взялась функция - не было упоминания)
        //return Objects.hash(model, year);
    }

    public static void main(String[] args) {
        Car lamborghini = new Car("Lamborghini", 2020);
        Car lamborghini1 = new Car("Lamborghini", 2020);
        Car ferrari = new Car("Ferrari", 2020);
        Car ferrari1 = new Car("Ferrari", 2020);
        Car bugatti = new Car("Bugatti", 2020);
        Car bugatti1 = new Car("Bugatti", 2020);
        System.out.println(ferrari.hashCode() == ferrari.hashCode());
        System.out.println(lamborghini.hashCode() == lamborghini1.hashCode());
        System.out.println(ferrari.hashCode() == ferrari1.hashCode());
        System.out.println(bugatti.hashCode() == bugatti1.hashCode());
        System.out.println(bugatti.hashCode() == lamborghini.hashCode());
        System.out.println(lamborghini.hashCode() == ferrari.hashCode());
    }
}
