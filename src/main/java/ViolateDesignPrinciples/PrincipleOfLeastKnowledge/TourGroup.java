package ViolateDesignPrinciples.PrincipleOfLeastKnowledge;

import java.util.List;

/**
 * Created by User on 2016/10/25.
 */
public class TourGroup {
    List<Tourist> group;
    String destination;
    String tourGuide;

    public List<Tourist> getGroup() {
        return group;
    }

    public void setGroup(List<Tourist> group) {
        this.group = group;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getTourGuide() {
        return tourGuide;
    }

    public void setTourGuide(String tourGuide) {
        this.tourGuide = tourGuide;
    }
}
