package space;

public class SpacePort {
    void Launch(IStart object) {
        if (!object.cheсkSystems()) {
            System.out.println("Предстартовая проверка провалена !!!");
        } else {
            object.startEngine();
            int i = 10;
            while (i < 0) {
                System.out.println(i);
                i--;
            }
            object.start();
        }
    }
}
