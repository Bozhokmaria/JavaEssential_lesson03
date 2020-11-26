package task1;

public class ClassRoom {
    Pupil pupil;
    Pupil pupil1;
    Pupil pupil2;
    Pupil pupil3;

    public ClassRoom(Pupil pupil, Pupil pupil1) {
        this(pupil, pupil1, new Pupil(), new Pupil());
    }

    public ClassRoom(Pupil pupil, Pupil pupil1, Pupil pupil2) {
        this(pupil, pupil1, pupil2, new Pupil());
    }

    public ClassRoom(Pupil pupil, Pupil pupil1, Pupil pupil2, Pupil pupil3) {
        this.pupil = pupil;
        this.pupil1 = pupil1;
        this.pupil2 = pupil2;
        this.pupil3 = pupil3;
    }

    public void study(){
        pupil.study();
        pupil1.study();
        pupil2.study();
        pupil3.study();
    }

    public void read(){
        pupil.read();
        pupil1.read();
        pupil2.read();
        pupil3.read();
    }

    public void write(){
        pupil.write();
        pupil1.write();
        pupil2.write();
        pupil3.write();
    }
    public void relax(){
        pupil.relax();
        pupil1.relax();
        pupil2.relax();
        pupil3.relax();
    }

}
