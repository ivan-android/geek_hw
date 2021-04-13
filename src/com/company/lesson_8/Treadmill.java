package com.company.lesson_8;

public class Treadmill extends Obstruction {

    private int treadmillSize;
    private boolean isRunSuccess;

    public Treadmill(int treadmillSize){
        this.treadmillSize = treadmillSize;
    }

    public boolean getIsRunSuccess(){
        return isRunSuccess;
    }

    public void runTreadmill(Runebyl runebyl){
        if(treadmillSize <= runebyl.getRunMax()){
            runebyl.run();
            isRunSuccess = true;
        }else {
            System.out.println("Не смог пробежать");
            isRunSuccess = false;
        }

    }


}
