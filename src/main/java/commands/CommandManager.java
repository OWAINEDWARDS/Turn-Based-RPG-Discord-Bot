package commands;

import items.EdibleItem;
import items.Item;
import items.ItemPools;
import items.SwattedSoup;
import net.dv8tion.jda.api.EmbedBuilder;
import net.dv8tion.jda.api.events.guild.GuildJoinEvent;
import net.dv8tion.jda.api.events.guild.GuildReadyEvent;
import net.dv8tion.jda.api.events.interaction.command.SlashCommandInteractionEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;
import net.dv8tion.jda.api.interactions.commands.build.CommandData;
import net.dv8tion.jda.api.interactions.commands.build.Commands;
import org.jetbrains.annotations.NotNull;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class CommandManager extends ListenerAdapter {

    @Override
    public void onSlashCommandInteraction(@NotNull SlashCommandInteractionEvent event) {
        super.onSlashCommandInteraction(event);

        String command = event.getName();
        if(command.equals("inventory")){ // c  /inventory
            String userTag = event.getUser().getAsTag();
            event.reply(userTag + " 's" + " Inventory").queue(); //mstq
        }
        else if(command.equals("rummage")){
            String userTag = event.getUser().getAsTag();
            runRummageCommand(event);
        }
    }

    @Override
    public void onGuildJoin(@NotNull GuildJoinEvent event) {
        super.onGuildJoin(event);
        //register commands once bot joins server.
        List<CommandData> commandData = new ArrayList<>();
        commandData.add(Commands.slash("inventory", "take a look at your inventory."));
        commandData.add(Commands.slash("rummage", "Rummage around the nearby bins, bushes and boxes."));
        event.getGuild().updateCommands().addCommands(commandData).queue();

    }

    //guild commands and global commands exist. global commands have to be uploaded to discord s itself takes up to an hour. hard to test.
    //test them in guild commands first. //guild can only have 100 commands
    @Override
    public void onGuildReady(@NotNull GuildReadyEvent event) {
        super.onGuildReady(event);

        //on new guild loaded.
        List<CommandData> commandData = new ArrayList<>();
        commandData.add(Commands.slash("inventory", "take a look at your inventory."));
        commandData.add(Commands.slash("rummage", "Rummage around the nearby bins, bushes and boxes."));
        event.getGuild().updateCommands().addCommands(commandData).queue();

//        can check for specific guild
    }

    private void runRummageCommand(SlashCommandInteractionEvent event){

        //chances based on pocket dice. Each player has a pocket dice that starts low and can be upgraded. starts will low chance. a D6 with 3 1s and 2, 3 ,6 can upgrade to d6 with etc... then d20 with.....

        //rummage roll anything above a 1. start dice begins at D6 1,1,1,1,1,2
        ItemPools itemPoolsManager = new ItemPools();
        int selectedItemIndex =  new Random().nextInt(itemPoolsManager.getEdibleItemMushroomForestPool().size() - 0 ) + 0; //21 exclusive so 1 to 20
        EdibleItem selectedEdible = itemPoolsManager.getEdibleItemMushroomForestPool().get(selectedItemIndex);
        EmbedBuilder embedItem = selectedEdible.getEmbedItem();
        //set up image
        File file = selectedEdible.getItemImageFile();
        event.replyEmbeds(embedItem.build()).addFile(file, selectedEdible.getFileAttachmentString()).queue();



    }
}
