
public class vehicle {
	

	

	
		protected int make;
		protected String module;
		protected String plate;
		protected String colour;
		
		// Constructors
		public vehicle()
		{
			setMake(2022);
			setModule("Generic");
			setPlate("D3f4u1T");
			setColour("Black");
			
		}
		
		public vehicle(int make, String module, String plate, String colour)
		{
			setMake(make);
			setModule(module);
			setPlate(plate);
			setColour(colour);
		}
		
		// Getters
		public int getMake()
		{
			return make;
		}
		
		public String getModule()
		{
			return module;
		}
		
		public String getPlate()
		{
			return plate;
		}
		
		public String getColour()
		{
			return colour;
		}
		
		
		// Setters
		public void setMake(int make)
		{
			if(make >1900 && make < 2023) 
			{
				this.make = make;
			}
		}
		
		public void setModule(String module)
		{
			this.module = module;
		}
		
		public void setPlate(String plate) 
		{
			if(plate.length() > 1 && plate.length() < 9)
			{
				this.plate = plate;
			}
		}  
		
		public void setColour(String colour)
		{
			
			
				this.colour = colour;
			
		}
		
		//member methods
		public String fillPadding(String src,int width)
		{
			while (src.length() < width)
			{
				src+=" ";
			}
			return src;
		}
		
		public void display(boolean display) {
			if(display == false)
			{
				
				System.out.println("Module: " + getModule() + ", Make: " + getMake() + ", LicensePlate: " + getPlate() + ", Colour:" + getColour());
				
			}else
			{			
					
					
					System.out.println(fillPadding(getModule(),8) + "|" 
					+ fillPadding(Integer.toString(getMake()),11) + "|" + fillPadding(getPlate(),8) + "|" 
					+ fillPadding(getColour(),22));
			}
		}
	}
}
