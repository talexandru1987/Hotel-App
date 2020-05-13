package customers;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class hotel {

    //instance variable
    private Map<Integer, floor> levels; //reference a map

    /**
     * Constructor for objects of class hotel
     */
    public hotel()
    {
        super();
        levels = new HashMap<Integer, floor>(); //create a new map
    }

    /**
     * Will add floors to the hotel
     */

    public void addFloors()
    {
        // creating the four levels of the hotel
        floor levelOne = new floor();
        levelOne.addRooms();
        floor levelTwo = new floor();
        levelTwo.addRooms();
        floor levelThree = new floor();
        levelThree.addRooms();
        floor levelFour = new floor();
        levelFour.addRooms();

        // adding the floors tot them map
        levels.put(1, levelOne);
        levels.put(2, levelTwo);
        levels.put(3, levelThree);
        levels.put(4, levelFour);
    }

    /**
     * Print all the keys in the map
     */
    public void printMap()
    {
        for(Integer eachLevel: levels.keySet())//iterates aver all the keys
        {
            System.out.println("The hotel contains level " + eachLevel);
        }

    }

    /**
     * Print the value of the designated key
     */
    public void printMapValue(int aLevel)
    {
        if(levels.containsKey(aLevel))
        {
            System.out.println("Level " + aLevel + " contains rooms " + levels.get(aLevel).toString());
        }
        else
        {
            System.out.println("Level " + aLevel + " is not part of the hotel");
        }
    }

    /**
     * Add an entry to the map
     */
    public void addMapEntry(int aLevel, floor aFloor)
    {
        levels.put(aLevel, aFloor);
    }

    /**
     * Delete an entry from the map
     */
    public boolean deleteEntry(int aLevel)
    {
        if(levels.containsKey(aLevel))
        {
            levels.remove(aLevel);
            return true;
        }
        else
        {
            return false;
        }
    }

    /**
     * Return the rooms in the hotel that meath the criteria
     */
    public Set selectKeys(boolean aBalcony, boolean safetyBox)
    {
        Set<Integer> suitable = new HashSet<Integer>();//empty set that will contain the suitable levels and rooms
        for(int eachLevel: levels.keySet())// loop to etaret through each hotel level
        {
            floor values = levels.get(eachLevel);
            for(Integer eachRoom: values.getRooms().keySet())// loop to iterate through each room
            {
                room value = values.getRooms().get(eachRoom);// assignes each value of the key
                if((value.getHasBalcony() == aBalcony)&&(value.getHasSafetyBox() == safetyBox))//statement to compare the arguments with each room
                {
                    suitable.add(eachRoom); // add the room number to the new set
                }
            }
        }
        return suitable;

    }

    /**
     * Return the rooms in the hotel that meath the criteria
     */
    public Map createReducedMap(boolean aBalcony, boolean safetyBox)
    {
        Map<Integer, room> suitable = new HashMap<>();//empty map that will contain the suitable levels and rooms
        for(int eachLevel: levels.keySet())// loop to etaret through each hotel level
        {
            floor values = levels.get(eachLevel);
            for(Integer eachRoom: values.getRooms().keySet())// loop to iterate through each room
            {
                room value = values.getRooms().get(eachRoom);// assignes each value of the key
                if((value.getHasBalcony() == aBalcony)&&(value.getHasSafetyBox() == safetyBox))//statement to compare the arguments with each room
                {
                    suitable.put(eachRoom, values.getRooms().get(eachRoom)); // add the room number to the new set
                }
            }
        }
        return suitable;

    }
}
