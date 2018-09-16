

public class Flight
        {    
                private int passengers, flightNumber, seats = 150, result = 1;
                private char flightClass;
                private boolean[] isSeatAvailable;
            
                public Flight()
                {
                    isSeatAvailable = new boolean[seats];

                    for(int i = 0; i < seats; i++)
                    {
                        result++;
                        isSeatAvailable[i] = true;
                        System.out.println(result);
                    }
                }

                public Flight(int flightNumber)
                {
                    this();
                    this.flightNumber = flightNumber;
                }

                public Flight(char flightClass)
                {
                    this();
                    this.flightClass = flightClass;
                }

        }