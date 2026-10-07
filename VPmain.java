import javax.swing.*;

public class VPMain {
    VirtualPet vp = new VirtualPet();
    
    public VPMain(){
        vp.sleeping();
        this.waitABeat(1000);
        String ans = this.askForInput("Do you want to wear your hat today?");
        if(ans.equals("yes")) {
            vp.Hat();
            vp.transportation(); 
            this.waitABeat(5000);
            String entrance = this.askForInput("do you want to enter from the front or back?"); 
            if(entrance.equals("front")) {
                vp.opening();
            }
            else    
                vp.closed(); 
                this.waitABeat(2000);
                String question = this.askForInput("Mr Morris asks you what you are doing here. What do you say? (say: forgot phone or math hour"); 
                if(question.equals("forgot phone")) {
                    vp.youAreOk();
                    this.waitABeat(2000);
                    int choice = this.askForInput("Theres a 10 numbered folders in here. Which number folder do you take?");
                    if (choice >= 0 && choice <=3) {
                        vp.normalEnding();
                    }
                    else if (choice > 3 && choice <=6) {
                        vp.badEnding();
                    }
                    else if (choice > 6 && choice <=9) {
                        vp.whateverEnding(); 
                    }
                    else if (choice == 10) {
                        vp.amazingEnding();
                    }
                    }
                }
                else 
                    vp.notOk(); 
                    vp.sadEnding();
        }
        else 
            vp.noHat();
    }

    public void waitABeat(int ms){
        try {
            Thread.sleep(ms); //milliseconds
        } catch(Exception e){
        
        }
    }

    public String askForInput(String q){
        String s = (String)JOptionPane.showInputDialog(
                    new JFrame(),
                    q,
                    "Input Dialog",
                    JOptionPane.PLAIN_MESSAGE
        );
        return s;
    }



    public static void main(String[] args) {
        new VPMain();    
    }
}

