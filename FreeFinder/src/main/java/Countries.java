public abstract class Countries {
    String c[] = {"Barcelona","Madrid","Mallorca","Ibiza","Menorca","Galicia","Asturias"};
    String act[] = {"Relax & Spa","City Tour","Climbing","Shopping","Party","Kayak"};
    String prices[] = {"BTC","EUR","$"};

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getActivities() {
        return activities;
    }

    public void setActivities(String activities) {
        this.activities = activities;
    }

    public String getIniciales() {
        return iniciales;
    }

    public void setIniciales(String iniciales) {
        this.iniciales = iniciales;
    }

    public String getZone() {
        return zone;
    }

    public void setZone(String zone) {
        this.zone = zone;
    }

    private String name;
    private String activities;
    private String iniciales;
    private String zone;

    /** ahora hacemos les getters and setters ***/





}
