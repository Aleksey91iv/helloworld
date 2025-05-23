//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Привет, Мир!");
        System.out.println("Hello, World!");

        // Переменные.

        // Задача 1.
        System.out.println("Task 1.");

        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;

        System.out.println("dog = " + dog);
        System.out.println("cat = " + cat);
        System.out.println("paper = " + paper + "\n");

        // Задача 2.
        System.out.println("Task 2.");

        dog += 4;
        cat += 4;
        paper += 4;

        System.out.println("dog + 4 = " + dog);
        System.out.println("cat + 4 = " + cat);
        System.out.println("paper + 4 = " + paper + "\n");

        // Задача 3.
        System.out.println("Task 3.");

        dog -= 3.5;
        cat -= 1.6;
        paper -= 7639;

        System.out.println("dog - 3.5" + dog);
        System.out.println("cat - 1.6 = " + cat);
        System.out.println("paper - 7639 = " + paper + "\n");

        // Задача 4.
        System.out.println("Task 4.");

        var friend = 19;
        System.out.println(friend);

        friend += 2;
        System.out.println(friend);

        friend = friend / 7;
        System.out.println(friend + "\n");

        // Задача 5.
        System.out.println("Task 5.");

        var frog = 3.5;
        System.out.println(frog);

        frog *= 10;
        System.out.println(frog);

        frog /= 35;
        System.out.println(frog);

        frog+=4;
        System.out.println(frog + "\n");

        // Задача 6.
        System.out.println("Task 6.");

        var firstBoxerWeight = 78.2; // Масса первого боксера, кг.
        var secondBoxerWeight = 82.7; // Масса второго боксера, кг.

        var allBoxersWeigth = firstBoxerWeight + secondBoxerWeight; // Масса оппонентов, кг.
        System.out.println("Массиа обоих бойцов = " + allBoxersWeigth);

        var diffWeightBoxers = secondBoxerWeight - firstBoxerWeight; // Разница массы двух оппонентов.
        System.out.println((secondBoxerWeight > firstBoxerWeight
                            ? "Второй боксёр тяжелее первого на "
                            : "Первый боксёр тяжелее первого на ")
                            + Math.abs(diffWeightBoxers)
                            + "кг.\n");

        // Задача 7.
        System.out.println("Task 7.");

        var remainDiv = secondBoxerWeight % firstBoxerWeight; // Остаток от деления массы оппонентов.
        System.out.println("Остаток от деления массы оппонентов = " + remainDiv + ".\n");

        // Задача 8. Часть 1.
        System.out.println("Task 8. Part 1.");

        var timeExecuteProject = 640; // Время на выполнение проекта, час.
        var employeeTimeResource = 8; // Время вовлечённости одного сотрудника, час.
        var employeesCount = timeExecuteProject / employeeTimeResource; // Предварительное количество сотрудников, человек.

        if (timeExecuteProject % employeeTimeResource != 0){
            employeesCount += 1;
        }

        System.out.println("Необходимое количество сотрудников: " + employeesCount + " человек.\n");

        // Задача 8. Часть 2.
        System.out.println("Task 8. Part 2.");

        employeesCount += 94;
        var staffTimeResource = employeesCount * employeeTimeResource;

        System.out.println("Если в компании работает " + employeesCount + " человек, то всего "
                + staffTimeResource + " часов часов работы может быть поделено между сотрудниками.\n");
    }
}