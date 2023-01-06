package L10;


public class CityK {

    private String name;
    private int numOfResidents;
    private int numOfPatients;

    public CityK() {

    }

    public CityK(String name, int numOfResidents, int numOfPatients) {
        this.name = name;
        this.numOfResidents = numOfResidents;
        this.numOfPatients = numOfPatients;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumOfResidents() {
        return numOfResidents;
    }

    public void setNumOfResidents(int numOfResidents) {
        this.numOfResidents = numOfResidents;
    }

    public int getNumOfPatients() {
        return numOfPatients;
    }

    public void setNumOfPatients(int numOfPatients) {
        this.numOfPatients = numOfPatients;
    }

    public boolean isEqualPatients(CityK cityK) {
        return cityK.getNumOfPatients() == this.numOfPatients;
    }

    public String getCityColor() {
        double percent= (double) (numOfPatients/numOfResidents)*100;
        if(percent<5)
            return "Green";
        else if(percent<=15)
            return "Orange";
        else
            return "red";
    }
}

