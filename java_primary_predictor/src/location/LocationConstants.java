/**
 * Created by Kevin Poretti on 1/31/2016.
 */
package location;

import java.util.HashMap;
import java.util.Map;
import datastructures.Bimap;

public class LocationConstants
{
    public enum Region
    {
        NEW_ENGLAND, NORTHEAST, SOUTHEAST, LAKES, CENTRAL, WEST, PACIFIC
    }

    public enum State
    {
        ME, NH, VT, MA, CT, RI, NY, PA, NJ, DE, MD, VA, NC, SC, GA, FL, AL, MS, TN, KY, WV, AR, LA,
        OH, MI, IN, IL, WI, MN, IA, MO, ND, SD, NE, KS, OK, TX, MT, WY, CO, NM, AZ, UT, ID, NV, WA,
        OR, CA, AK, HI
    }

    public static final Map<State, Region> state_region_map = new HashMap<State, Region>()
    {{
        put(State.ME, Region.NEW_ENGLAND);
        put(State.NH, Region.NEW_ENGLAND);
        put(State.VT, Region.NEW_ENGLAND);
        put(State.MA, Region.NEW_ENGLAND);
        put(State.CT, Region.NEW_ENGLAND);
        put(State.RI, Region.NEW_ENGLAND);

        put(State.NY, Region.NORTHEAST);
        put(State.PA, Region.NORTHEAST);
        put(State.NJ, Region.NORTHEAST);
        put(State.DE, Region.NORTHEAST);
        put(State.MD, Region.NORTHEAST);

        put(State.VA, Region.SOUTHEAST);
        put(State.NC, Region.SOUTHEAST);
        put(State.SC, Region.SOUTHEAST);
        put(State.GA, Region.SOUTHEAST);
        put(State.FL, Region.SOUTHEAST);
        put(State.AL, Region.SOUTHEAST);
        put(State.MS, Region.SOUTHEAST);
        put(State.TN, Region.SOUTHEAST);
        put(State.KY, Region.SOUTHEAST);
        put(State.WV, Region.SOUTHEAST);
        put(State.AR, Region.SOUTHEAST);
        put(State.LA, Region.SOUTHEAST);

        put(State.OH, Region.LAKES);
        put(State.MI, Region.LAKES);
        put(State.IN, Region.LAKES);
        put(State.IL, Region.LAKES);
        put(State.WI, Region.LAKES);
        put(State.MN, Region.LAKES);

        put(State.IA, Region.CENTRAL);
        put(State.MO, Region.CENTRAL);
        put(State.ND, Region.CENTRAL);
        put(State.SD, Region.CENTRAL);
        put(State.NE, Region.CENTRAL);
        put(State.KS, Region.CENTRAL);
        put(State.OK, Region.CENTRAL);
        put(State.TX, Region.CENTRAL);

        put(State.MT, Region.WEST);
        put(State.WY, Region.WEST);
        put(State.CO, Region.WEST);
        put(State.NM, Region.WEST);
        put(State.AZ, Region.WEST);
        put(State.UT, Region.WEST);
        put(State.ID, Region.WEST);
        put(State.NV, Region.WEST);

        put(State.WA, Region.PACIFIC);
        put(State.OR, Region.PACIFIC);
        put(State.CA, Region.PACIFIC);
        put(State.AK, Region.PACIFIC);
        put(State.HI, Region.PACIFIC);
    }};

    static final Bimap<State, String> state_string_map = new Bimap<State, String>()
    {{
        put(State.ME, "ME");
        put(State.NH, "NH");
        put(State.VT, "VT");
        put(State.MA, "MA");
        put(State.CT, "CT");
        put(State.RI, "RI");
        put(State.NY, "NY");
        put(State.PA, "PA");
        put(State.NJ, "NJ");
        put(State.DE, "DE");
        put(State.MD, "MD");
        put(State.VA, "VA");
        put(State.NC, "NC");
        put(State.SC, "SC");
        put(State.GA, "GA");
        put(State.FL, "FL");
        put(State.AL, "AL");
        put(State.MS, "MS");
        put(State.TN, "TN");
        put(State.KY, "KY");
        put(State.WV, "WV");
        put(State.AR, "AR");
        put(State.LA, "LA");
        put(State.OH, "OH");
        put(State.MI, "MI");
        put(State.IN, "IN");
        put(State.IL, "IL");
        put(State.WI, "WI");
        put(State.MN, "MN");
        put(State.IA, "IA");
        put(State.MO, "MO");
        put(State.ND, "ND");
        put(State.SD, "SD");
        put(State.NE, "NE");
        put(State.KS, "KS");
        put(State.OK, "OK");
        put(State.TX, "TX");
        put(State.MT, "MT");
        put(State.WY, "WY");
        put(State.CO, "CO");
        put(State.NM, "NM");
        put(State.AZ, "AZ");
        put(State.UT, "UT");
        put(State.ID, "ID");
        put(State.NV, "NV");
        put(State.WA, "WA");
        put(State.OR, "OR");
        put(State.CA, "CA");
        put(State.AK, "AK");
        put(State.HI, "HI");
    }};

    public static String stateEnumToString(State state)
    {
        return state_string_map.forward.get(state);
    }

    public static State stringToStateEnum(String state)
    {
        return state_string_map.backward.get(state);
    }
}
