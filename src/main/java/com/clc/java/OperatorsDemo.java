		package com.clc.java;

		// 10 -- int  ..10.0 -- double
						//	1    2       4   8      4     8
//implicitRule    byte short int long float double
     			// 			   char
	
		//method overloading - only method sign
				//diff -- in terms of no param.seq.datatype
		
		//Var--args
		// Parent -- parent -- parent -- till object class
		//Autoboxed -- same  primitive to wrapper --  (widing + autoboxing at a time chalat nah)
		// Implicit casting rules  -- specified above
		// exact match - int double
		//no of params/datatype
		//filter out with method names
		
		
		//Method override --
				//atleast two classes with p-c relationship
				// method sign same -- methodname+ params
				// access modifier -- child cls access modifier param class chya method peksh -- same or wider --except private
		//Object		//return type -- 1.4 -- same -- 1.5 -- same or covarient -- child class can hv same or child wala access modifer specified in parent class return type
		//checked exception -- if parent class method throws any checked exception then 
				//child class method can throw same/child/none
		
			//void -- void
			// primit -- prim
		  //wrapper -- wrapper or child
		//object - object or child
		//inteface - interface or interface implect clss or inteface child
		//abstrct class - abcls or abstr child
		//array -- array
		
		
		
		
		// Identify method present into ref and coming from inheritance -- parent to childs -- 
		// whatever methods identified in rule one check thoese in runtime object -- found -- give a call --
		//not found -- child parent -- search kara -- jithe found hoel tyala call kara...  
		
		public class OperatorsDemo {
			
			
			public void m1(int i ){
				System.out.println("int");
			}
			
			public void m1(Object num){
				System.out.println("Integer");
			}
			
			public void m1(String num){
				System.out.println("Object");
			}
			
			public static void main(String[] args) {
				//<<  -- doubles the number by 1 bit shift -- shifting always fill sign bit
				//>> -- half the number by 1 bit shift -- -- shifting always fill sign bit
				//>>> -- right shift with filled zero -- always shifting will be filled by zero
				OperatorsDemo op = new OperatorsDemo();
				op.m1(null); //null
				
				Integer num = new Integer(null);
				//String s = new String(null);
				
				
				
				
				
				
				
			}
		
		}
		
		/**
		 * class/aclass -- object
		 * interface -- no object as parent class - but java ppl made one provision thru which interface will have
		 * few method access from obj class
		 * enum -- enum class parent - not allowed to extend any other enum class -- reason multiple inheritance
		 * 
		 * The GCF N2W3
		 * 
		 * tostring  -- object representation -- prints -- hashcode along with fully qualifies name of ur class
		 * hashcode  -- there is no implemention  -- native -- which takes help from OS -- to get mem addr of an objects
		 * equals -- content equality -- however your object does -- ref equality  this == ob
		 * getclass  -- will return name your class
		 * clone  -- cloning purpose -- shallow clone  ... in order to support deep clone -- you need write code explicitly
		 * finalize  --  prequisties to perform just before garbage collection  -- such as few object you just dont to give to garbage collection make there ref strong.....
		 * 
		 *---Threading Chapter--
		 * notify
		 * notifyall
		 * wait()
		 * wait(mil)
		 * wait(mil,nan)
		 * 
		 * how many ways you can create an objects in java
		 *
		 * 	A  a = new A()
		 * 
		 * Reflection -- JDBC
		 * 	class.forName("classname")  -- static block wil be executed ..but not costructor
		 *    class.forName("classname").newInstance(); -- st+inst+constru
		 * 
		 *    -- Deserialization -- Ser/Der
		 *    -- Clonning  -- Clonning
		 *    
		 *    
		 * https://stackoverflow.com/questions/95419/what-are-all-the-different-ways-to-create-an-object-in-java
		 *
		 * String class Methods -- Imp -- Programs...
		 * 		-- list out -- smjun -- *
		 * 
		 *
		 * brackets
unary		--RL
arithmatic
logical
ternary		--RL
assignment -- RL



right to left -- unary / assignment / ternary 

		 * 
		 */
		
		
		
		