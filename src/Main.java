public class Main {
    public static void main(String[] args) {

        int[] a=round(new int[]{20, 50, 63, 51, 88});
        for(int element:a){
            System.out.println(element);
        }

        int b[]=insufficient(new int[]{13,40,41,66});
        for(int element:b){
            System.out.println(element);
        }

        float c=average(new int[]{13,40,41,66});
        System.out.println(c);

        int d=maximRounded(new int[]{20, 50, 63, 51, 88});
        System.out.println(d);

    }

    public static int[] round(int[] grades) {
        int[] rounded= new int[grades.length];
        int index=0;
        for(int i=0;i < grades.length;i++){
            if (grades[i]<38){
                rounded[index]=grades[i];
                index++;
                continue;
            }
            int nextMultip=grades[i];
            while (nextMultip%5!=0){
                nextMultip++;
            }
            if (nextMultip-grades[i]<3) {
                rounded[index] = nextMultip;
                index++;
            }else {
                rounded[index] = grades[i];
                index++;
            }
        }
        return rounded;
    }
    public static int[] insufficient(int[] grades){
        int [] insuff=new int[grades.length];
        int index=0;
        for(int i=0;i < grades.length;i++) {
            if (grades[i]<40){
                insuff[index]=grades[i];
                index++;
            }
        }
        return insuff;
    }

    public static float average(int[] grades){
        int sum=0;
        int nr=0;
        float aver=0;
        for(int i=0;i < grades.length;i++){
            sum=sum+grades[i];
            nr++;
        }
        aver=sum/nr;
    return aver;
    }

    public static int maximRounded(int[] grades){
        int[] rounded= new int[grades.length];
        rounded=round(grades);
        int maxim=rounded[0];
        for(int i=0;i < rounded.length;i++){
            if(maxim<rounded[i]){
                maxim=rounded[i];
            }
        }
        return maxim;
    }
}