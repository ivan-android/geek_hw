package com.company.lesson_8;

public class Wall extends Obstruction {
    private int wallSize;
    private boolean isJumpSuccess;

    public Wall(int wallSize){
        this.wallSize = wallSize;
    }

    public boolean getIsJumpSuccess(){
        return isJumpSuccess;
    }

    public void jumpWall(Jumpebyl jumpebyl){
        if(wallSize <= jumpebyl.getJumpMax()){
            jumpebyl.jump();
            isJumpSuccess = true;
        }else {
            System.out.println("Не смог перепрыгнуть");
            isJumpSuccess = false;
        }

    }

}
