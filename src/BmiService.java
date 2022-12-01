public class BmiService {
    public double calculate(double weight, double height) {
        double heightInMeters = height / 100; //перевод роста из см в метры
        double yourBmi = weight / (heightInMeters * heightInMeters); //формула расчета ИМТ
        return yourBmi;
    }
}
