package ObeyDesignPrinciples.PrincipleOfLeastKnowledge;

import java.util.List;

/**
 * Created by User on 2016/10/25.
 */
public class TourGroup {
    private List<Tourist> group;
    private String destination;
    private String tourGuide;

    public List<Tourist> getGroup() {
        return group;
    }

    public void setGroup(List<Tourist> group) {
        this.group = group;
    }

    public void addTourist(Tourist t)
    {
        group.add(t);
    }

    public void removeTourist(Tourist t)
    {
        group.remove(t);
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
