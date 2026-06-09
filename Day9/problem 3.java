interface Device {
    void turnOn();
    void turnOff();
}

class Fan implements Device {
    public void turnOn() {
        System.out.println("Fan is ON");
    }

    public void turnOff() {
        System.out.println("Fan is OFF");
    }
}

class Light implements Device {
    public void turnOn() {
        System.out.println("Light is ON");
    }

    public void turnOff() {
        System.out.println("Light is OFF");
    }
}

class AirConditioner implements Device {
    public void turnOn() {
        System.out.println("Air Conditioner is ON");
    }

    public void turnOff() {
        System.out.println("Air Conditioner is OFF");
    }
}

public class Problem3 {
    public static void main(String[] args) {
        Device d;

        d = new Fan();
        d.turnOn();
        d.turnOff();

        d = new Light();
        d.turnOn();
        d.turnOff();

        d = new AirConditioner();
        d.turnOn();
        d.turnOff();
    }
}