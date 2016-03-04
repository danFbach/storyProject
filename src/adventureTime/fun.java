package adventureTime;

import java.util.Scanner;

public class fun {

	public static void main(String[] args) {
		
		String playerName;
		String yesNo;
		String planet;
		Integer alien;
		Integer life;
		Integer marsNum;
		Integer jupiterNum;
		Integer marsLife;
		Integer home;
		
		
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		System.out.println("Hello explorer, what is your name?");
		playerName = scan.nextLine();
		System.out.println("Welcome to space " + playerName + "! Are you ready for an Exploration?");
		yesNo = scan.nextLine();
		yesNo = yesNo.toLowerCase();
		life = 1;
				
		do{
			if(yesNo.matches("yes")){
				System.out.println("Then lets get to it! We've already launched from earth and are on our way to Mars " + playerName + ". \n"
						+ "So you have two options. You can either continue on your path to Mars or adjust your trajectory\n"
								+ "in order to point towards Jupiter...choose wisely Mr." + playerName +"stronaut! Mars or Jupiter?");
				planet = scan.nextLine();
				planet = planet.toLowerCase();
				if(planet.equals("mars")){
					System.out.println("Great Choice "+playerName+"! This adventure will prove to be something to remember.\n"
							+ "You have arrived on mars " + playerName + ". You now have to decide how you are going to spend your time...\n"
							+ "1 - Exit the spacecraft and begin to collect interplanetary samples.\n"
							+ "2 - Play it safe and let your colleague do YOUR job.\n"
							+ "3 - Collect Data from within the landing craft.");
					marsNum = scan.nextInt();
					if(marsNum == 1){
						System.out.println("Well " + playerName + ", great choice. You have made an incredible discovery!..\n"
								+ "There is LIFE on Mars! You must decide whether to...\n1 - Disclose your findings\n2 - Suppress the truth");
						marsLife = scan.nextInt();
							if(marsLife == 1){
								life = 4;
							}else if(marsLife == 2){
								life = 5;
							}else System.out.println("you've made the wrong decision.");
					}else if(marsNum == 2){
						System.out.println("Some colleague...not only did he fail to make any discoveries, but he went and died\n"
								+ "on you...Unfortunately, you were the only ones that came down in the lander and it takes two to\n"
								+ "fly the the lander craft back to the orbiting ship Mars. So...");
						life = 0;
					}else if(marsNum == 3){
						System.out.println("It seems like it would be a good idea, however your instuments absolutely suck at collecting\n"
								+ "valuable data and while you weren't paying attention your fellow astronaut went out, ran out of O2...\n"
								+ "needless to say, he's toast. And sadly without him, you are too!");
						life = 0;
					}else System.out.println("Really? You can't count to three " + playerName + "?");						
				}
				else if(planet.equals("jupiter")){
					System.out.println("You have changed your trajectory to Jupiter. Eventhough mission control told you, " + playerName + ", that this\n"
							+ "was a suicidal change you told them...NO! MY NAME IS " + playerName + " AND I AM IN CONTROL OF THIS MISSION!\n"
							+ "You have sincerely pissed mission control off and are left with very few options...\n"
							+ "1 - You can turn back to mars.\n"
							+ "2 - You can continue towards Jupiter!..fly on Mr."+ playerName +"-stronaut.\n"
							+ "3 - Well, you chose to turn towards JUPITER..the third option could prove to be sketchy..");
					jupiterNum = scan.nextInt();
					if(jupiterNum == 1){
						System.out.println(playerName + "...really " + playerName + "? What makes you think that it is possible to turn back\n"
								+ "towards Mars?..you fool! you foolish fool! needless to say...");
						life = 0;
					}else if(jupiterNum == 2){
						System.out.println("Well, after an excruciatingly long journey...mission control informs you, for the 441st time\n"
								+ "that the Mars lander will never land on Jupiter...the Mars lander was built for a much lower descent,\n"
								+ "not even considering the fact that Jupiter is made mostly of gas. You've failed your mission...");
						life = 0;
					}else if(jupiterNum == 3){
						System.out.println("First you failed by deciding to fly to Jupiter with a spacecraft built to fly to Mars...\n"
								+ "However, you seem to have encountered an alien space craft...So far you have done better than others\n"
								+ "but this choice is crucial...\n 1 - Attempt a Friendly encounter\n 2 - Attack with all your might!");
						alien = scan.nextInt();
						if(alien == 1){life = 3;
						}else if(alien == 2){life = 0;
						}else System.out.println("Really? You can't count to two " + playerName + "?");
					}else System.out.println("Really? You can't count to three " + playerName + "?");
				}
				else{System.out.println("You're a terrible speller.");}
			}
			else if(yesNo.equals("no")){
				System.out.println("Well you're already in space and since you don't feel like exploring I'm going to eject you...");
				life = 0;
				}	
			else{
				System.out.println("Check your spelling and try again.");
				}break;
		}while(life == 1);
			
			if(life == 2){
				System.out.println("Congratulations, you have completed your mission and are on your way back to earth!");
			}else if(life == 3){
				System.out.println("Wow...just WOW! Not only have you discovered an alien race, but you have done well to greet them\n"
						+ "politely and have begun a positive relationship that will improve the lives of all Earthians!\n"
						+ "Houston could not be more pleased with your actions. You and the advanced alien race are now on the\n"
						+ "way back to earth. You have completed your mission " +playerName+".");
			}else if(life == 4){
				System.out.println("You've decided to disclose your findings and...well Houston (ground control) has decided to leave you\n"
						+ " stranded on Mars in order to suppress the truth about life beyond Earth!");
			}else if(life == 5){
				System.out.println("You've answered no "+playerName+"...and it's good you did. Had you reported your findings ground contol\n"
									+ "would have left you on Mars to die!...Anyways, now that you've suppressed your findings and completed\n"
									+ "this mission you must depart Mars. You can either: "
									+ "\n1 - Fly fast to get home to your family as soon as possible.\n"
									+ "or"
									+ "\n2 - Fly slow and sleady to get home safely.");
				home = scan.nextInt();
				if(home == 1){
					System.out.println("Congrats " + playerName + " you have made it home to your family with out any issues!");
				}else if(home == 2){
					System.out.println("You would think that flying slow would conserve fuel...unfortunately in space it doesn't\n"
							+ "work like that...you're now floating into the abiss waiting to run out of oxygen...sorry dude.");
				}else System.out.println("wrong button foo.");
			}else if(life == 0){
				System.out.println(playerName + ", You're dead.");				
			}
		}
	}

		
		
		
		
		
		
		
		
		
		
		
		
		
		
	


