/* Virtual Pet, version 1
 * 
 * @author Cam
 * @author ?
 */
public class VirtualPet {

    VirtualPetFace face;
    int hunger = 0; // how hungry the pet is.

    // constructor
    public VirtualPet() {
        face = new VirtualPetFace();
        face.setImage("sleeping");
        face.setMessage("Hi");
    }

    public void feed() {
        if (hunger > 10) {
            hunger = hunger - 10;
        } else {
            hunger = 0;
        }
        face.setMessage("Yum, thanks");
        face.setImage("normal");
    }

    public void exercise() {
        hunger = hunger + 3;
        face.setMessage("1, 2, 3, jump.  Whew.");
        face.setImage("tired");
    }

    public void sleeping() {
        face.setImage("sleeping");
    }

    public void Hat() {
        face.setImage("yeshat");
        face.setMessage("Okay, today we're going to go steal the test answers from Mr. Morris");
    }

    public void noHat() {
        face.setImage("nohat"); 
        face.setMessage("grrrttgrrgttgrgt(You're done)");
    }

    public void transportation() {
        face.setImage("driving"); 
    }

    public void opening() {
        face.setImage("openingdoor"); 
        face.setMessage("Yay it's open!"); 
    }

    public void closed() {
        face.setImage("scared");
        face.setMessage("OH NO ITS MR MORRIS... (You go home"); 
    }

    public void youAreOk() {
        face.setImage("weareok");
        face.setMessage("Mr Morris: Oh ok cool bye"); 
    }

    public void notOk() {
        face.setImage("crying"); 
        face.setMessage("Mr Morris: Yeah right, why would you be going to math hour? Go home!"); 
    }

    public void sadEnding() {
        face.setImage("sadperry");
        face.setMessage("You failed your cs class!"); 
    }

    public void normalEnding() {
        face.setImage("bored");
        face.setMessage("You got some answers but it wasn't for the test version you had");
    }

    public void badEnding() {
        face.setImage("soscared");
        face.setMessage("Right when you find the answer key Mr. Morris walks in and gives you a referral!");
    }

    public void whateverEnding() {
        face.setImage("reallyannoyed");
        face.setMessage("You got all the test answers but nobody in your class thanked you!");
    }

    public void amazingEnding() {
        face.setImage("rich");
        face.setMessage("WOW! You found all the answers and your class payed you $1000!!!!");
    }

} // end Virtual Pet
