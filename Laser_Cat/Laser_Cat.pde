int x = 83;
int y = 91;
int acceleration = 5;
PImage catPic;
void setup(){
  size( 250, 200);
  catPic = loadImage("cat.jpg");
            catPic.resize(width,height);
     background(catPic);
  
  
  
  
  
}
void keyPressed() {
            x=x+acceleration;
      y=y+acceleration;
}
    
void draw(){
  noStroke();
  ellipse(x, y, width, height);
  ellipse(x+220, y, 60, 50);
  fill(#FC0022); 
if(mousePressed){
            println("Mouse’s x-position: " + mouseX + "\n" + "Mouse’s y-position: " + mouseY + "\n");}

if(x > width){
  

  
  
  

}
}
