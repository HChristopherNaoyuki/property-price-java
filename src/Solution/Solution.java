package Solution;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Solution
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        // Initialize a 2D array to store property prices
        double[][] propertyPrices = new double[3][3];

        // Array of province names for output readability
        String[] provinces = { "Gauteng", "Natal", "Cape" };
        String[] propertyTypes = { "Flat", "Townhouse", "House" };

        // Input property prices for each province
        for (int i = 0; i < provinces.length; i++)
        {
            System.out.printf("Enter property prices for %s (%s, %s, %s):%n",
                provinces[i], propertyTypes[0], propertyTypes[1], propertyTypes[2]);

            for (int j = 0; j < propertyTypes.length; j++)
            {
                while (true)
                {
                    try
                    {
                        System.out.printf("%s: R ", propertyTypes[j]);
                        propertyPrices[i][j] = scanner.nextDouble();

                        if (propertyPrices[i][j] < 0)
                        {
                            System.out.println("Price cannot be negative. Please try again.");
                            continue;
                        }

                        break;
                    }
                    catch (InputMismatchException e)
                    {
                        System.out.println("Invalid input. Please enter a valid number.");
                        scanner.nextLine(); // Clear invalid input
                    }
                }
            }

            System.out.println(); // New line for better readability
        }

        // Calculate and print total average property price for each province
        for (int i = 0; i < propertyPrices.length; i++)
        {
            double total = 0;

            for (int j = 0; j < propertyPrices[i].length; j++)
            {
                total += propertyPrices[i][j];
            }

            double averagePrice = total / propertyPrices[i].length;

            System.out.printf("Total average property price for %s: R %.2f%n", provinces[i], averagePrice);
        }

        scanner.close();
    }
}
