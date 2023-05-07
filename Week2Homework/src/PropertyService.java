import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class PropertyService {
    private PropertyGetter propertyGetter;
    PropertyService(PropertyGetter propertyGetter){
        this.propertyGetter = propertyGetter;
    }

    /**
    *PRICE METHODS
    */
    public double getTotalPriceOfHouses(){

        return getTotalPrice(propertyGetter.getHouses());
    }
    public double getTotalPriceOfVillas(){

        return getTotalPrice(propertyGetter.getVillas());
    }
    public double getTotalPriceOfResorts(){

        return getTotalPrice(propertyGetter.getResorts());
    }
    public double getTotalPriceOfProperties(){
        return getTotalPriceOfHouses() + getTotalPriceOfVillas() + getTotalPriceOfResorts();
    }
    public double getTotalPrice(List<Property> propertyList){
        double totalPrice = 0;
        for(Property property : propertyList){
            totalPrice += property.getPrice();
        }
        return totalPrice;
    }

    /**
     *SIZE METHODS
     */
    public double getAverageSizeOfHouses(){

        return getAverageSize(propertyGetter.getHouses());
    }
    public double getAverageSizeOfVillas(){

        return getAverageSize(propertyGetter.getVillas());
    }
    public double getAverageSizeOfResorts(){

        return getAverageSize(propertyGetter.getResorts());
    }
    public double getAverageSizeOfProperties(){
        return getAverageSizeOfHouses() + getAverageSizeOfVillas() + getAverageSizeOfResorts();
    }
    public double getAverageSize(List<Property> propertyList){
        int totalSize = 0;
        for(Property property : propertyList ){
            totalSize += property.getSize();
        }
        return (double) totalSize / propertyList.size();
    }

    /**
    * ROOM COUNT FILTER METHOD
    */
    public List<Property> getPropertiesByRoomAndHallCount(int roomCount, int hallCount){
        List<Property> resultList = new ArrayList<>();

        List<Property> houses = propertyGetter.getHouses();
        resultList.addAll(propertyRoomHallCountFilter(houses, roomCount, hallCount));

        List<Property> villas = propertyGetter.getVillas();
        resultList.addAll(propertyRoomHallCountFilter(villas, roomCount, hallCount));

        List<Property> resorts= propertyGetter.getResorts();
        resultList.addAll(propertyRoomHallCountFilter(resorts, roomCount, hallCount));

        return resultList;
    }
    public List<Property> propertyRoomHallCountFilter(List<Property> propertyList, int roomCount, int hallCount){
        List<Property> filteredList = propertyList  .stream()
                                                    .filter(property -> property.getRoomCount() == roomCount && property.getHallCount() == hallCount)
                                                    .collect(Collectors.toList());
        return filteredList;
    }
}
