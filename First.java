
public class First{
    public static void main(String[] args){
        String[]student=new String[5];
        student[0] = "Priti";                       
        student[1] = "Matthe";
        student[2] = "Sheetal";
        student[3] = "Sadiya";
        student[4] = "Tanvi";
        int i = 0;
        while (i < student.length) {
            System.out.print(student[i] + " ");
            i++;
        }
        System.out.println();
    };
};