package thread.example1;

public class CalcThread extends Thread{
    public CalcThread(String name){
        setName(name);
    }

    public void run(){
        for(long i = 0; i <2000000000; i++){
            int a = 1;
            a= 2;
            a  += 1;
            a  += 1;
            a  += 1;
            a  += 1;
            a  += 1;
            a  += 1;
            a  += 1;

        }
        System.out.println(getName());
    }

}
