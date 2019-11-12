public class Room{
    private String roomName;
    private String roomThings;

    public Room() {
    }

    public Room(String roomName, String roomThings) {
        this.roomName = roomName;
        this.roomThings = roomThings;

    }

    public String getRoomName() {
        return roomName;
    }

    public void setRoomName(String roomName) {
        this.roomName = roomName;
    }

    public String getRoomThings() {
        return roomThings;
    }

    public void setRoomThings(String roomThings) {
        this.roomThings = roomThings;
    }

    public void message(){
        System.out.println("Welcome to " + roomName);
        System.out.println("You see " + roomThings);
    }

    public void directions(){
        System.out.println("You can go North (N), or Quit (Q).");
    }

}
