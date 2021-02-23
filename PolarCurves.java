import java.awt.Color; //need to import the Color class to draw in color

public class PolarCurves{
   
   public static double polarFunc(double theta){
      /*A polar function of r given theta
      Used to draw a polar curve in main()
      Input:
         double theta: an angle measured in radians
      Output:
         return: the radius for given theta
      */
      
      return 0.15*theta; //change this line to change the polar curve
   }
   
   public static void main(String[] args){
      /*Draw the polar curve described by r(theta)
      Input: none
      Output:
         StdDraw: draw the polar curve for r(theta)
      */
      double axisScale = 5.0;       //change this number to zoom in or out
      double minTheta = 0.01;        //change this number to change the range of theta
      double maxTheta = Math.PI*25;  //change this number to change the range of theta
      int nPoints = 2000;           //change this number to increase the resolution of the graph
      double pointSize = 0.02;      //change this number to increase the size of points
      Color pointColor = Color.RED; //the color to draw points
      
      //Set up the canvas for drawing
      StdDraw.setScale(-1.05*axisScale, 1.05*axisScale); //zoom out by 5% to get a better view
      //Draw the axes
      drawAxes(axisScale, axisScale/4.0); //make 8 tick marks regardless of scale
      //Set the pen to the point color
      StdDraw.setPenColor(pointColor);
      
      //evaluate the polar function at several points
      double theta = minTheta;  //starting value of theta
      double dTheta = (maxTheta-minTheta)/nPoints; //amount to increment theta
      while(theta <= maxTheta){
         //evaluate the radius at this theta
         double radius = polarFunc(theta);
         //make a Polar coordinate
         Polar p = new Polar(radius, theta);
         //draw the coordinate
         p.draw(pointSize);
         //increment theta
         theta += dTheta;
      }
   }     
   
   //A helper function for drawing polar curves
   public static void drawAxes(double range, double by){
      /*Draw axes from 0, 0 to range, with tick marks every by
      Input:
         double range: the range over which to draw the axes
         double by: how often to draw a tick mark
      Output:
         StdDraw: draws equally-scaled axes -range to range
      Ex.
      drawAxes(10.0, 2.0) -> draws axes from -10 to 10 with ticks every 2
      drawAxes(1.0, 0.1)  -> draws axes from -1 to 1 with ticks every 0.1
      */
      //draw the axes
      StdDraw.line(-1.05*range, 0.0, 1.05*range, 0.0); //x-axis
      StdDraw.line(0.0, -1.05*range, 0.0, 1.05*range); //y-axis
      
      //draw & label the tick marks      
      double tickWidth = 0.02*range; //how wide to make tick marks
      int decimalPlaces = ("" + (by - (int)by)).length() - 2; //how many decimal places to display
      //do the x ticks first
      double tick_x = by;
      while(tick_x <= range){
         //draw the tick
         StdDraw.line(tick_x, -tickWidth, tick_x, tickWidth);
         //draw the tick label
         StdDraw.text(tick_x, -2*tickWidth, String.format("%."+String.format("%d", decimalPlaces)+"f", tick_x));
         //draw the tick
         StdDraw.line(-tick_x, -tickWidth, -tick_x, tickWidth);
         //draw the tick label
         StdDraw.text(-tick_x, -2*tickWidth, String.format("%."+String.format("%d", decimalPlaces)+"f", -tick_x));
         //increment the tick
         tick_x += by;
      }
      
      //do the y ticks - work out from 0 to let you skip 0
      double tick_y = by;
      while(tick_y <= range){
         //draw the tick
         StdDraw.line(-tickWidth, tick_y, tickWidth, tick_y);
         //draw the tick label
         StdDraw.textRight(-tickWidth, tick_y, String.format("%."+String.format("%d", decimalPlaces)+"f", tick_y));
         //draw the tick
         StdDraw.line(-tickWidth, -tick_y, tickWidth, -tick_y);
         //draw the tick label
         StdDraw.textRight(-tickWidth, -tick_y, String.format("%."+String.format("%d", decimalPlaces)+"f", -tick_y));
         //increment the tick
         tick_y += by;
      }
   }
}
      
      
      