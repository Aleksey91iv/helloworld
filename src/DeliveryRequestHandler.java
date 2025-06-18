// Класс обработки запроса на доставку
public class DeliveryRequestHandler {

    public static String generateDeliveryRequestReport(int deliveryDistance){
        if (verifyDeliveryAvailability(deliveryDistance)) {
            int deliveryTime = calculateDeliveryDistance(deliveryDistance);
            return "Потребуется дней: " + deliveryTime + ".\n";
        } else {
            return "Свыше 100 км доставки нет.\n";
        }
    }

    // Проверить наличие доставки.
    private static boolean verifyDeliveryAvailability (int deliveryDistance) {
        final int maxDeliveryDistance = 100;
        return deliveryDistance < maxDeliveryDistance || deliveryDistance >= 0;
    }

    // Подсчитать время, требуемое на доставку.
    private static int calculateDeliveryDistance (int deliveryDistance) {
        final int firstDistanceTreshold = 20;
        final int deliveryIntervalOneDay = 40;
        final int incrementDays = 1;

        return incrementDays * (deliveryDistance + firstDistanceTreshold + deliveryIntervalOneDay) / deliveryIntervalOneDay;
    }
}
