public class Television {
    boolean on;

    void turnOn(){
        on = true;
    }

    void turnOff(){
        on = false;
    }

    void showStatus(){
        if (on){
            System.out.println("Telewior włączony.");
        }else
            System.out.println("Telewizor wyłączony.");

    }

}
