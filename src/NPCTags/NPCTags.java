package NPCTags;

// Wrapper class to hold the various tags for an NPCTags.NPC
public class NPCTags {

    private Tag job;
    private Tag[] jMods, downtime, dMods, sleepMods;

    public NPCTags(Tag job, Tag[] jMods, Tag[] downtime, Tag[] dMods, Tag[] sleepMods){
        this.job = job;
        this.jMods = jMods;
        this.downtime = downtime;
        this.dMods = dMods;
        this.sleepMods = sleepMods;
    }

    public Tag getJob(){
        return this.job;
    }

    public Tag[] getjMods() {
        return this.jMods;
    }

    public Tag[] getdowntime() {
        return this.downtime;
    }

    public Tag[] getdMods() {
        return this.dMods;
    }

    public Tag[] getsleepMods() {
        return this.sleepMods;
    }
}
