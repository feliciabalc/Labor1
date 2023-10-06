public class Student {
    int studentNote;

    public Student( int note){

        studentNote=note;
    }

    public int[] nichtAusreichende(int[] note) {
        int[] neueNote = new int[100];
        int neueNoteIndex = 0;
        for (int i=0;i<=note.length; i++){
            if (note[i] <5){
                neueNote[neueNoteIndex] = note[i];
                neueNoteIndex++;
            }
        }
        return neueNote;
    }
    public float durchsnittswert(int[] note){
        float durchsnitt=0;
        int sum=0;
        int index=0;
        for (int i=0;i<=note.length; i++){
            sum=sum+note[i];
            index++;
        }
        durchsnitt=sum/index;
        return durchsnitt;
    }
    public int[] abgerundeteNote(int[] note) {
        int[] rundeteNote = new int[100];
        int index = 0;
        for (int i=0;i<=note.length; i++){
            if (note[i]<38){
                rundeteNote[index]=note[i];
                index++;
            }
            int firstNoteDiv=note[i];
            while (firstNoteDiv%5!=0){
                firstNoteDiv++;
            }
            if (firstNoteDiv-note[i]<3){
                rundeteNote[index]=firstNoteDiv;
                index++;}
                else{
                rundeteNote[index]=note[i];
                index++;
                }
        }
        return rundeteNote;
    }
    public int[] abgerundeteNote(int[] note){

    }
}
