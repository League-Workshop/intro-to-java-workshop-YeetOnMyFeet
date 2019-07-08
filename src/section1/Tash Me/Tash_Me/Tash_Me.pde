PImage mustache; PImage friend;

void setup(){

friend = loadImage("Breathtaking.jpg");
size(800, 600);
friend.resize(width,height);
background(friend);
 mustache =
loadImage("Mustache.png");


}
void draw(){
 background(friend);
if(mousePressed){
  mustache.resize(200,200);
image(mustache, 400, 300);
   }
  
  
}
