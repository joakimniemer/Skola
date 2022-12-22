public class Card {
    
    private int value;
    private Color color;

    public Card(int value, Color color){
        this.value = value;
        this.color = color;
    }

   public String toString(){
    return String.format("%d %s", value, color);
   }

   public Color getColor(){
    return this.color;
   }


}
