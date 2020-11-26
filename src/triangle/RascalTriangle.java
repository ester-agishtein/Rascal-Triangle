package triangle;

public class RascalTriangle {


    public int CalculateValue(int row, int index){
        /*
         * Formula taken from https://apfstatic.s3.ap-south-1.amazonaws.com/s3fs-public/08_comac_rascal_triangle.pdf
         * The index tells you which diagonal you're in.
         * */

        //the diagonal represents the space between the numbers
        int diagonal = row - index;

        //All arrays start at 0, so you need to add one to get the value at that index
        int offSet = 1;

        /*
         * We know that we are creating a triangle with all equal sides.
         * We know each side is the length of the triangle is equal to the row.
         * The diagonal number represents the gap between each of its numbers.
         * We know the final value (the last point on the triangle
         * will equal to the side of the triangle (the row) * the gap between each of the diagonal's numbers.
         * We then add one to offset the zeros.
         */

        int val = index*diagonal + offSet;
        return val;
    }

}
