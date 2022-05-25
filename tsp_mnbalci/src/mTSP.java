import java.util.ArrayList;

public abstract class mTSP {
    protected int[] visited;
    protected int start;
    protected ArrayList<Integer> tour = new ArrayList<>();
    protected final int[][] cost;
    protected final String[] cities;


    public mTSP(int[][] cost, String[] cities){
        this.cost = cost;
        this.cities = cities;
    }


    protected abstract void bestRoute();

    protected abstract void tourStarter(int start);

    protected abstract void addNode(int index, int node);

    public int getTotalCost() {
        int totalCost = 0;
        for (int i = 0; i < tour.size() - 1; i++){
            totalCost += cost[tour.get(i)][tour.get(i+1)];
        }
        return totalCost;
    }

    public abstract String toString();
}