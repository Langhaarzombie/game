/*
 The warrior object is used to fill the array in Barracks, a warrior contains of strength and health
*/

 /*
 The classes define the order in which the warriors are attacked, simple warriors are attacked before the warrior cl. 3 and die before them
class: 	0 ... simple warriors
		1 ... tanky ones with more life but less strength
		2 ... strong ones with low life but higher strength
		3 ... archers with low life but are attacked at last
 */

public class Warriors{
	private int strength;
	private int health;
	private byte classW;
	private int amount;

	public Warriors(int strength, int health){
		setStrength(strength);
		setHealth(health);
	}

	public int getStrength(){
		return this.strength;
	}

	public void setStrength(int s){
		this.strength=s;
	}

	public int getHealth(){
		return this.health;
	}

	public void setHealth(int h){
		this.health=h;
	}

	public byte getClassW(){
		return this.classW;
	}

	public void setClassW(byte c){
		this.classW=c;
	}

	public int getAmount(){
		return this.amount;
	}

	public void setAmount(int a){
		this.amount=a;
	}


}