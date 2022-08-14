package items;

import items.EdibleItem;

import java.awt.*;
import java.io.File;

public class HotDog extends EdibleItem {

    HotDog(){
        makeEmbedItem();
    }

    @Override
    protected void makeEmbedItem() {
        embedItem.setTitle("Hot Dog");
        embedItem.setDescription("This food has little culture");
        embedItem.setColor(Color.orange);
        embedItem.addField("Hp gain", "2.5%", true);
        embedItem.addField("Dice Type", "D6", true); //neg dice type
        embedItem.addField("Dice Ability", "None", true); //neg ability
        embedItem.addField("Item Type", "edible", true);

        //set up image
        itemImageFile = new File("src/main/resources/edibleItemResources/hotDog.png");
        fileAttachmentString = "hotDog.png";
        embedItem.setImage("attachment://"+fileAttachmentString); //set image to embed as attachment
    }
}
