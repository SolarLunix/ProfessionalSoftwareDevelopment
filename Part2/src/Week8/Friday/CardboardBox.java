package Week8.Friday;

/*******
 *   Part2:Week8.Friday
 *   File: CardboardBox
 *   Created by: Melissa Melaugh
 *   Created on: 13/11/2020
 *   Updated on: 13/11/2020
 *   Project Description: A class to create Cardboard Boxes
 *******/
public class CardboardBox {
    protected static int noBoxes = 0;
    private int width;
    private int height;
    private int depth;
    private String colour;

    public CardboardBox(){
        this(-1, -1, -1, "unknown");
    }

    public CardboardBox(int width, int height, int depth){
        this(width, height, depth, "unknown");
    }

    public CardboardBox(int width, int height, int depth, String colour){
        noBoxes++;
        this.width = width;
        this.height = height;
        this.depth = depth;
        this.colour = colour;
    }

    private int volume(){
        return width * height * depth;
    }

    public void showAllDetails(){
        System.out.println("\nThe WIDTH of the cardboard box is " + width + " units.");
        System.out.println("The HEIGHT of the cardboard box is " + height + " units.");
        System.out.println("The DEPTH of the cardboard box is " + depth + " units.");
        System.out.println("The VOLUME of the cardboard box is " + volume() + " units cubed.");
        System.out.println("The COLOUR of the cardboard box is " + colour + ".\n");
    }

    public void printTopArea(){
        int topArea = width * depth;
        System.out.println("The TOP AREA of the cardboard box is " + topArea + " units squared");
    }

    public void printFrontArea(){
        int frontArea = width * height;
        System.out.println("The FRONT AREA of the cardboard box is " + frontArea + " units squared");
    }

    public void printSideArea(){
        int sideArea = depth * height;
        System.out.println("The SIDE AREA of the cardboard box is " + sideArea + " units squared");
    }

    public int requiredBoxes(int requiredVolume){
        int boxVolume = volume();
        int numBoxes = requiredVolume / boxVolume;
        if(requiredVolume % boxVolume != 0){
            numBoxes++;
        }
        return numBoxes;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getDepth() {
        return depth;
    }

    public void setDepth(int depth) {
        this.depth = depth;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }
}
