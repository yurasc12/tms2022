package space;

public class Main {
    public static void main(String[] args) {
        SpacePort spacePort = new SpacePort();


        IStart[] iStarts;
        iStarts = new IStart[2];
        iStarts[0] = new Shuttle();
        iStarts[1] = new SpaceX();

        for (IStart iStart : iStarts) {
            if (iStart instanceof Shuttle) {
                System.out.println("Стартует Шатл!!!");
            } else {
                System.out.println("Стартует SpaceX");
            }
            spacePort.Launch(iStart);
        }


    }
}
