package javaStudy.ch07;

public class Ex7_8 {
    public static void main(String[] args) {
        Time time = new Time();
        time.setHour(1); // 값을 변경
        System.out.println(time.getHour()); // 값을 가져옴

        time.setMinutes(59);
        System.out.println(time.getMinutes());

        time.setSeconde(0);
        System.out.println(time.getSeconde());
    }
}

class Time {
    private int hour;
    private int minutes;
    private int seconde;

    public int getHour() {
        return hour;
    }

    public int getMinutes() {
        return minutes;
    }

    public int getSeconde() {
        return seconde;
    }

    public void setHour(int hour) {
        if (hour < 0 || hour > 23) return;

        this.hour = hour;
    }

    public void setMinutes(int minutes) {
        if (minutes < 0 || minutes > 59) return;
        this.minutes = minutes;
    }

    public void setSeconde(int seconde) {
        if (seconde < 0 || seconde > 59) return;
        this.seconde = seconde;
    }
}
