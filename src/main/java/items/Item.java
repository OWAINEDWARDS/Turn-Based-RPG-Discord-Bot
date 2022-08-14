package items;
import Dice.Dice;
import net.dv8tion.jda.api.EmbedBuilder;

import java.awt.*;
import java.io.File;

public abstract class Item { //sellable, others extend

    String fileAttachmentString;
    Dice itemDice;
    File itemImageFile;
    EmbedBuilder embedItem = new EmbedBuilder();

    public EmbedBuilder getEmbedItem(){
        return embedItem;
    }
    public File getItemImageFile(){
        return itemImageFile;
    }
    public String getFileAttachmentString(){
        return fileAttachmentString;
    }

    protected abstract void makeEmbedItem();

}
