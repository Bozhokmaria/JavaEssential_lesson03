package task1;

public class BadPupil extends Pupil {

    @Override
    void study() {
        System.out.println("Bad studying");
    }

    @Override
    void read() {
        System.out.println("Bad reading");;
    }

    @Override
    void write() {
        System.out.println("Bad writting");
    }

    @Override
    void relax() {
        System.out.println("Fighting");
    }
}
