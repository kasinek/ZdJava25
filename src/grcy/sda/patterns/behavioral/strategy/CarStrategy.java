package grcy.sda.patterns.behavioral.strategy;

public class CarStrategy implements TravelStrategy {
    private boolean includeMotorways;
    private boolean includeFieldRoads;

    public CarStrategy(boolean includeMotorways, boolean includeFieldRoads) {
        this.includeMotorways = includeMotorways;
        this.includeFieldRoads = includeFieldRoads;
    }

    @Override
    public void setTravelPlan(String from, String to) {
        StringBuilder plan = new StringBuilder("Travel by car")
                .append(includeMotorways ? " including paid roads" : "")
                .append(includeFieldRoads ? " including field roads" : "")
                .append(".");
        System.out.println(plan);

    }
}
