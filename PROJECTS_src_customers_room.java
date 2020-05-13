package customers;

public class room {

    private String roomType;
    private boolean hasBalcony;
    private boolean hasSafetyBox;

    /*
     * Constructor for class room
     */

    public room(String aType, boolean aBalcony, boolean aSafetyBox)
    {
        roomType = aType;
        hasBalcony = aBalcony;
        hasSafetyBox = aSafetyBox;
    }

    //getter methods

    public String getRoomType()
    {
        return roomType;
    }

    public boolean getHasBalcony()
    {
        return hasBalcony;
    }

    public boolean getHasSafetyBox()
    {
        return hasSafetyBox;
    }

    //setter methods

    public void setRoomType(String roomType)
    {
        this.roomType = roomType;
    }

    public void setHasBalcony(boolean hasBalcony)
    {
        this.hasBalcony = hasBalcony;
    }

    public void setHasSafetyBox(boolean hasSafetyBox)
    {
        this.hasSafetyBox = hasSafetyBox;
    }
}
