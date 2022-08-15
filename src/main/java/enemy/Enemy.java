package enemy;

import Dice.Dice;
import net.dv8tion.jda.api.EmbedBuilder;

import java.io.File;

public abstract class Enemy {

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
