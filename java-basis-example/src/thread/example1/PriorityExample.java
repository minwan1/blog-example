package thread.example1;

public class PriorityExample {

    public static void main(String[] args) {

        for (int i = 1; i <= 20; i++) {
            Thread thread = new CalcThread("thread" + i);

            if (i != 20) {
                thread.setPriority(Thread.MIN_PRIORITY);
            } else {
                thread.setPriority(Thread.MAX_PRIORITY);
            }
            thread.start();
        }

            //thread2
            //thread3
            //thread1
            //thread4
            //thread5
            //thread6
            //thread7
            //thread8
            //thread9
            //thread10
            //thread11
            //thread12
            //thread13
            //thread14
            //thread15
            //thread16
            //thread17
            //thread18
            //thread19
            //thread20
    }

}
