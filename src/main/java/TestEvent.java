import net.dv8tion.jda.api.events.guild.member.GuildMemberJoinEvent;
import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import net.dv8tion.jda.api.events.message.react.MessageReactionAddEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;
import org.jetbrains.annotations.NotNull;

public class TestEvent extends ListenerAdapter {

    @Override
    public void onMessageReceived(MessageReceivedEvent event){//everytime a message is sent in the server.
        String messageSent = event.getMessage().getContentRaw();
        System.out.println(messageSent);

//        if(!messageSent.equalsIgnoreCase("I'm Watching and tracking you heheheheh")){
//            event.getChannel().sendMessage("I'm Watching and tracking you heheheheh").queue(); //store in queue when bots have lots of things happening
//
//        }

    }

    @Override
    public void onGuildMemberJoin(@NotNull GuildMemberJoinEvent event) {
        super.onGuildMemberJoin(event);

        event.getGuild().getDefaultChannel().notify();

    }
}
