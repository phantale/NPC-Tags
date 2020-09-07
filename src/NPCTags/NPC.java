package NPCTags;

import Demo.Controller;
import NPCTags.NPCTags;
import NPCTags.Tag;
import NPCTags.TagList;

public class NPC {
    private NPCTags tags;
    private Controller controller = Controller.getInstance();

    //generate specific NPCTags.NPC
    public NPC(NPCTags tags){
        this.tags = tags;
    }

    //generate default or random NPCTags.NPC
    public NPC(boolean randomize){
        //TODO: Logic for generating a randomized set of tags
        TagList tagList = TagList.getInstance();
        Tag job = tagList.getTag("DefaultJob");
        Tag[] jmods = {};
        Tag[] downtime = {};
        Tag[] dmods = {};
        Tag[] smods = {};
        this.tags = new NPCTags(job, jmods, downtime, dmods, smods);
    }
}
