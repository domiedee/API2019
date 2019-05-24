public class waterVehicles {

    private int numberOfPropellers;
    private int depth;
    private String distance;

    public waterVehicles(int numberOfPropellers, int depth, String distance) {
        this.numberOfPropellers = numberOfPropellers;
        this.depth = depth;
        this.distance = distance;
    }

    public int getNumberOfPropellers() {
        return numberOfPropellers;
    }

    public void setNumberOfPropellers(int numberOfPropellers) {
        this.numberOfPropellers = numberOfPropellers;
    }

    public int getWaterdepth() {
        return depth;
    }

    public void setWaterdepth(int waterdepth) {
        this.depth = waterdepth;
    }

    public String getDistance() {
        return distance;
    }

    public void setDistance(String distance) {
        this.distance = distance;
    }
}
