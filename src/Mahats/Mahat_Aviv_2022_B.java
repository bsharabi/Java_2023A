package Mahats;

public class Mahat_Aviv_2022_B {

    public static void main(String[] args) {
        Actor ac1 = new Actor("Max", 25, 8);
        Actor ac2 = new Actor("Bob", 48, 11);
        Actor ac3 = new Actor("Alice", 45, 9);
        Actor ac4 = new Actor("Gal", 24, 4);
        Actor ac5 = new Actor("Aviel", 85, 5);
        Actor ac6 = new Actor("Salatz", 19, 20);
        Actor ac7 = new Actor("Barak", 32, 6);

        Act act = new Act("Java", 5);

        System.out.println(act.getCurrentNum());
        //currentNum=0 init

        String ans = act.addActor(ac1);
        System.out.println(ans);
        System.out.println(act.getCurrentNum());
        //currentNum=0 ac1 age = 25

        ans = act.addActor(ac2);
        System.out.println(ans);
        System.out.println(act.getCurrentNum());
        //currentNum=1

        ans = act.addActor(ac3);
        System.out.println(ans);
        System.out.println(act.getCurrentNum());
        //currentNum=2


        ans = act.addActor(ac4);
        System.out.println(ans);
        System.out.println(act.getCurrentNum());
        //currentNum=2 ac4 age = 24

        ans = act.addActor(ac5);
        System.out.println(ans);
        System.out.println(act.getCurrentNum());
        //currentNum=3

        ans = act.addActor(ac6);
        System.out.println(ans);
        System.out.println(act.getCurrentNum());
        //currentNum=3 ac6 age = 16


        for (int i = 0; i < 17; i++) {
            ans = act.addActor(ac5);
            System.out.println(ans);
            System.out.println(act.getCurrentNum());
        }

        ans = act.addActor(ac5);
        System.out.println(ans);
        System.out.println(act.getCurrentNum());

        ans = act.addActor(ac5);
        System.out.println(ans);
        System.out.println(act.getCurrentNum());


        System.out.println(act.f());
    }

}
class Act {
    private String actName;
    private int len;
    private Actor[] actArr;
    private int currentNum;

    public Act(String actNme, int len) {
        this.actName = actNme;
        this.len = len;
        this.currentNum = 0;
        this.actArr = new Actor[20];
    }

    public String addActor(Actor ac) {
        if (currentNum == actArr.length)
            return "no room";
        if (ac == null)
            return "Invaild argumemt";
        if (ac.getAge() < 45 || ac.getNumActs() < 5)
            return "not suitable";
        for (int i = 0; i < currentNum; i++) {
            if (actArr[i] == ac)
                return "Invaild";
        }
        actArr[currentNum] = ac;
        currentNum++;

        return "was added";

    }

    public int f() {
        int num = 0;
        for (int i = 0; i < currentNum; i++) {
            if (actArr[i].getNumActs() >= 10)
                num++;
        }
        return num;
    }

    public String getActName() {
        return actName;
    }

    public void setActName(String actName) {
        this.actName = actName;
    }

    public int getLen() {
        return len;
    }

    public void setLen(int len) {
        this.len = len;
    }

    public Actor[] getActArr() {
        return actArr;
    }

    public void setActArr(Actor[] actArr) {
        this.actArr = actArr;
    }

    public int getCurrentNum() {
        return currentNum;
    }

    public void setCurrentNum(int currentNum) {
        this.currentNum = currentNum;
    }
}

class Actor {
    private String name;
    private int age;
    private int numActs;

    public Actor(String name, int age, int numActs) {
        this.name = name;
        this.age = age;
        this.numActs = numActs;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getNumActs() {
        return numActs;
    }

    public void setNumActs(int numActs) {
        this.numActs = numActs;
    }
}