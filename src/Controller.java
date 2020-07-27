import java.util.Timer;
import java.util.TimerTask;

public class Controller {
    private final Timer timer = new Timer();
    public NPC[] NPCs;
    public int hour;
    public int minute;

    public Controller(){
        // Init time of day to midnight
        this.hour = 0;
        this.minute = 0;
    }

    public void setNPCs(int numNPCs){
        // Generate NPCs

        //set NPCs field
    }

    private void updateSimTime(){
        if (this.minute < 59){
            this.minute++;
            return;
        }
        else if(this.hour < 23) this.hour++;
        else this.hour = 0;
        this.minute = 0;
    }

    public void start() {
        // Timer updates simulated time every second
        timer.scheduleAtFixedRate(new DayCycleTask(this), 1000, 1000);
    }

    static class DayCycleTask extends TimerTask{
        final Controller parent;

        DayCycleTask(Controller parent){ this.parent = parent; }

        @Override
        public void run(){ parent.updateSimTime(); }
    }
}
