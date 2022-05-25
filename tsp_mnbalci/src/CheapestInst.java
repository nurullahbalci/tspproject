public class CheapestInst extends mTSP implements BestPrice {

    public CheapestInst(int[][] cost, String[] cities, int start) {
        super(cost, cities);
        this.start = start;
    }

    @Override
    public void bestRoute() {
        visited = new int[cost.length];

        tourStarter(start);

        while (tour.size() < cost.length + 1) {
            findMinimalCost(-1);
        }

    }
    @Override
    public void tourStarter(int start) {
        int min = Integer.MAX_VALUE, node = -1;

        for (int i = 0; i < cost.length; i++) {
            if (cost[start][i] < min && i != start) {
                min = cost[start][i];
                node = i;
            }
        }
        addNode(-1, start);
        addNode(0, node);
        addNode(1, start);
    }

    @Override
    public void addNode(int index, int node) {
        tour.add(index + 1, node);
        visited[node] = 1;
    }
    @Override
    public int findMinimalCost(int node) {
        int min = Integer.MAX_VALUE, index = -1, arc;

        for (int i = 0; i < tour.size() - 1; i++) {
            for (int j = 0; j < cost.length; j++) {
                arc = cost[tour.get(i)][j] + cost[j][tour.get(i + 1)] - cost[tour.get(i)][tour.get(i + 1)];
                if (arc < min && visited[j] != 1) {
                    min = arc;
                    index = i;
                    node = j;
                }
            }
        }
        addNode(index, node);
        return 0;
    }

    @Override
    public String toString() {
        return "CheapestInst " + getTotalCost() + " " + tour;
    }
}