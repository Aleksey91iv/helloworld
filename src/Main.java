//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Привет, Мир!");
        System.out.println("Hello, World!");

        // Переменные: Урок 1.
        executeVariableLessonPart1();

        // Переменные: Урок 2.
        executeVariableLessonPart2();
    }

    // Выполнить урок "Переменные: Урок 1"
    private static void executeVariableLessonPart1(){
        System.out.println("Переменные: Урок 1.");

        // Задача 1.
        System.out.println("\nTask 1.");

        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;

        System.out.println("dog = " + dog);
        System.out.println("cat = " + cat);
        System.out.println("paper = " + paper + "\n");

        // Задача 2.
        System.out.println("\nTask 2.");

        dog += 4;
        cat += 4;
        paper += 4;

        System.out.println("dog + 4 = " + dog);
        System.out.println("cat + 4 = " + cat);
        System.out.println("paper + 4 = " + paper + "\n");

        // Задача 3.
        System.out.println("\nTask 3.");

        dog -= 3.5;
        cat -= 1.6;
        paper -= 7639;

        System.out.println("dog - 3.5" + dog);
        System.out.println("cat - 1.6 = " + cat);
        System.out.println("paper - 7639 = " + paper + "\n");

        // Задача 4.
        System.out.println("\nTask 4.");

        var friend = 19;
        System.out.println(friend);

        friend += 2;
        System.out.println(friend);

        friend = friend / 7;
        System.out.println(friend + "\n");

        // Задача 5.
        System.out.println("\nTask 5.");

        var frog = 3.5;
        System.out.println(frog);

        frog *= 10;
        System.out.println(frog);

        frog /= 35;
        System.out.println(frog);

        frog+=4;
        System.out.println(frog + "\n");

        // Задача 6.
        System.out.println("\nTask 6.");

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
        System.out.println("\nTask 7.");

        var remainDiv = secondBoxerWeight % firstBoxerWeight; // Остаток от деления массы оппонентов.
        System.out.println("Остаток от деления массы оппонентов = " + remainDiv + ".\n");

        // Задача 8. Часть 1.
        System.out.println("\nTask 8. Part 1.");

        var timeExecuteProject = 640; // Время на выполнение проекта, час.
        var employeeTimeResource = 8; // Время вовлечённости одного сотрудника, час.
        var employeesCount = timeExecuteProject / employeeTimeResource; // Предварительное количество сотрудников, человек.

        if (timeExecuteProject % employeeTimeResource != 0){
            employeesCount += 1;
        }

        System.out.println("Необходимое количество сотрудников: " + employeesCount + " человек.\n");

        // Задача 8. Часть 2.
        System.out.println("\nTask 8. Part 2.");

        employeesCount += 94;
        var staffTimeResource = employeesCount * employeeTimeResource;

        System.out.println("Если в компании работает " + employeesCount + " человек, то всего "
                + staffTimeResource + " часов часов работы может быть поделено между сотрудниками.\n");
    }

    // Выполнить урок "Переменные: Урок 2"
    private static void executeVariableLessonPart2(){
        System.out.println("Переменные: Урок 2.");

        // Задача 1.
        System.out.println("\nTask 1.");

        int myIntVariable = 2048;
        System.out.println("Значение переменной myIntVariable с типом int равно " + myIntVariable);

        byte myByteVariable = 115;
        System.out.println("Значение переменной myByteVariable с типом byte равно " + myByteVariable);

        short myShortVariable = 1024;
        System.out.println("Значение переменной myShortVariable с типом short равно " + myShortVariable);

        long myLongVariable = 908211;
        System.out.println("Значение переменной myLongVariable с типом long равно " + myLongVariable);

        float myFloatVariable = 3.59f;
        System.out.println("Значение переменной myFloatVariable с типом float равно " + myFloatVariable);

        double myDoubleVariable = 10.356;
        System.out.println("Значение переменной myDoubleVariable с типом double равно " + myDoubleVariable);

        // Задача 2.
        System.out.println("\nTask 2.");

        float floatVar1 = 27.12F;
        long longVar = 987678965549L;
        float floatVar2 = 2.786F;
        short shortVar1 = 569;
        short shortVar2 = -159;
        short shortVar3 = 27897;
        byte byteVar = 67;

        // Задача 3.
        System.out.println("\nTask 3.");

        short ludmilaPavlovnaStudents = 23;     // Количсетво учеников в классе Людмилы Петровны
        short annaSergeevnaStudents = 27;       // Количсетво учеников в классе Анны Сергеевны
        short ekaterinaAndreevnaStudents = 30;  // Количсетво учеников в классе Екатерины Андреевны
        short allPaperPages = 480;              // Закуплено листов на все классы

        int oneStudentsPaperPages = (allPaperPages / (ludmilaPavlovnaStudents + annaSergeevnaStudents + ekaterinaAndreevnaStudents));

        System.out.printf("На каждого ученика рассчитано %d листов бумаги\n", oneStudentsPaperPages);

        //Задача 4.
        System.out.println("\nTask 4.");

        float productivity = 16.0F / 2.0F;

        int timePeriodProductValue = (int)(productivity * 20);
        System.out.printf("За 20 мин машина произвела %d штук бутылок\n", timePeriodProductValue);
        timePeriodProductValue = (int)(productivity * 24 * 60);
        System.out.printf("За сутки машина произвела %d штук бутылок\n", timePeriodProductValue);
        timePeriodProductValue = (int)(productivity * 24 * 60 * 3);
        System.out.printf("За 3 дня машина произвела %d штук бутылок\n", timePeriodProductValue);
        timePeriodProductValue = (int)(productivity * 24 * 60 * 3 * 30);
        System.out.printf("За месяц машина произвела %d штук бутылок\n", timePeriodProductValue);

        //Задача 5.
        System.out.println("\nTask 5.");

        short allPaintPots = 120;           // Всего банок краски закуплено
        short whitePaintPotsForClass = 2;    // Количество банок белой краски на один класс
        short brownPaintPotsForClass = 4;    // Количество банок коричневой краски на один класс

        short numberOfClasses = (short)(allPaintPots / (whitePaintPotsForClass + brownPaintPotsForClass));
        short whitePaintPots = (short)(whitePaintPotsForClass * numberOfClasses);
        short brownPaintPots = (short)(brownPaintPotsForClass * numberOfClasses);

        System.out.printf(
                "В школе, где %d классов, нужно %d банок белой краски %d банок коричневой краски",
                numberOfClasses, whitePaintPots, brownPaintPots);

        //Задача 6.
        System.out.println("\nTask 6.");

        int bananaWeight = 80;
        int bananasCount = 5;

        int milkWeight = 105;
        int milkCount = 2;

        int plombirWeight = 100;
        int plombirsCount = 2;

        int eggWeight = 70;
        int eggsCount = 4;

        // Масса завтрака, грамм
        int breakfastGrams =
                bananaWeight * bananasCount + milkWeight * milkCount + plombirWeight * plombirsCount + eggWeight * eggsCount;

        String formattedDouble = String.format("%.2f", (breakfastGrams / 1000F));
        System.out.printf("Масса готового завтрака составляет %d граммов (%s кг)", breakfastGrams, formattedDouble);

        //Задача 7.
        System.out.println("\nTask 7.");

        final short expectedWeightLoss = 7 * 1000;
        final short dayMinWeightLoss = 250;
        final short dayMaxWeightLoss = 500;

        short minDays = (short)(expectedWeightLoss / dayMinWeightLoss);
        short maxDays = (short)(expectedWeightLoss  / dayMaxWeightLoss);

        short dayAverageWeightLoss = ((dayMinWeightLoss + dayMaxWeightLoss) / 2);
        short divisionRemainder = (short)(expectedWeightLoss % dayAverageWeightLoss);
        short avrageDays = divisionRemainder == 0
                           ? (short)(expectedWeightLoss / dayAverageWeightLoss)
                           : (short)((expectedWeightLoss / dayAverageWeightLoss) + 1);

        System.out.printf("При сбросе 250 граммов в день уйдёт %d дней \n" +
                        "При сбросе 500 граммов в день уйдёт %d дней \n" +
                        "При сбросе в среднем 375 граммов в день уйдёт %d дней \n",
                        minDays, maxDays, avrageDays);

        //Задача 8.
        System.out.println("\nTask 8.");

        String maria = "Мария";
        float mariaWages = 67760;
        float mariaNewWages = mariaWages * 1.1F;
        float differenceYearMariaWages = (mariaNewWages - mariaWages) * 12;
        System.out.printf("%s теперь получает %f рублей. Годовой доход вырос на %f рублей\n",
            maria, mariaNewWages, differenceYearMariaWages);

        String denis = "Денис";
        float denisWages = 83690;
        float denisNewWages = denisWages * 1.1F;
        float differenceYearDenisWages = (denisNewWages - denisWages) * 12;
        System.out.printf("%s теперь получает %f рублей. Годовой доход вырос на %f рублей\n",
            denis, denisNewWages, differenceYearDenisWages);

        String kristina = "Кристина";
        float kristinaWages = 76230;
        float kristinaNewWages = kristinaWages * 1.1F;
        float differenceYearKristinaWages = (kristinaNewWages - kristinaWages) * 12;
        System.out.printf("%s теперь получает %f рублей. Годовой доход вырос на %f рублей",
                kristina, kristinaNewWages, differenceYearKristinaWages);
    }
}