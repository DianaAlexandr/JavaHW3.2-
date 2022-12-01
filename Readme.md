# Main.lava

public class Main {
    public static void main(String[] args) {

        BmiService service = new BmiService();
        double weight = 80; //вес в килограммах
        double height = 170; //рост в сантиметрах
        double yourBmi = service.calculate(weight, height);
        String index = String.format("%.2f", yourBmi);
        System.out.println("Ваш индекс массы тела:" + index + " кг/м^2");
    }
}

# BmiService.java

public class BmiService {
    public double calculate(double weight, double height) {
        double heightInMeters = height / 100; //перевод роста из см в метры
        double yourBmi = weight / (heightInMeters * heightInMeters); //формула расчета ИМТ
        return yourBmi;
    }
}
