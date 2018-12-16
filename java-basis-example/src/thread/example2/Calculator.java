package thread.example2;

public class Calculator {
    private int memory;

    public int getMemory() {
        return memory;
    }

    public void setMemory(int memory) {

        synchronized (this) {
            this.memory = memory;
            try {
                Thread.sleep(2000);
            } catch (Exception e) {
            }
            System.out.println(Thread.currentThread().getPriority() + ":" + this.getMemory());
        }
    }

    public void settest() {
        this.memory = 1;
    }
}


