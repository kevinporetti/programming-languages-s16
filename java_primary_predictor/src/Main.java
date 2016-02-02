/**
 * Created by Kevin Poretti on 1/31/2016.
 */
import java.util.*;
import java.io.*;
import static location.LocationConstants.*;

public class Main
{
    public static void main(String[] args)
    {
        List<Candidate> candidates = new ArrayList<Candidate>();
        State current_state;
        int num_candidates;

        try
        {
            File input_file = new File(args[0]);
            FileInputStream fstream = new FileInputStream(input_file);
            BufferedReader br = new BufferedReader(new InputStreamReader(fstream));

            String str_line;
            str_line = br.readLine();
            current_state = stringToStateEnum(str_line);

            str_line = br.readLine();
            num_candidates = Integer.parseInt(str_line);

            for(int i = 0; i < num_candidates; i++)
            {
                str_line = br.readLine();
                String[] params = str_line.split(" ");
                String temp_name = params[0];
                State  temp_home_state = stringToStateEnum(params[1]);
                int    temp_tv_comms = Integer.parseInt(params[2]);
                int    temp_days_campaigning = Integer.parseInt(params[3]);
                int    temp_primaries_won = Integer.parseInt(params[4]);
                Candidate temp_candidate = new Candidate(temp_name, temp_home_state, temp_tv_comms,
                                                         temp_days_campaigning, temp_primaries_won);
                temp_candidate.calculateScore(current_state);
                candidates.add(temp_candidate);
            }
            fstream.close();
        }
        catch (Exception e)
        {
            System.err.println("Error: " + e.getMessage());
        }

        for(Candidate candidate : candidates)
        {
            System.out.println(candidate.toString());
        }
    }
}


