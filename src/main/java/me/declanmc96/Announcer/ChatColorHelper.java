package me.declanmc96.Announcer;
 
import org.bukkit.ChatColor;
 
public class ChatColorHelper
{
  public static String replaceColorCodes(String message)
  {
	  message=ChatColor.translateAlternateColorCodes('&', message);
	  message= Formatter.formatnp(message);
    return message;
  }
}