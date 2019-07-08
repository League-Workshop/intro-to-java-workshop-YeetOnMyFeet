PImage rainbow;
PImage unicorn;
void setup(){
   rainbow = loadImage("Rainbow.jpeg");
size(800, 600);
rainbow.resize(width,height);
background(rainbow);
 unicorn = loadImage("unicorn.png");
  unicorn.resize(200,200);
  
  
  
}
void draw(){
 
  if(mousePressed) {
image(unicorn, mouseX, mouseY);


  
  
  }}
