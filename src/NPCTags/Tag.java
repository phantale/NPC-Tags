package NPCTags;

public class Tag {

    public enum TagType { JOB, JOBMOD, DOWNTIME, DMOD, SLEEPMOD }

    public TagType type;
    String[] behaviour; //PLACEHOLDER

    public Tag(TagType type, String[] behaviour){
        this.type = type;
        this.behaviour = behaviour;
    }

}
