public class Main {
    public static void main(String args[]){

        PropertyGetter getter = new PropertyGetter();
        PropertyService service = new PropertyService(getter);

        System.out.printf("\n* *PROPERTY GETTER METHODS\n*\n%-10s %s\n%-10s %s\n%-10s %s\n*\n\n","Houses:", getter.getHouses(),
                "Villas:", getter.getVillas(), "Resorts:", getter.getResorts());
        System.out.printf("* *PROPERTY SERVICE METHODS\n*\n->Price Methods\n*\n%-30s $%.1f\n%-30s $%.1f\n%-30s $%.1f\n%-30s $%.1f\n",
                "Total Price Of Houses:", service.getTotalPriceOfHouses(), "Total Price Of Villas:", service.getTotalPriceOfVillas(),
                "Total Price Of Resorts:", service.getTotalPriceOfResorts(), "Total Price Of All Properties:",service.getTotalPriceOfProperties());
        System.out.printf("*\n->Size Methods\n*\n%-31s %.1f m^2\n%-31s %.1f m^2\n%-31s %.1f m^2\n%-31s %.1f m^2\n",
                "Average Size Of Houses:", service.getAverageSizeOfHouses(), "Average Size Of Villas:", service.getAverageSizeOfVillas(),
                "Average Size Of Resorts:", service.getAverageSizeOfResorts(), "Average Size Of All Properties:", service.getAverageSizeOfProperties());
        System.out.printf("*\n->Get Properties By Room and Hall Count Method\n*\n%-15s%s\n%-15s%s\n%-15s%s\n%-15s%s\n",
                "room count","result",
                "1+0 :", service.getPropertiesByRoomAndHallCount(1,0),
                "4+1 :", service.getPropertiesByRoomAndHallCount(4,1),
                "3+1 :", service.getPropertiesByRoomAndHallCount(3,1));
    }
}
