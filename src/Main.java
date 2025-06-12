import java.text.DecimalFormat;
import java.util.Arrays;

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

        // Условный оператор: Урок 1.
        executeConditionsLessonPart1();

        // Условные операторы: Урок 2.
        executeConditionsLessonPart2();

        // Циклы: Урок 1.
        executeCyclesLessonPart1();

        // Циклы: Урок 2.
        executeCyclesLessonPart2();

        // Массивы: Урок 3.
        executeArraysLessonPart1();
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

        byte ludmilaPavlovnaStudents = 23;     // Количсетво учеников в классе Людмилы Петровны
        byte annaSergeevnaStudents = 27;       // Количсетво учеников в классе Анны Сергеевны
        byte ekaterinaAndreevnaStudents = 30;  // Количсетво учеников в классе Екатерины Андреевны
        short allPaperPages = 480;              // Закуплено листов на все классы

        int oneStudentsPaperPages = allPaperPages / (ludmilaPavlovnaStudents + annaSergeevnaStudents + ekaterinaAndreevnaStudents);

        System.out.printf("На каждого ученика рассчитано %d листов бумаги\n", oneStudentsPaperPages);

        //Задача 4.
        System.out.println("\nTask 4.");

        byte productivity = 16 / 2;

        int timePeriodProductValue = productivity * 20;
        System.out.printf("За 20 мин машина произвела %d штук бутылок\n", timePeriodProductValue);

        timePeriodProductValue = productivity * 24 * 60;
        System.out.printf("За сутки машина произвела %d штук бутылок\n", timePeriodProductValue);

        timePeriodProductValue = productivity * 24 * 60 * 3;
        System.out.printf("За 3 дня машина произвела %d штук бутылок\n", timePeriodProductValue);

        timePeriodProductValue = productivity * 24 * 60 * 30;
        System.out.printf("За месяц машина произвела %d штук бутылок\n", timePeriodProductValue);

        //Задача 5.
        System.out.println("\nTask 5.");

        byte allPaintPots = 120;           // Всего банок краски закуплено
        byte whitePaintPotsForClass = 2;    // Количество банок белой краски на один класс
        byte brownPaintPotsForClass = 4;    // Количество банок коричневой краски на один класс

        int numberOfClasses = allPaintPots / (whitePaintPotsForClass + brownPaintPotsForClass);
        int whitePaintPots = whitePaintPotsForClass * numberOfClasses;
        int brownPaintPots = brownPaintPotsForClass * numberOfClasses;

        System.out.printf(
                "В школе, где %d классов, нужно %d банок белой краски %d банок коричневой краски",
                numberOfClasses, whitePaintPots, brownPaintPots);

        //Задача 6.
        System.out.println("\nTask 6.");

        byte bananaWeight = 80;
        byte bananasCount = 5;

        byte milkWeight = 105;
        byte milkCount = 2;

        byte plombirWeight = 100;
        byte plombirsCount = 2;

        byte eggWeight = 70;
        byte eggsCount = 4;

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

        short minDays = expectedWeightLoss / dayMinWeightLoss;
        short maxDays = expectedWeightLoss  / dayMaxWeightLoss;

        short dayAverageWeightLoss = (dayMinWeightLoss + dayMaxWeightLoss) / 2;
        int divisionRemainder = expectedWeightLoss % dayAverageWeightLoss;
        int avrageDays = divisionRemainder == 0
                           ? expectedWeightLoss / dayAverageWeightLoss
                           : (expectedWeightLoss / dayAverageWeightLoss) + 1;

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

    // Выполнить урок "Условный операторы: Урок 1"
    private static void executeConditionsLessonPart1(){
        System.out.println("Условный оператор: Урок 1.");

        // Задача 1.
        System.out.println("\nTask 1.");

        int ageUser = 19;

        if (ageUser >= 18){
            System.out.printf("Если возраст человека равен %d, то он совершеннолетний.\n", ageUser);
        } else {
            System.out.printf("Если возраст человека равен %d, то он не достиг совершеннолетия, нужно немного подождать\n", ageUser);
        }

        // Задача 2.
        System.out.println("\nTask 2.");

        int temperature = 6;
        int headCritycalTemperature = 5;

        if (temperature > headCritycalTemperature) {
            System.out.printf("На улице %d градусов, можно идти без шапки.\n", temperature);
        } else if (headCritycalTemperature < 5) {
            System.out.printf("На улице %d градусов, нужно надеть шапку.\n", temperature);
        } else {
            System.out.printf("На улице %d градусов, сами смотрите надевать ли шапку ))).\n", temperature);
        }

        // Задача 3.
        System.out.println("\nTask 3.");

        int speed = 59;
        int allowedSpeed = 60;

        if (speed <= allowedSpeed) {
            System.out.printf("Если скорость %d, то можно ездить спокойно.\n", speed);
        } else if (speed > allowedSpeed) {
            System.out.printf("Если скорость %d, то придется заплатить штраф.\n", speed);
        }

        // Задача 4.
        System.out.println("\nTask 4.");

        int age = 25;

        int minKindergartenAge = 2;
        int maxKindergartenAge = 6;

        int minSchoolAge = 7;
        int maxSchoolAge = 17;

        int minUniversityAge = 18;
        int maxUniversityAge = 24;

        if (age >= minKindergartenAge && age <= maxKindergartenAge) {
            System.out.printf("Если возраст человека равен %d, то ему нужно ходить в десткий сад.", age);
        } else if (age >= minSchoolAge && age <= maxSchoolAge) {
            System.out.printf("Если возраст человека равен %d, то ему нужно ходить в школу.", age);
        } else if (age >= minUniversityAge && age <= maxUniversityAge) {
            System.out.printf("Если возраст человека равен %d, то ему нужно ходить в университет.", age);
        } else if (age > maxUniversityAge) {
            System.out.printf("Если возраст человека равен %d, то ему нужно ходить на работу.", age);
        }

        // Задача 5.
        System.out.println("\nTask 5.");

        int childAge = 14;

        if (childAge < 5) {
            System.out.printf("Если возраст ребенка равен %d, то ему нельзя кататься на аттракционе.", childAge);
        } else if (childAge < 14) {
            System.out.printf("Если возраст ребенка равен %d, то ему можно кататься на аттракционе в сопровождении взрослых.", childAge);
        } else if (childAge >= 14) {
            System.out.printf("Если возраст ребенка равен %d, то можно кататься ему без сопровождения взрослого.", childAge);
        }

        // Задача 6.
        System.out.println("\nTask 6.");

        int railwayCarriageCapacity = 102;
        int seatings = 60;

        int сlientNumber = 103;

        if (сlientNumber <= seatings){
            System.out.printf("В вагоне есть сидячие места.");
        } else if (сlientNumber <= railwayCarriageCapacity) {
            System.out.printf("В вагоне есть только стоячие места.");
        } else {
            System.out.printf("В вагоне нет мест.");
        }

        // Задача 7.
        System.out.println("\nTask 7.");

        int one = 1;
        int two = 2;
        int three = 3;

        if (one == two || one == three || two == three){
            System.out.println("Некорректные данные: имеются равнозначные числа.");
        } else if (one > two && one > three) {
            System.out.printf("Число one = %d явялется наибольшим.\n", one);
        } else if (two > one && two > three) {
            System.out.printf("Число two = %d явялется наибольшим.\n", two);
        } else {
            System.out.printf("Число three = %d явялется наибольшим.\n", three);
        }
    }

    // Выполнить урок "Условный оператор: Урок 2"
    private static void executeConditionsLessonPart2(){
        System.out.println("Условный оператор: Урок 2.");

        // Задача 1.
        System.out.println("\nTask 1.");

        final int ios = 0;
        final int androidOS = 1;

        int userOS = 0;

        if (userOS == ios) {
            System.out.println("Установите версию приложения для iOS по ссылке.");
        } else if (userOS == androidOS) {
            System.out.println("Установите версию приложения для Android по ссылке.");
        } else {
            System.out.println("Отсутствует версия приложения по вашу ОС.");
        }

        // Задача 2.
        System.out.println("\nTask 2.");

        int supportThresholdSmartphoneReleaseYear = 2015;
        int currentSmartphoneReleaseYear = 2016;

        if (userOS == ios &&
            currentSmartphoneReleaseYear >= supportThresholdSmartphoneReleaseYear) {
            System.out.println("Установите версию приложения для iOS по ссылке.");
        } else if (userOS == ios){
            System.out.println("Установите облегчённую версию приложения для iOS по ссылке.");
        } else if (userOS == androidOS &&
                   currentSmartphoneReleaseYear >= supportThresholdSmartphoneReleaseYear) {
            System.out.println("Установите версию приложения для Android по ссылке.");
        } else if (userOS == androidOS){
            System.out.println("Установите облегчённую версию приложения для Android по ссылке.");
        } else {
            System.out.println("Отсутствует версия приложения по вашу ОС.");
        }

        // Задача 3.
        System.out.println("\nTask 3.");

        int currentYear = 1600;
        boolean isLeapYear = currentYear > 1584 && (currentYear % 4 == 0 && currentYear % 100 != 0 || currentYear % 400 == 0);
        if (isLeapYear) {
            System.out.printf("%d год является високосным", currentYear);
        } else {
            System.out.printf("%d год не является високосным", currentYear);
        }

        // Задача 4.
        System.out.println("\nTask 4.");

        int maxDeliveryDistance = 100;
        int firstDistanceTreshold = 20;
        int deliveryIntervalOneDay = 40;
        int incrementDays = 1;

        int deliveryDistance = 5;
        int deliveryDays =
                incrementDays * (deliveryDistance + firstDistanceTreshold + deliveryIntervalOneDay) / deliveryIntervalOneDay;

        if (deliveryDistance > maxDeliveryDistance){
            System.out.println("Доставка не выполняется на расстояние от 100 км.");
        }
        else {
            System.out.printf("Доставка займёт %d дня.\n", deliveryDays);
        }

        // Задача 5.
        System.out.println("\nTask 5.");

        int month = 12;

        switch (month){
            case 1:
                System.out.println("Январь");
                break;
            case 2:
                System.out.println("Февраль");
                break;
            case 3:
                System.out.println("Март");
                break;
            case 4:
                System.out.println("Апрель");
                break;
            case 5:
                System.out.println("Май");
                break;
            case 6:
                System.out.println("Июнь");
                break;
            case 7:
                System.out.println("Июль");
                break;
            case 8:
                System.out.println("Август");
                break;
            case 9:
                System.out.println("Сентябрь");
                break;
            case 10:
                System.out.println("Октябрь");
                break;
            case 11:
                System.out.println("Ноябрь");
                break;
            case 12:
                System.out.println("Декабрь");
                break;
            default:
                System.out.println("Указан некорректный номер месяца.");
        }
    }

    // Выполнить урок "Циклы, Урок 1"
    private static void executeCyclesLessonPart1(){
        System.out.println("Циклы: Урок 1.");

        System.out.println("\nTask 1.");

        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }

        System.out.println("\nTask 2.");

        for (int i = 10; i > 0; i--) {
            System.out.println(i);
        }

        System.out.println("\nTask 3.");

        for (int i = 0; i <= 17; i += 2) {
            System.out.println(i);
        }

        System.out.println("\nTask 4.");

        for (int i = 10; i >= -10; i--) {
            System.out.println(i);
        }

        System.out.println("\nTask 5.");

        for (int i = 1904; i <= 2096; i += 4) {
            System.out.printf("%d год является високосным.\n", i);
        }

        System.out.println("\nTask 6.");

        for (int i = 7; i <= 98; i += 7) {
            System.out.println(i);
        }

        System.out.println("\nTask 7.");

        for (int i = 1; i <= 512; i *= 2) {
            System.out.println(i);
        }

        System.out.println("\nTask 8.");

        int monthSalary = 29000;

        for (int i = 1; i <= 12; i++) {
            System.out.printf("Месяц %d, сумма накоплений равна %d рублей.\n", i, monthSalary * i);
        }

        System.out.println("\nTask 9.");

        double depositPercent = 0.12;
        double salary = 29000.0;
        double capital = 0;

        for (int i = 1; i <= 12; i++) {
            capital = capital + capital * depositPercent / 12.0 + salary;
            System.out.printf("Месяц %d, сумма накоплений равна %s рублей.\n", i, new DecimalFormat("#0.00").format(capital));
        }

        System.out.println("\nTask 10.");

        for (int i = 1; i <= 10; i++) {
            System.out.printf("2 * %d = %d\n", i, i * 2);
        }
    }

    // Выполнить урок "Циклы, Урок 2"
    private static void executeCyclesLessonPart2(){
        System.out.println("Циклы: Урок 2.");

        System.out.println("\nTask 1.");

        double capital = 0;
        double targetCapital = 2490000.0;
        double monthDeposit = 15000.0;

        int month = 0;
        while (capital < targetCapital){
            capital += monthDeposit;
            System.out.printf("Месяц %d, сумма накоплений равна %s рублей.\n", month, new DecimalFormat("#0.00").format(capital));
            month++;
        }

        System.out.println("\nTask 2.");

        int number = 1;
        int maxNumber = 10;

        while (number <= maxNumber) {
            System.out.print(number + " ");
            number++;
        }
        System.out.print("\n");

        for (number = maxNumber; number > 0; number--){
            System.out.print(number + " ");
        }
        System.out.print("\n");

        System.out.println("\nTask 3.");

        double population = 12000000;
        double thousandDeathRate = 8;
        double thousandBirthRate = 17;
        double estimatedEndYear = 10;

        int currentEstimatedYear = 1;

        while (currentEstimatedYear <= estimatedEndYear) {
            population += (population / 1000) * (thousandBirthRate - thousandDeathRate);
            System.out.printf("Год %d, численность населения составляет %d.\n", currentEstimatedYear, (int)population);
            currentEstimatedYear++;
        }

        System.out.println("\nTask 4.");

        double depositPercents = 7;
        double vasiliyTargetCapital = 12000000.0;
        double vasiliyMonthDeposit = 15000.0;

        double currentCapital = 0;

        int currentMonth = 0;
        while (currentCapital < vasiliyTargetCapital) {
            currentCapital += (currentCapital * depositPercents / 100) / 12 + vasiliyMonthDeposit;
            System.out.printf("Месяц %d: %s рублей.\n", currentMonth, new DecimalFormat("#0.00").format(currentCapital));
            currentMonth++;
        }

        System.out.println("\nTask 5.");

        currentCapital = 0;
        currentMonth = 0;

        int monthsDisplayInterval = 6;

        while (currentCapital < vasiliyTargetCapital) {
            currentCapital += (currentCapital * depositPercents / 100) / 12 + vasiliyMonthDeposit;

            if (currentMonth % monthsDisplayInterval == 0 && currentMonth >= 1) {
                System.out.printf("Месяц %d: %s рублей.\n", currentMonth, new DecimalFormat("#0.00").format(currentCapital));
            }
            currentMonth++;
        }

        System.out.println("\nTask 6.");

        currentCapital = 0;
        currentMonth = 0;
        monthsDisplayInterval = 6;

        int depositYears = 9;
        int depositDuration = depositYears * 12;

        for (int i = 0; i <= depositDuration; i++) {
            currentCapital += (currentCapital * depositPercents / 100) / 12 + vasiliyMonthDeposit;

            if (i % monthsDisplayInterval == 0 && i >= 1) {
                System.out.printf("Месяц %d: %s рублей.\n", i, new DecimalFormat("#0.00").format(currentCapital));
            }
        }

        System.out.println("\nTask 7.");

        int firstFridayDate = 3;
        int dayInMonth = 31;
        for (int day = 1; day <= dayInMonth; day++) {
            if ((day - firstFridayDate) % 7 == 0){
                System.out.printf("Сегодня пятница, %d-е число. Необходимо подготовить отчет.\n", day);
            }
        }
        System.out.println("\nTask 8.");

        int passageCometPeriod = 79;
        int currentYear = 2025;
        int happenedInterval = 200;
        int nearestExpectedInterval = 100;

        for (int i = currentYear - happenedInterval; i < currentYear + nearestExpectedInterval; i++){
            if (i % passageCometPeriod == 0){
                System.out.println(i);
            }
        }
    }

    // Выполнить урок "Массивы, Урок 1"
    private static void executeArraysLessonPart1() {
        System.out.println("Массивы: Урок 1.");

        System.out.println("\nTask 1.");

        int [] intArray = new int[]{1, 2, 3};
        double [] doubleArray = {1.57, 7.654, 9.986};
        char [] charArray = {'a', 'b', 'c', 'd'};

        System.out.println("\nTask 2.");

        for (int i = 0; i < intArray.length; i++) {
            System.out.print((i != intArray.length - 1) ? (intArray[i] +", ") : (intArray[i] + "\n"));
        }

        for (int i = 0; i < doubleArray.length; i++) {
            System.out.print((i != doubleArray.length - 1) ? (doubleArray[i] +", ") : (doubleArray[i] + "\n"));
        }

        for (int i = 0; i < charArray.length; i++) {
            System.out.print((i != charArray.length - 1) ? (charArray[i] +", ") : (charArray[i] + "\n"));
        }

        System.out.println("\nTask 3.");

        for (int i = intArray.length - 1; i >= 0; i--) {
            System.out.print((i != 0) ? (intArray[i] +", ") : (intArray[i] + "\n"));
        }

        for (int i = doubleArray.length - 1; i >= 0; i--) {
            System.out.print(i != 0 ? (doubleArray[i] +", ") : (doubleArray[i] + "\n"));
        }

        for (int i = charArray.length - 1; i >= 0 ; i--) {
            System.out.print(i != 0 ? (charArray[i] +", ") : (charArray[i] + "\n"));
        }

        System.out.println("\nTask 4.");

        for (int i = 0; i < intArray.length; i++) {
            intArray[i] = intArray[i] % 2 == 0 ? intArray[i] : ++intArray[i];
        }

        System.out.println(Arrays.toString(intArray));
    }
}