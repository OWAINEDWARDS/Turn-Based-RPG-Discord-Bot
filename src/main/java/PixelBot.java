import Dice.Die6;
import commands.CommandManager;
import net.dv8tion.jda.api.OnlineStatus;
import net.dv8tion.jda.api.entities.Activity;
import net.dv8tion.jda.api.requests.GatewayIntent;
import net.dv8tion.jda.api.sharding.DefaultShardManagerBuilder;
import net.dv8tion.jda.api.sharding.ShardManager;
import net.dv8tion.jda.api.utils.ChunkingFilter;
import net.dv8tion.jda.api.utils.MemberCachePolicy;
import net.dv8tion.jda.api.utils.cache.CacheFlag;

import javax.security.auth.login.LoginException;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

//use ful links:

/**
 *
 *
 * WIKI: https://github.com/DV8FromTheWorld/JDA/wiki
 * DISCORD BOT APPLICATION THIG https://discord.com/developers/applications/1007794042026852512/oauth2/url-generator
 * JDA EVENTS https://jda.wiki/introduction/events-list/
 * https://discord-intents-calculator.vercel.app/
 * https://stackoverflow.com/questions/53070973/saving-users-data-even-if-the-bot-go-offline-or-it-get-an-update
 *
 *
 *
 */

//IMPO
    // Use channel or private messages to store user data? or maybe just the server,
    // private for multi cross server sup

public class PixelBot {


    public static void main(String[] args) {

        try {
            final ShardManager shardManager;

            BufferedReader brToken = new BufferedReader(new FileReader("src/main/resources/config.json"));

            final String BOT_TOKEN = brToken.readLine().trim();
            System.out.println(BOT_TOKEN);
            DefaultShardManagerBuilder b = DefaultShardManagerBuilder.createDefault(BOT_TOKEN);
            b.setStatus(OnlineStatus.ONLINE);
            b.setActivity(Activity.playing("I love being annoying to program"));
            b.enableIntents(GatewayIntent.GUILD_MESSAGES, GatewayIntent.GUILD_MEMBERS, GatewayIntent.GUILD_PRESENCES);
            b.setMemberCachePolicy(MemberCachePolicy.ALL); // all members on all servers, but lazy load so not all
            b.setChunkingFilter(ChunkingFilter.ALL); //forces bot to cache on startup all users on all servers
            //some events only call on cached things. like emoji reacts method event only calls on cached messages.
            //but caching in long term when on lots of servers, can get slow because caching lots of users.
            //there is something else to retrieve users without caching.
            //event.getJDA().retrieveUserById().queue(); you can queue, but it's resource intensive non memory so trade off.
            b.enableCache(CacheFlag.ONLINE_STATUS);
            shardManager = b.build();

            TestEvent e = new TestEvent();
            shardManager.addEventListener(e);

            CommandManager cm = new CommandManager();
            shardManager.addEventListener(cm);

            Die6 d6 = new Die6();


        } catch (LoginException e) {
            throw new RuntimeException(e);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}
