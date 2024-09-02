package org.sample.isAhasA;

class Maserati extends Car
{
	  
    // Method in which it is shown
    // what happened with the engine of Pulsar
    public void MaseratiStartDemo()
    {
        // Creating an object of Engine type
        // using stop() method
        // Here, MaseratiEngine is name of an object
        Engine MaseratiEngine = new Engine();
        MaseratiEngine.start();
        MaseratiEngine.stop();
    }
}