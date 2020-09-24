/*
 *   ProfessionalSoftwareDevelopment:Lab2
 *   File: //TODO
 *   Created by: Melissa Melaugh
 *   Created on: 24/09/2020
 *   Updated on: 24/09/2020
 *   Project Description: //TODO
 */
package Lab2;

public class RectangularVolume {
    private float length;
    private float width;
    private float height;
    private float area;
    private float perimeter; //sometimes called perimeter

    public RectangularVolume(float length, float width, float height){
        this.length = length;
        this.width = width;
        this.height = height;
        this.area = length * width * height;
        this.perimeter = (4 * length) + (4 * width) + (4 * height);
    }//end constructor

    public float getArea() {
        return area;
    }//end getArea

    public float getPerimeter() {
        return perimeter;
    }//end getSurfaceArea

    public float getHeight() {
        return height;
    }//end getHeight

    public float getLength() {
        return length;
    }//end getLength

    public float getWidth() {
        return width;
    }//end getWidth
}
