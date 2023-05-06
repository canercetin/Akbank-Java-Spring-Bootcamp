import java.util.ArrayList;
import java.util.List;

public class PropertyGetter {
    List<Property> houses = new ArrayList<>();
    List<Property> villas = new ArrayList<>();
    List<Property> resorts = new ArrayList<>();
    {
        houses.add(new House("house1",300000,40,1,0));
        houses.add(new House("house2",6000000,240,6,2));
        houses.add(new House("house3",1000000,120,3,1));

        villas.add(new Villa("villa1",1000000, 150, 4, 1));
        villas.add(new Villa("villa2",10000000, 350, 8, 2));
        villas.add(new Villa("villa3",5000000, 250, 6, 1));

        resorts.add(new Resort("resort1",400000,60,1,1));
        resorts.add(new Resort("resort2",3000000,200,5,1));
        resorts.add(new Resort("resort3",2000000,130,3,1));
    }
    public List<Property> getHouses(){
        return houses;
    }
    public List<Property> getVillas(){
        return villas;
    }
    public List<Property> getResorts(){
        return resorts;
    }
}
