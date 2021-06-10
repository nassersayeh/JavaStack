import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.HashMap;
import java.util.Set;

public class Project {
    String name = "";
    String description = "";
    double initialCost ;
public void Project(){}
public void Project(String name){
    this.name = name;
}
public void Project(String name , String description){
    this.description = description;
}
public void setName(String name){
    this.name = name;
}
public void setDesc(String desc){
    this.description = desc;
}
public String getName(){
    return name;
}
public String getDesc(){
    return description;
}
public void setInitialCost(double initialCost){
    this.initialCost = initialCost;
}
public double getInitialCost(){
    return initialCost;
}
public static void main(String [] args){
    Project elevatorPitch = new Project();
    elevatorPitch.name = "first name";
    elevatorPitch.description = "first description";
    System.out.println(elevatorPitch.name+" "+"("+elevatorPitch.initialCost+")"+" : "+elevatorPitch.description);
}

}