public class Guest extends Person {

    private int stayDuration;

    public Guest(String name, int stayDuration) {
        super(name);
        this.stayDuration = stayDuration;
    }

    public int getStayDuration() {
        return stayDuration;
    }

    public void setStayDuration(int stayDuration) {
        this.stayDuration = stayDuration;
    }
}