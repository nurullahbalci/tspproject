public class MainC {
    public static void main(String[] args) {

        int start = 9;

        ArbitInst arbitraryInsertion = new ArbitInst(TurkishNetwork.distances, TurkishNetwork.cities, start);
        CheapestInst cheapestInsertion = new CheapestInst(TurkishNetwork.distances, TurkishNetwork.cities, start);
        FurtherInst farthestInsertion = new FurtherInst(TurkishNetwork.distances, TurkishNetwork.cities, start);
        NearestInsert nearestInsertion = new NearestInsert(TurkishNetwork.distances, TurkishNetwork.cities, start);
        NearestNeigh nearestNeigh = new NearestNeigh(TurkishNetwork.distances, TurkishNetwork.cities, start);

        arbitraryInsertion.bestRoute();
        cheapestInsertion.bestRoute();
        farthestInsertion.bestRoute();
        nearestInsertion.bestRoute();
        nearestNeigh.bestRoute();

        System.out.println(arbitraryInsertion.toString()+"\n"
                +cheapestInsertion.toString()+"\n"
                +farthestInsertion.toString()+"\n"
                +nearestInsertion.toString()+"\n"
                +nearestNeigh.toString());

    }
}