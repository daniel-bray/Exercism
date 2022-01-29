public class Twofer {
    public String twofer(String name) {
    // if (name == null){
    //   name = "you";
    // }
    // use ternary instead of if statement
    String personsName = name==null?"you":name;
       return "One for " + personsName + ", one for me.";
    }
}
