package customers;

import java.util.HashMap;
import java.util.Map;

public class floor {

    //instance variables
    private Map<Integer, room> rooms;// reference a Map
    private static int nextId = 0;
    private int next;
    /**
     * Constructor for objects of class floor
     */

    public floor()
    {
        super();
        rooms = new HashMap<Integer, room>(); // crate a new map
        nextId = nextId + 100;
        next = nextId;
    }

    /**
     * Getter for the variable rooms
     */
    public Map<Integer, room> getRooms()
    {
        return this.rooms;
    }

    /**
     * Will add rooms to the floor
     */

    public void addRooms()
    {
        // the type of rooms that the floor might have

        room first = new room ("Single", true, true);
        room second = new room ("Double", true, true);
        room third = new room ("Single", true, false);
        room fourth = new room ("Double", true, false);
        room fifth = new room ("Single", false, true);
        room sixth = new room ("Double", false, true);
        room seventh = new room ("Single", false, false);
        room eighth = new room ("Double", false, false);

        //the unique room numbers are added to the map
        rooms.put(next + 1, third);
        rooms.put(next + 2, second);
        rooms.put(next + 3, fifth);
        rooms.put(next + 4, sixth);
        rooms.put(next + 5, third);
        rooms.put(next + 6, second);
        rooms.put(next + 7, first);
        rooms.put(next + 8, seventh);
        rooms.put(next + 9, eighth);
        rooms.put(next + 10, fourth);

    }

    /**
     * Returns the values of the set as a string
     */
    public String toString()
    {
        String allRooms = "";
        for(Integer eachRoom: rooms.keySet())
        {
            allRooms = allRooms + eachRoom + ", ";
        }
        return  allRooms;
    }
}
