package commands;

import net.dv8tion.jda.api.events.guild.GuildJoinEvent;
import net.dv8tion.jda.api.events.guild.GuildReadyEvent;
import net.dv8tion.jda.api.events.interaction.command.SlashCommandInteractionEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;
import net.dv8tion.jda.api.interactions.commands.build.CommandData;
import net.dv8tion.jda.api.interactions.commands.build.Commands;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;

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
            event.reply("You find an old rusty pipe").queue(); //mstq
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

    void runRummageCommand(){

    }
}
