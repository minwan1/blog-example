package thread.example5;

public class WaitNotifyExample {

    public static void main(String[] args){
        WorkObject sharedObject = new WorkObject();

        Thread threadA = new ThreadA(sharedObject);
        Thread threadB = new ThreadB(sharedObject);

        threadA.start();
        threadB.start();

//        ThreadA의 methodB() 작업 실행
//        ThreadA의 methodA() 작업 실행
//        ThreadA의 methodB() 작업 실행
//        ThreadA의 methodA() 작업 실행
//        ThreadA의 methodB() 작업 실행
//        ...

    }
}
