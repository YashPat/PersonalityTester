import javax.swing.JOptionPane;					
import java.util.Scanner;								
import java.util.Random;
import java.awt.*;								
import java.applet.*;								
import java.awt.event.*;								
import java.io.*;   //for files						
import java.net.*;
import javax.sound.midi.*;
import java.util.Vector;
//import jmidi.*;
import static java.lang.System.*;
import static java.lang.Math.*;
import static java.lang.String.*;
import java.util.InputMismatchException;

public class PersonalityTest
{
	public static Scanner scan = new Scanner (in);
	static String name;
	static int animal;
	static int personality;
	static int color;
	static String s;
	public static void main(String args[])
	{
		JOptionPane.showMessageDialog(null,"Welcome to Personality Test","Personality Test",JOptionPane.INFORMATION_MESSAGE);
		JOptionPane.showMessageDialog(null,"Answer each question as accurately as possible, as these questions will foreshadow your destiny!","Personality Test",JOptionPane.INFORMATION_MESSAGE);
		results();
	}
	public static String name()
	{
		s = JOptionPane.showInputDialog("In order to begin you must tell me what your name is.");
	    name = s;
	    return name;
	}
	public static int color()
	{
		s = JOptionPane.showInputDialog("Which of these colors appeals to you the most? : \n1)green\n2)red\n3)orange\n4)blue\n5)yellow\n");
		color = Integer.parseInt(s);
		return color;
	}
	public static int animal()
	{
		s = JOptionPane.showInputDialog("Of these animals, which of these relates to you the most? : \n1)A Lion\n2)A Turtle\n3)An Elephant\n");
		animal = Integer.parseInt(s);
		return animal;
	}
	public static int personality()
	{
		s = JOptionPane.showInputDialog("Which of these personalities, reflects you the most? : \n 1)The Action Taker\n 2)The Visionary\n 3)The Planner\n 4)The Mentor\n 5)The Inventor\n 6)The Analyzer\n 7)The Naturalist\n");
		personality = Integer.parseInt(s);
		return personality;
	}
	public static void results()
	{
		do
		{
		int x = 0;
		x++;
		String b;	
		String n = name();
		int a = animal();
		int p = personality();
		int c = color();
		JOptionPane.showMessageDialog(null, "Well " + n + " we have determined your personality.","Results",JOptionPane.INFORMATION_MESSAGE);
		out.println("************************************************************************************************");
		out.println(n + ":");
		out.println();
		switch (a)
		{
			case 1: out.println("Your personality enjoys the limelight and may even \n" +
			"be susceptible to flattery. Because a lion is so accustomed to being\n"+
			"admired he takes it for granted.");
			break;
			case 2: out.println("You represent patience and order in their way of life \n" +
			"You are very understanding and fair minded towards others. You have a parental \n" +
			"instinct and are capable of taking others under your care. \n");
			break;
			case 3: out.println("An elephant personality is a person whose deliberate  \n" + 
			"movements exude confidence and calm in all aspects of his or her life. \n " +
			"While maybe not the king of the animal world, it is surely a member of \n"
			+ "the royal family. With an imposing physical presence and kind, spiritual \n" +
			"demeanor, it moves easily through life where few barriers can hold it back.\n");
			break;
			default: out.println("Error");
		}
		out.println();
		switch (c)
		{
			case 1: out.println("Having a personality color green means \n" + 
			"you are kind, generous and compassionate - good to have\n" +
			"around during a crisis as you remain calm and take control\n"
			+ "of the situation until it is resolved.\n");
			break;
			case 2: out.println("With a favorite color red,\n"+
			"you like to be the center of attention - in\n"+
			"fact all reds crave attention - other people\n" +
			"are drawn to the vitality and sense of excitement\n"+
			"you emit.");
			break;
			case 3: out.println("With orange as your\n"+
			"favorite color, you are warm, optimistic,\n"+
			"extroverted and often flamboyant.You are\n"+
			"friendly, good-natured and a generally agreeable person.");
			break;
			case 4: out.println("If this is your favorite color\n"+ 
			"you are conservative, reliable and trustworthy - you\n"+
			"are quite trusting of others although you are very\n"+
			"wary in the beginning until you are sure of the other\n"+
			"person. At the same time, you also have a deep need to be trusted.\n");
			break;
			case 5: out.println("You are creative, often being the one who comes\n"+
			"up with new ideas - an ideas person who needs others to\n"+
			"bring the ideas into reality - you tend to have your\n"+
			"head in the clouds much of the time.");
			break;
			default: out.println("Error");
		}
		out.println();
		switch (p)
		{
			case 1: out.println("Action takers enjoy hands-on work and do\n"+
			"well with specific tasks and concrete goals. They tend\n"+
			"to be more physical by nature and take jobs with some\n" +
			"degree of physicality. Though they can interact with\n" +
			"others, they prefer working alone on the task at hand.\n"+
			"Both surgeons and carpenters exemplify action takers.");
			break;
			case 3: out.println("Planners pay attention to details\n"+
			"and follow rules. They tend toward perfectionism and are,\n"
			+"at times, compulsive about doing a job right. Though not\n"+
			"typically leaders, planners make excellent colleagues\n"+
			"because they’re hard working, conscientious, and ever-diligent\n"+
			"about deadlines. Accountants and copywriters are often planners.");
			break;
			case 2: out.println("Visionaries often work in the private\n"+
			"sector and represent the movers and shakers of the world.\n"+
			"They are natural-born leaders and entrepreneurs, and usually\n"+
			"extraverted, energetic, and daring. While a team of\n"+
			"visionaries never falls short of ideas, they gloss over\n"+
			"details and need support from others to get the job done.\n"+ 
			"They make good politicians, business executives, and startup founders.");
			break;
			case 4: out.println("Mentors thrive in the helping fields,\n"+ 
			"holding jobs where they can make a difference. They typically\n"+
			"work in the nonprofit or public sector, and gravitate to\n"+
			"professions like social work, teaching, and coaching. Mentors\n"+ 
			"exhibit compassion in everything they do and enjoy working for\n"+
			"a cause. They are incredibly loyal and true team players.");
			break;
			case 5: out.println("Inventors are creative, out-of-the-box\n"+ 
			"thinkers who need opportunities for creative expression.\n" +
			"They can work both independently and with others and tend\n"+
			"to feel passionate about what they do. Inventors make good\n"+
			"artists (musicians, creative writers, actors, graphic designers)\n"+
			"and media production specialists.\n");
			break;
			case 6: out.println("Analyzers enjoy asking questions and searching\n"+
			"for solutions. More science-oriented than most, they think deeply\n"+
			"and critically and look for clues to support or discredit an idea\n"+
			"or uncover a new solution. Analysts make strong statisticians,\n"+ 
			"scientists, and lawyers.");
			break;
			case 7: out.println("More than a weekend hiker or gardener, naturalists\n"+
			"are drawn to the natural world and often devote their career\n"+
			"to preserving and protecting the earth. With a preference for\n"+
			"working outdoors, naturalists make good organic farmers, master\n"+
			"gardeners, marine biologists, and environmental scientists.");
			break;
			default: out.println("Error");
		}
	}while (playAgain());
	}
		public static boolean playAgain()
		{
			s = JOptionPane.showInputDialog("Do you want to take another test? Y N");
			if (s.equalsIgnoreCase("y"))
			{
				return true;
			}
			return false;
		}
								 
}
		