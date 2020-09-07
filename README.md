# NPCTags
A simple system to create text-based NPCs by assigning them various tags which dictate their behaviour throughout a simulated day. These tags are divided into five categories:

### Job Tag
This dictates an NPCTags.NPC's working hours, as well as the actions the NPCTags.NPC will take during this time. Each NPCTags.NPC can only have *one* `Job` tag.

### Job Modifier Tag
These allow for variation within professions by changing working hours or behaviour. An example would be the tag **Poacher** which when attached to an NPCTags.NPC with a `Job` tag such as **Fisherman** would cause tham to target rarer fish and catch larger quantities. Ideally this would also change their interactions with an NPCTags.NPC such as a **Guard**. Another example is **Nightshift** which would invert their working hours. Multiple `Job Modifier` tags can be attached to a single NPCTags.NPC.

### Downtime Tag
These dictate what an NPCTags.NPC does when not working, for example a hobby or a chore. Multiple `Downtime` tags can be attached to an NPCTags.NPC.

### Downtime Modifier Tag
These function much the same as a `Job Modifier` tag.

### Sleep Modifier Tag
These tags alter sleep patterns for an NPCTags.NPC. Examples are **Early Riser**, **Late Nights** and **Consistent**. To use the latter as an example, an NPCTags.NPC with the **Consistent** `Sleep Modifier` tag will display much less variations in the times they go to sleep and wake up. An NPCTags.NPC with this tag will have an hour within which they will always go to sleep/wake whereas an NPCTags.NPC without this tag will have a range of 3-4 hours within which they will sleep and wake. A **Heavy Sleeper** would be harder to wake than other NPCs, while a **Light Sleeper** would be woken very easily.
