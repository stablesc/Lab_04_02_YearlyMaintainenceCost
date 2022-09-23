public class Main {
    public static void main(String[] args)
    {
        double springCost = 100;
        double summerCost = 150;
        double autumnCost = 80;
        double winterCost = 200;
        double yearlyCost = springCost + summerCost + autumnCost + winterCost;
        {
            System.out.println(" When the maintenance cost for Spring is $" + springCost + ", the Summer cost is $"
                    + summerCost + ", the Autumn cost is $" + autumnCost + ", and the Winter cost is $" + winterCost +
                    ", the total yearly maintenance cost is $" + yearlyCost + ".");
        }
    }
}