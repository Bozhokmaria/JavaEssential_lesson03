package task1;

public class Main {
    public static void main(String[] args) {
        Pupil pupil = new Pupil();
        Pupil good = new GoodPupil();
        Pupil bad = new BadPupil();
        Pupil excellent = new ExcelentPupil();

        ClassRoom classRoom = new ClassRoom(pupil, good, bad, excellent);
        classRoom.study();
        classRoom.read();
        classRoom.relax();
        classRoom.write();
    }
}
