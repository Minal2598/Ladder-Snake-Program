public class LadderSnake{
	
	public static void main(String[] args){
		int Position=0;
		System.out.println("Welcome to Snake-Ladder Program Problem");
		System.out.println("You are at Starting Position::"+Position);
		Die();
	}
	public static void Die(){
		int DieCheck = (int) Math.floor(Math.random()*10)%6+1;
		System.out.println("Dice Value::"+ DieCheck);
		
		}
}