package org.sample.isAhasA;

import java.time.LocalDateTime;

class Engine {
	  
    // Method 1
    // To start a engine
    public void start()
    {
        // Print statement when engine starts
        System.out.println("Started engine: " + LocalDateTime.now());
    }
  
    // Method 2
    // To stop a engine
    public void stop()
    {
        // Print statement when engine stops
        System.out.println("Stopped engine: " + LocalDateTime.now());
    }
}
