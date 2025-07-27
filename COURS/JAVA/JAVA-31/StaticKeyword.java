public class StaticKeyword {
    public static void main(String[] args) {
        Friend friend1 = new Friend("Spongebob");
        Friend friend2 = new Friend("Squidward");
        Friend friend3 = new Friend("Patrick");

        System.out.println(Friend.numOfFriends);
        Friend.showFriends();
    }
}

class Friend {
    String name;
    static int numOfFriends;

    public Friend(String name) {
        this.name = name;
        numOfFriends++;
    }

    static void showFriends() {
        System.out.println("You have " + numOfFriends + " Friends!");
    }
    
}
