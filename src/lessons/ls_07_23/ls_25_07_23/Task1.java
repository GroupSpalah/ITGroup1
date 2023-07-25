package lessons.ls_07_23.ls_25_07_23;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Step 1: Create a list of Map (e.g. List<Map<String,Object>>) called dataList.
 * Step 2: Create appleMap<String, Object> and add below pairs into it.
 * "Items", "Apple""Price", 20.00
 * "Quantity", 10
 * Step 3: Add appleMap to dataList.
 * Step 4: Create orangeMap<String, Object> and add below pairs into it.
 * "Items", "Orange""Price", 21.99
 * "Quantity", 10
 * Step 5: Add orangeMap to dataList.
 * Step 6: Create a loop from dataList.
 * Step 7: Retrieve each Key and store is in a variable.
 * Step 8: calculate the subtotal of each object.
 * Step 9: Print the values of each Iteration same as shown below in Output example.
 * Step 10: Calculate the Sum of subtotal. and store is in variable called totalPurchase.
 * Step 11: After Loop Print the value of Total Purchase.
 * **NOTE: as the values are Object you have to do casting properly
 * while retrieving from for each map.**
 *
 *
 * Output:
 * Items: Apple Price: 20.0 Quantity: 10.0 SubTotal: 200.0
 * Items: Orange Price: 21.99 Quantity: 10.0 SubTotal: 219.89999999999998
 * Your Purchase total : 419.9
 */
public class Task1 {
    public static void main(String[] args) {

//        List list = new ArrayList();

        Map<String, Object> appleMap = Map.of(
                "Items", "Apple",
                "Price", 20.00,
                "Quantity", 10
        );

        Map<String, Object> orangeMap = Map.of(
                "Items", "Orange",
                "Price", 21.99,
                "Quantity", 10
        );

        List<Map<String, Object>> dataList = List.of(appleMap, orangeMap);

        double commonSum = 0;

        for (Map<String, Object> map : dataList) {
            Object itemName = map.get("Items");
            double price = (Double)map.get("Price");//Object -> Double
            int qty = (Integer) map.get("Quantity");//Object -> Integer

            double sum = qty * price;

            commonSum += sum;

            System.out.println("Items: " + itemName + "\tPrice: " + price + "\tSubTotal: " + sum);
        }

        System.out.println("Your total: " + commonSum);
    }
}
