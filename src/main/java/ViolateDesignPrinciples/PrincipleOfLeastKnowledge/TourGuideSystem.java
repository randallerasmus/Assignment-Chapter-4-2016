package ViolateDesignPrinciples.PrincipleOfLeastKnowledge;

import java.util.List;

/**
 * Created by User on 2016/10/25.
 */
public class TourGuideSystem {

    List<TourGroup> group;
    TourGroup tg = new TourGroup();

    public void addTourist(Tourist t)
    {
        tg.group.add(t);
    }

    public void replaceGuide(String name)
    {
        tg.setTourGuide(name);
    }
}
