import java.util.ArrayList;

public class TestThing{
	public static void main(String[] args){

		//testPhase3();
		//testPhase4();

		// Test animation
		testPhase5_1();
		testPhase5_2();

		testPhase5b(); // test player
		
	}

	public static void testPhase3(){
		QuantityThing qt = new QuantityThing();
		System.out.println(qt.amount() + " in " + qt.toString());

		System.out.println(qt.toStringLong());

		if( !qt.addStuff(5)) // valid
			System.out.println("Error 1 adding to the QuantityThing ");

		if( !qt.addStuff(5)) // valid
			System.out.println("Error 2 adding to the QuantityThing ");

		if( qt.addStuff(1)) // invalid, base size is 10
			System.out.println("Error 3 Should reject adding one more to the QuantityThing ");

		System.out.println("Step 4: remainingCapacity " + qt.remainingCapacity() + " amount :" + qt.amount());

		if( !qt.removeStuff(10))
			System.out.println("Error 4 Should be able to remove from QuantityThing ");	
		
		System.out.println("Step 5: remainingCapacity " + qt.remainingCapacity() + " amount :" + qt.amount());

		if( qt.removeStuff(1))
			System.out.println("Error 5 Should not be able to remove from QuantityThing ");	
	}

	// Test Container
	// [ ] not very well tested
	public static void testPhase4(){

		System.out.println(" --- Phase 4 tests started --- ");
		ContainerThing things = new ContainerThing();

		// Test objects
		Thing flowerpot = new Thing("flowerpot","no description");
		Thing anotherFlowerpot = new Thing("flowerpot","no description"); // to match
		Thing other = new Thing();
		Thing other2 = new Thing("Stuff","junk");

		// add to list
		things.addThing(flowerpot);
		things.addThing(other);
		things.addThing(other2);
		// testing remove
		Thing returnedStuff = things.removeThing(anotherFlowerpot);
		if(returnedStuff == null){
			System.out.println("error, flowerpot not found");
		}else{
			System.out.println("Flowerpot found and removed successfully");
		}

		things.draw();

		System.out.println(" --- Phase 4 tests completed --- ");
	}


	public static void testPhase5_1(){
		// First Test
		AnimatedThing a = new AnimatedThing(new Vector2(.2,.2));
		a.setDestination(new Vector2(.8,.2));
		while(a.hasGoal()){
		//	StdDraw.clear(); // clear the old art
			a.update();
			a.draw();
			
			StdDraw.show(20); // draw and pause. 
		}

		// Second test
		AnimatedThing b = new AnimatedThing(new Vector2(.2,.2));
		b.setDestination(new Vector2(.2,.8));
		while(b.hasGoal()){
		//	StdDraw.clear(); // clear the old art
			b.update();
			b.draw();
			
			StdDraw.show(20); // draw and pause. 
		}
	}

	public static void testPhase5_2(){
		
		AnimatedThing a = new AnimatedThing();
		AnimatedThing b = new AnimatedThing();
		AnimatedThing c = new AnimatedThing();

		// Error setting this up, its returning Objects not Things
		// [X] ArrayList anims = new ArrayList<AnimatedThing>();
		ArrayList<AnimatedThing> anims = new ArrayList();

		anims.add(a);	anims.add(b);	anims.add(c);
		while( a.hasGoal() || b.hasGoal() || c.hasGoal() ){
			StdDraw.clear(); // clear the old art
			for(int i =0; i < anims.size(); i++){
				anims.get(i).update();
				anims.get(i).draw();
			}
			StdDraw.show(20); // draw and pause. 
		}
	}

	public static void testPhase5b(){
		PlayerThing player = new PlayerThing();

		for(int i = 0; i < 5000; i++){
			StdDraw.clear();
			player.update();
			player.draw();
			StdDraw.show(20); // draw and pause. 
		}
		System.out.println("THE END");
		System.exit(0);// Quit normally
	}
}