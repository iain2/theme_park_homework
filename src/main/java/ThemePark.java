import attractions.Attraction;
import behaviours.IReviewed;
import stalls.Stall;

import java.util.ArrayList;

public class ThemePark {

    private ArrayList<Attraction> attractions;
    private ArrayList<Stall> stalls;

    public ThemePark() {
        this.attractions = new ArrayList<Attraction>();
        this.stalls = new ArrayList<Stall>();
    }


    public ArrayList<Attraction> getAttractions() {
        return attractions;
    }

    public void addAttraction(Attraction attraction){
        attractions.add(attraction);
    }

    public ArrayList<Stall> getStalls() {
        return stalls;
    }

    public void addStall(Stall stall){
        stalls.add(stall);
    }
}
