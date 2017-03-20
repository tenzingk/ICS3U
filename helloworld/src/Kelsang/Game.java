package HansonTenzing;

import hsa_new.Console;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

/**
 * Main.java 
 * This program is a choose your own adventure game. This program tells a different story depending on what choices the user makes.
 * February 21, 2017 
 * @author Hanson Nguyen & Tenzing
 */

public class Main {

static int numChecker = 0;

static int userOutput = 3;

static int houseOutput = 0;

public static void main(String[] args) {

// Declare an array to store all of the user's decisions.


Console c = new Console();

String userInput[] = new String[7];

String parkLoop[] = new String[3];

String houseLoop[] = new String[3];


parkLoop[0]= ("You find the boys hat near the slide. Do you "

+ "want to search for more evidence or go to the aunt's house? search/aunt");

parkLoop[1] = ("You find broken glasses near the swings. It looks like it belongs to the kid."

+ "Do you want to continue searching? search/aunt");

parkLoop[2] = ("You find nothing else and start to make your way to the aunts house."

+ "When you arrive to an abandoned house and an ambulance carrying a body."

+ "The body is the boy you have been searching for, you took to long investigating"

+ "at the park. It was later discovered the aunt murdered him the same night and she left the country"

+ "shortly after. You failed your assignment.");



houseLoop[0] = ("You find valuable information"

+ "about his shaky relationship with his wife. Would you like to further investigate?"

+ "search/no ");

houseLoop[1] = ("You find the victims diary. You read about the abusive relationship he"

+ "had with his uncle. Do you want to continue investigating? search/no");

houseLoop[2] = ("You dont find anything else. Based on what you found out"

+ "would you like to start an investigation on the wife or uncle?"

+ "wife/uncle");
BufferedImage jpgImage = null;

try {
jpgImage = ImageIO.read(new File("Resources/program1.jpg"));
} catch (IOException e) {
System.err.println("There was ana error loading the image.");
e.printStackTrace();
}

BufferedImage jpgImage2 = null;

try {
jpgImage2 = ImageIO.read(new File("Resources/program2.jpg"));
} catch (IOException e) {
System.err.println("There was ana error loading the image.");
e.printStackTrace();
}
BufferedImage jpgImage3 = null;

try {
jpgImage3 = ImageIO.read(new File("Resources/program3.jpg"));
} catch (IOException e) {
System.err.println("There was ana error loading the image.");
e.printStackTrace();
}
BufferedImage jpgImage4 = null;

try {
jpgImage4 = ImageIO.read(new File("Resources/program4.jpg"));
} catch (IOException e) {
System.err.println("There was ana error loading the image.");
e.printStackTrace();
}
BufferedImage jpgImage5 = null;

try {
jpgImage5 = ImageIO.read(new File("Resources/program4.jpg"));
} catch (IOException e) {
System.err.println("There was ana error loading the image.");
e.printStackTrace();
}
BufferedImage jpgImage6 = null;

try {
jpgImage6 = ImageIO.read(new File("Resources/program4.jpg"));
} catch (IOException e) {
System.err.println("There was ana error loading the image.");
e.printStackTrace();
}
BufferedImage jpgImage7 = null;

try {
jpgImage7 = ImageIO.read(new File("Resources/program4.jpg"));
} catch (IOException e) {
System.err.println("There was ana error loading the image.");
e.printStackTrace();
}
BufferedImage jpgImage8 = null;

try {
jpgImage8 = ImageIO.read(new File("Resources/program4.jpg"));
} catch (IOException e) {
System.err.println("There was ana error loading the image.");
e.printStackTrace();
}
BufferedImage jpgImage9 = null;

try {
jpgImage9 = ImageIO.read(new File("Resources/program4.jpg"));
} catch (IOException e) {
System.err.println("There was ana error loading the image.");
e.printStackTrace();
}
BufferedImage jpgImage10 = null;

try {
jpgImage10 = ImageIO.read(new File("Resources/program4.jpg"));
} catch (IOException e) {
System.err.println("There was ana error loading the image.");
e.printStackTrace();
}
BufferedImage jpgImage11 = null;

try {
jpgImage11 = ImageIO.read(new File("Resources/program4.jpg"));
} catch (IOException e) {
System.err.println("There was ana error loading the image.");
e.printStackTrace();
}
BufferedImage jpgImage12 = null;

try {
jpgImage12 = ImageIO.read(new File("Resources/program4.jpg"));
} catch (IOException e) {
System.err.println("There was ana error loading the image.");
e.printStackTrace();
}
BufferedImage jpgImage13 = null;

try {
jpgImage13 = ImageIO.read(new File("Resources/program4.jpg"));
} catch (IOException e) {
System.err.println("There was ana error loading the image.");
e.printStackTrace();
}
BufferedImage jpgImage14 = null;

try {
jpgImage14 = ImageIO.read(new File("Resources/program4.jpg"));
} catch (IOException e) {
System.err.println("There was ana error loading the image.");
e.printStackTrace();
}
do {

c.println("Warning! This game is case sensitive.");

c.println("");
c.drawImage (jpgImage, 400, 100, 220, 240, null);

c.println(

"Beep, Beep, Beep. You look at the time, it's 7:30am. You have to work today but you're very tired.");

c.println("Do you hit the snooze button? yes/no");

userInput[0] = c.readLine();

// Arrive at work story line.
c.clear();
if (userInput[0].equals("no")) {

c.println("You woke up early. You decide to walk to work since the wheather is nice.");
c.drawImage (jpgImage4, 400, 100, 220, 240, null);

c.println(

"You arrive at the precint on time. Just as you arrived at your desk your boss passes by and offers one of two file.");

c.println("Which file do you take? fileA/fileB");

userInput[1] = c.readLine();

// Start of FileA story line.

if(userInput[1].equals("fileA")){

c.println("The case you chose involves a 5 year old boy who has gone missing for 24 hours."

+ "According to the report his aunt was supposed to pick him up from the park earlier"

+ "in the day. Would you like to go to his aunts house or the park? aunt/park");

userInput[2] = c.readLine();

//if user chooses "park"

if(userInput[2].equals("park")){
c.drawImage (jpgImage6, 400, 100, 220, 240, null);

c.println("You arrive at an enormous park. It consists of many branching paths as well as a small playground for little kids");

c.println("Do you want to search the park or got see aunt Megan? aunt/search");

userInput[3] = c.readLine();





while (userInput[userOutput].equals("search") && userOutput <= 5){



if (userInput[userOutput].equals("search") && userOutput == 3){
c.drawImage (jpgImage2, 400, 100, 220, 240, null);

c.println(parkLoop[0]);

userInput[4] = c.readLine();
c.clear();
}if(userInput[userOutput].equals("search") && userOutput == 4){
c.drawImage (jpgImage3, 400, 100, 220, 240, null);
c.println(parkLoop[1]);

userInput[5] = c.readLine();

}

if(userInput[userOutput].equals("search") && userOutput == 5){

c.println(parkLoop[2]);

}

userOutput = userOutput + 1;



}





if(userInput[4].equals("aunt")){

c.println("You arrive at her house and enter her house and you her yelling from one of the rooms. In the room"

+ "is the boy. The aunt is arrested for kidnapping and the boy is reunited with his parents.");



}

//The program cuts off here as in after it finishes if(userInput[4].equals("aunt")) it stops.

if(userInput[5].equals("aunt")){
c.drawImage (jpgImage9, 400, 100, 220, 240, null);

c.println("You find nothing else and start to make your way to the aunts house."

+ "When you arrive to an abandoned house and an ambulance carrying a body."

+ "The body is the boy you have been searching for, you took to long investigating"

+ "at the park. It was later discovered the aunt murdered him the same night and she left the country"

+ "shortly after. You failed your assignment.");

}



else {

numChecker = numChecker + 1;

}

//end of search

if(userInput[3].equals("aunt")){

c.println("You arrive at her house and start intterogating her. You make note"

+ "that she seems to be acting kind of funny. Do you want to further interrogate her"

+ "or go back to the park? stay/park");

userInput[4] = c.readLine();



if(userInput[4].equals("stay")){

c.println("You enter her house and you her yelling from one of the rooms. In the room"

+ "is the boy. The aunt is arrested for kidnapping and the boy is reunited with his parents.");

userInput[5] = c.readLine();

}

else if(userInput[4].equals("park")){
c.drawImage (jpgImage3, 400, 100, 220, 240, null);

c.println("You find broken glasses near the swings. It looks like it belongs to the kid."

+ "Do you want to continue searching? yes/no");

userInput[5] = c.readLine();

}

if(userInput[5].equals("yes")){

c.println("You continue to search but you find nothing.");

}

else if(userInput[5].equals("no")){

c.println("You have a gut feeling that the boy is at the aunts house so"

+ " you go back there. Right before you knock on the door you hear a boy yelling."

+ "You charge in and rescue the boy from his aunt. His aunt is later charged with kidnapping"

+ "and attempted murder. Good work!");

}

else{

numChecker = numChecker + 1;

}

}







//if user chooses aunt

} else if(userInput[2].equals("aunt")){

c.println("You arrive at her house and start intterogating her. You make note"

+ "that she seems to be acting kind of funny. Do you want to further interrogate her"

+ "or go to the park? stay/park");

userInput[3] = c.readLine();

if(userInput[3].equals("stay")){

c.println("You enter her house and you hear yelling from one of the rooms. In the room"

+ "is the boy. The aunt is arrested for kidnapping and the boy is reunited with his parents.");

}

else if(userInput[3].equals("park")){
c.drawImage (jpgImage2, 400, 100, 220, 240, null);

c.println("You find the boys hat near the slide. Do you"

+ "want to search for more evidence? yes/no ");

userInput[4] = c.readLine();

}

else{

numChecker = numChecker + 1;

}

if(userInput[4].equals("yes")){
c.drawImage (jpgImage3, 400, 100, 220, 240, null);

c.println("You find broken glasses near the swings. It looks like it belongs to the kid."

+ "Do you want to continue searching? yes/no");

userInput[5] = c.readLine();

}

else if(userInput[4].equals("no")){

c.println("You return to the aunts house. This time you enter her house and you her yelling from one of the rooms. In the room"

+ "is the boy. The aunt is arrested for kidnapping and the boy is reunited with his parents.");

}else{

numChecker = numChecker + 1;

}

if(userInput[5].equals("yes")){

c.println("You find nothing and call it a day. The next day you see"

+ "the boy on the news, he was found dead at his aunts house last night."

+ "You failed your case and it cost someones life.");

}

else if(userInput[5].equals("no")){

c.println("You start to make your way back to the aunts house."

+ "You knock on the door but theres no answer. You then proceed to kick the door down. "

+ "The house is empty and smells like blood. It was later discovered the aunt murdered the "

+ "boy, hid his body in a forest and fled to a different country. You had the chance to save the boy"

+ "but you took to long .");

}

else{

numChecker = numChecker + 1;

}



}

// Start of FileB story line.

}  if (userInput[1].equals("fileB")) {

c.println("Your case involves the murder of a 25 year old man."

+ "His body was found in an alley way about 20 minutes"

+ "from his house. The cause of death was a gunshot to the heart."

+ "Would you like to investigate at the crime scene or the mans house? crime/house");

userInput[2] = c.readLine();

//if user chooses house



if(userInput[2].equals("house")){

c.println("You visit the mans house and deliver the bad news to his uncle.");

c.println("You decide to ask the uncle a few questions about the victim.");

c.println(houseLoop[0]);

userInput[3] = c.readLine();



while (userInput[userOutput].equals("search") && userOutput <= 4){





if(userInput[userOutput].equals("search")&& userOutput == 3){

c.println(houseLoop[1]);

userInput[4] = c.readLine();

}



if(userInput[userOutput].equals("search")&& userOutput == 4){

c.println(houseLoop[2]);

userInput[5] = c.readLine();

}

userOutput = userOutput + 1;

}







if(userInput[3].equals("no")){

c.println("Based on what you were told you decide to charge the wife with the murder of her husband."

+ "Due to the lack of evidence the case falls through. ");

}

else if(userInput[4].equals("no")){

c.println("You arrest the uncle with suspicion that he murdered his nephew."

+ "Due to the lack of evidence he was released from jail the next day.");

}

if(userInput[5].equals("wife")){

c.println("You launch an investigation on the victims wife. It turns out"

+ " she ended up murdering her husband because she feared he was going to"

+ "file a divorce and take their child away with him. ");

}

else if(userInput[5].equals("uncle")){

c.println("You launch an investigation on the victims uncle. you come"

+ " to find out the victim has not had communication with his uncle"

+ "in over a decade. While"

+ "investigating the wrong person the real murderer, the victim's wife, fled"

+ "the country with her daughter.");

}





//if user chooses crime scene

} else if(userInput[2].equals("crime")){
c.drawImage (jpgImage8, 400, 100, 220, 240, null);

c.println("You find bullets on the crime scene. According to a local"

+ "gun shop a women came in there last week and bought the same bullets."

+ "Would you like to send your team to interrogate this women or go by yourself?"

+ "team/solo");

userInput[3] = c.readLine();



if(userInput[3].equals("team")){

c.println("Your team goes to the address the store owner gave you."

+ "The address ends up belonging to the victims wife. Your team arrest her"

+ "and takes her in for interrogation. She ends up getting charged for the"

+ "murder of her husband.");

}

else if(userInput[3].equals("solo")){
c.drawImage (jpgImage10, 400, 100, 220, 240, null);

c.println("You get the address from the store owner and start to make your way there."

+ "You get to the house and to your surprise it ends up belonging to the victims wife."

+ "You try to arrest her but she resist and break free from your grip. She then proceeds to pull a gun "

+ "from her waist and shoots you in the heart. It is fatal and you died."

);

}

else{

numChecker = numChecker + 1;

}

}

}



// Arrive at work late story line



}else if (userInput[0].equals("yes")) { 



c.println("You quickly get out of bed and get dressed. Unfortunately, "

+ "when you get in your car it doesn't start. Do you want to "

+ "try and fix your car or take the bus? car/bus");

userInput[1] = c.readLine();

if (userInput[1].equals("car")) {

int x = (int) (Math.random() * 5);

// Car does works

if (x <= 3) {
c.drawImage (jpgImage14, 400, 100, 220, 240, null);

c.println("After a few more tries your car finally starts up!"

+ "While you're driving you notice"

+ "a suspicious man walk into a jewelery shop. Do you want to investigate"

+ "or continue your commute to work? investigate/work");

userInput[2] = c.readLine();



// investigate if car works

if (userInput[2].equals("investigate")) {

c.println("You reach the shop and look through the window."

+ "You notice there are 3 robbers in total. Do you want to"

+ "call for backup? yes/no");

userInput[3] = c.readLine();



if (userInput[3].equals("yes")) {

c.println("You call for backup and within minutes they arrive."

+ "The crime is succesfully prevented. Good job!");

} else if (userInput[3].equals("no")) {

c.println("The criminals out number you and you end up dying along"

+ "with the other customers in the store.");

} else {

numChecker = numChecker + 1;

}

}

// go to work car works

else if (userInput[2].equals("work")) {
c.drawImage (jpgImage11, 400, 100, 220, 240, null);


c.println(

"You ignore the crime and make it to work on time. When you arrive at your office you"

+ "see the store that as being robbed on the store on the news. You are hit with an immense amount of guilt for not stopping the crime"

+ "and end up going into a deep depression.");

} else {

numChecker = numChecker + 1;

}

// car does not work

}else {

c.println(

"You are unable to fix your car. and decide to walk to work. You end up being late for"

+ " work and as a punishment you are assigned to parking duty.");

}



// if you chose bus

}else if (userInput[1].equals("bus")) {
c.drawImage (jpgImage7, 400, 100, 220, 240, null);

c.println("While your waiting for your bus you notice"

+ "a suspicious man walk into a jewelery shop. Do you want to invesgigate"

+ "or continue to wait for your bus? investigate/wait");

userInput[2] = c.readLine();



if (userInput[2].equals("investigate")) {

c.println("You reach the shop and look through the window. "

+ "You notice there's 3 robbers in total. Do you want to"

+ "call for backup? yes/no ");

c.readLine();



if (userInput[3].equals("yes")) {

c.println("You call for backup and within minutes they arrive."

+ "The crime is successfully prevented. Good job!");

} else if (userInput[3].equals("no")) {

c.println("The criminals out number you and you end up dying along"

+ "with the other customers in the store.");

}else{

numChecker = numChecker + 1;

}

} else if (userInput[2].equals("wait")) {

c.println("You ignore the crime and make it to work on time. When you arrive at your office you"

+ "are surprised to see your boss sitting on your chair. He breaks the news that you are fired for ignoring a crime.");



} else {

numChecker = numChecker + 1;



}





}else{

numChecker = numChecker + 1;

}







}

else{

numChecker = numChecker + 1;

}



if (numChecker == 1) {

c.println("You inputed an invalid answer. Please don't do that again.");

numChecker = numChecker - 1;

} else {

}



c.println("Do you want to play again? yes/no");

userInput[6] = c.readLine();


c.clear();
}while (userInput[6].equals("yes"));

c.close();

}
}