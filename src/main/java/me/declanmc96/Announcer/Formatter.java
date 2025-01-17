package me.declanmc96.Announcer;

import net.md_5.bungee.api.ChatColor;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Formatter {

    private static final Pattern pattern = Pattern.compile("(?<!\\\\)(&#[a-fA-F\\d]{6})");

    public static String formatnp(String message) {
        Matcher matcher = pattern.matcher(message);
        while (matcher.find()) {
            String color = message.substring(matcher.start()+1, matcher.end());
	            
	        message = message.replace("&"+color, "" + ChatColor.of(color));
	        matcher = pattern.matcher(message);
      
        }
        return message;
    } 
    public static boolean hasHex(String message) {
        Matcher matcher = pattern.matcher(message);
        return matcher.find();
    }
    public static boolean isHex(String message) {
        Matcher matcher = pattern.matcher(message);
        if (matcher.find()) {
            String color = message.substring(matcher.start()+1, matcher.end());
	            
	        message = message.replace("&"+color, "");      
        }else 
        	return false;
        return message.isBlank();
    } 

}
