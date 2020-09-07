package NPCTags;
import java.util.HashMap;
import java.util.Map;

/**
 * Read in pre-defined tags from a file and store in a collection.
 * Uses Singleton pattern.
 */

public class TagList {

    private String PATH_TO_TAG_FILE = "";
    private Map<String,Tag> tags = new HashMap<>();
    private static TagList instance = null;

    private TagList(){
        //load file with given path and scan through

        //for each tag, create a Tag object and add to the HashMap with tag_name as the key
    }

    public static TagList getInstance(){
        if (instance == null) instance = new TagList();
        return instance;
    }

    public Tag getTag(String tagName){ return tags.get(tagName); }
}
