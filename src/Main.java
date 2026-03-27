import java.util.Random;
import java.util.Scanner;

import static java.lang.System.*;

public class Main {
    public static void main(String[] args) {
        out.println("Welcome to the Magic 8 Ball!");
        String Ball = "      _......._\n" +
                "      .-:::::::::::-.\n" +
                "    .:::::::::::::::::.\n" +
                "   :::::::' .-. `:::::::\n" +
                "  :::::::  :   :  :::::::\n" +
                " ::::::::  :   :  ::::::::\n" +
                " :::::::::._`-'_.:::::::::\n" +
                " :::::::::' .-. `:::::::::\n" +
                " ::::::::  :   :  ::::::::\n" +
                "  :::::::  :   :  :::::::\n" +
                "   :::::::._`-'_.:::::::\n" +
                "    `:::::::::::::::::'\n" +
                "jgs   `-:::::::::::-'\n" +
                "         `'''''''`";
        out.println(Ball);

        while(true) {
            out.println("What question would you like to ask the Oracle?");

            Scanner scanner = new Scanner(in);
            String Input = scanner.nextLine();
            out.println("You asked: " + Input);

            String Answer = get8BallAnswer();
            out.println(Answer);
        }
    }

    private static String get8BallAnswer() {
        String [] magicresponse = {
                "It is certain",
                "It is decidedly so",
                "Without a doubt",
                "Yes definitely",
                "You may rely on it",
                "As, I see it, yes",
                "Most likely",
                "Outlook good",
                "Yes",
                "Signs point to yes",
                "Reply hazy, try again",
                "Ask again later",
                "Better not tell you now",
                "Cannot predict now",
                "Concentrate and ask again",
                "Don't count on it",
                "My reply is no",
                "My sources say no",
                "Outlook not so good",
                "Very doubtful"
        };
        Random random = new Random();
        out.println("        _.---.__\n" +
                "      .'        `-.\n" +
                "     /      .--.   |\n" +
                "     \\/  / /    |_/\n" +
                "      `\\/|/    _(_)\n" +
                "   ___  /|_.--'    `.   .\n" +
                "   \\  `--' .---.     \\ /|\n" +
                "    )   `       \\     //|\n" +
                "    | __    __   |   '/||\n" +
                "    |/  \\  /  \\      / ||\n" +
                "    ||  |  |   \\     \\  |\n" +
                "    \\|  |  |   /        |\n" +
                "   __\\\\@/  |@ | ___ \\--'\n" +
                "  (     /' `--'  __)|\n" +
                " __>   (  .  .--' &\"\\\n" +
                "/   `--|_/--'     &  |\n" +
                "|                 #. |\n" +
                "|                 q# |\n" +
                " \\              ,ad#'\n" +
                "  `.________.ad####'\n" +
                "    `#####\"\"\"\"\"\"''\n" +
                "     `&#\"\n" +
                "      &# \"&\n" +
                "      \"#ba\"");
        out.println("Hmm...");

        int indexLookUp = random.nextInt(magicresponse.length);
        out.println(magicresponse[indexLookUp]);
        return "";
    }
}
