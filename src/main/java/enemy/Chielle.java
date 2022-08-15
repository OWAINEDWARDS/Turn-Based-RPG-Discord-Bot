package enemy;

import java.awt.*;
import java.io.File;

public class Chielle extends Enemy{

    public Chielle(){
        makeEmbedItem();
    }

    @Override
    protected void makeEmbedItem() {
        embedItem.setTitle("ENEMY: Chielle");
        embedItem.setDescription("A heatwave is approaching.");
        embedItem.setColor(Color.BLACK);
        //set up image
        itemImageFile = new File("src/main/resources/monsterResources/chielle.png");
        fileAttachmentString = "chielle.png";
        embedItem.setImage("attachment://"+fileAttachmentString); //set image to embed as attachment
    }
}
