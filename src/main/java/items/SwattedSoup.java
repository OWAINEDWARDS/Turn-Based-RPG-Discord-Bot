package items;
import items.EdibleItem;

import java.awt.*;
import java.io.File;

public class SwattedSoup extends EdibleItem {

    public SwattedSoup(){
        makeEmbedItem();
    }

    @Override
    protected void makeEmbedItem(){
        embedItem.setTitle("Swatted Soup");
        embedItem.setDescription("An 'edible' looking soup with lingering buzz , ew. Do I see flies in there?");
        embedItem.setColor(Color.orange);
        embedItem.addField("Hp gain", "10%", true);
        embedItem.addField("Dice Type", "D6", true); //doesn'ty use health dice. health dice are for attacking. 
        embedItem.addField("Dice Ability", "None", true);
        embedItem.addField("Item Type", "edible", true);

        //set up image
        itemImageFile = new File("src/main/resources/edibleItemResources/swattedSoup.png");
        fileAttachmentString = "swattedSoup.png";
        embedItem.setImage("attachment://"+fileAttachmentString); //set image to embed as attachment

    }
}
