/**
 * Created by Kevin Poretti on 1/31/2016.
 */
import static location.LocationConstants.*;

public class Candidate
{
    String name;
    State home_state;
    int tv_comms, days_campaigning, primaries_won, score;

    public Candidate(String name, State home_state, int tv_comms, int days_campaigning, int primaries_won)
    {
        this.name = name;
        this.home_state = home_state;
        this.tv_comms = tv_comms;
        this.days_campaigning = days_campaigning;
        this.primaries_won = primaries_won;
        this.score = 0;
    }

    public void calculateScore(State current_state)
    {
        if(this.home_state == current_state)
        {
            this.score += 50;
        }
        // 20 points if region of home state is same as current state
        if(state_region_map.get(this.home_state) == state_region_map.get(current_state))
        {
            this.score += 20;
        }
        // 1 point for every 10 commercials (rounded down if not divisible by 10), 1 point for every day campaigning,
        // 5 points for every primary won
        this.score += (this.tv_comms/10) + this.days_campaigning + (this.primaries_won*5);
    }

    public String toString()
    {
        return name + " " + this.score;
    }
}
