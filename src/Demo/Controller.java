package Demo;

import NPCTags.NPC;
import java.util.Timer;
import java.util.TimerTask;
import java.util.ArrayList;
import java.util.stream.IntStream;

public class Controller {
    private static Controller instance = null;

    private final Timer timer = new Timer();
    public NPC[] NPCs;
    public int hour;
    public int minute;

    private Controller(){
        // Init time of day to midnight
        this.hour = 0;
        this.minute = 0;
    }

    public static Controller getInstance(){
        if (instance == null) instance = new Controller();
        return instance;
    }

    /** ===================================== METHODS ======================================= */

    public void setNPCs(int numNPCs){
        ArrayList<NPC> npcs = new ArrayList<>();
        //generate numNPCs new NPCTags.NPC objects and add to npcs array
        IntStream.rangeClosed(1, numNPCs).forEach(num -> npcs.add(new NPC(true)));

        //set NPCs field
        this.NPCs = npcs.toArray(new NPC[npcs.size()]);
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
