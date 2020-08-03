
 // Make a slippery dot. When you click on the dot it will slide to a new location.
 
 
 // 1. Create three integer variables to represent the x, y, and the size of the ellipse
      int x = 200;
      int y = 200;
      int ellipsesize = 20;
      
    void setup() {
      // 2. Set the size of your sketch
      size(1000, 500);
     
    }
    
    void draw() {
    
      // 3. Set the background color of your sketch
      background(#4DEFFF);
      // 4. Draw an ellipse using the variables created at the top of the sketch for the location and size of your ellipse. 
      //    Make sure it fits in the window. Change the variables if it does not.
      ellipse(x, y, ellipsesize, ellipsesize);
    
    }
    
    /******** This method gets called automatically when you press the mouse ************/
    void mousePressed() {
      //5. Create an integer variable called distance
      int distance = 0;
      //6. The getDistanceFromMouse() method below returns a number.
      //   Set the value of your distance variable to the value returned by the getDistance method
      //   You will need to pass the x and y location of your ellipse to this method.
      distance = getDistanceFromMouse(x, y);
          
      //7.  Use an if statement to check if your distance variable is < the radius of the ellipse
      //    If it is, make a new x AND y for the ellipse, for a new random location on the window
      //    Hint: Use code like this      x = (int) random(width);
       
      
    }
    
    /********  This method gives you the number of pixels between the mouse and the x,y point ***********/
    int getDistanceFromMouse(int x, int y) {
      return (int)Math.sqrt(Math.pow((mouseX-x),2) + Math.pow((mouseY-y),2));
    }
