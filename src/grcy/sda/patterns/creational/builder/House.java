package grcy.sda.patterns.creational.builder;

public class House {
    private String basement;
    private String walls;
    private String roof;

    private String garage;
    private String garden;

    public House(HouseBuilder builder) {
        this.basement = builder.basement;
        this.walls = builder.walls;
        this.roof = builder.roof;
        this.garage = builder.garage;
        this.garden = builder.garden;
    }

    public String getBasement() {
        return basement;
    }

    public String getWalls() {
        return walls;
    }

    public String getRoof() {
        return roof;
    }

    public String getGarage() {
        return garage == null ? "" : garage;
    }

    public String getGarden() {
        return garden == null ? "" : garden;
    }

    public static class HouseBuilder {
        private String basement;
        private String walls;
        private String roof;

        private String garage;
        private String garden;

        public HouseBuilder(String basement, String walls, String roof) {
            this.basement = basement;
            this.walls = walls;
            this.roof = roof;
        }

        public HouseBuilder withGarden(String garden) {
            this.garden = garden;
            return this;
        }

        public HouseBuilder withGarage(String garage) {
            this.garage = garage;
            return this;
        }

        public House build() {
            return new House(this);
        }
    }
}
