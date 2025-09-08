package com.school;

// Interface for any object that can be stored (saved to file)
public interface Storable {
    // Each class that implements this must return its data as a CSV-style string
    String toDataString();
}
