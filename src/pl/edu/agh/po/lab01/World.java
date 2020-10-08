package pl.edu.agh.po.lab01;

import agh.cs.lab1.*;


public class World {

    private static Direction[] strToDir(String[] args){

        int size = 0;
        for(String arg : args){
            if(arg.equals("f")||arg.equals("b")||arg.equals("r")||arg.equals("l"))size++;
        }

        Direction[] direction = new Direction[size];

        int i = 0;
        for(String arg : args){
            switch (arg){
                case "f" -> direction[i++] = Direction.FORWARD;
                case "b" -> direction[i++] = Direction.BACKWARD;
                case "l" -> direction[i++] = Direction.LEFT;
                case "r" -> direction[i++] = Direction.RIGHT;

            }

        }

        return direction;
    }

    public static void main(String[] args) {
        System.out.println("Start");

        Direction[] direction = strToDir(args);
        run(direction);

        System.out.println("Stop");
    }

    private static void run(Direction[] directions){

        for(Direction direction: directions){
            switch (direction){
                case LEFT -> System.out.println("Zwierzak skręca w lewo");
                case RIGHT -> System.out.println("Zwierzak skręca w prawo");
                case FORWARD -> System.out.println("Zwierzak idzie do przodu");
                case BACKWARD -> System.out.println("Zwierzak idzie do tyłu");
            }
        }

    }
}
