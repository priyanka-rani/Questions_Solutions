package com.securepenny.cashbaba;

import java.util.Arrays;

public class Answer_2a {
    /*I used abstract class Vehicle instead of interface. I know it is the same as using an interface
    but still it's a different design patterns  */
    abstract class Vehicle {
        abstract int set_num_of_wheels() ;
        abstract int set_num_of_passengers() ;
        abstract boolean has_gas() ;
    }
    class Car extends Vehicle{

        @Override
        public int set_num_of_wheels() {
            return 4;
        }

        @Override
        public int set_num_of_passengers() {
            return 4;
        }

        @Override
        public boolean has_gas() {
            return true;
        }
    }
    class Plane extends Vehicle{

        @Override
        public int set_num_of_wheels() {
            return 14;
        }

        @Override
        public int set_num_of_passengers() {
            return 500;
        }

        @Override
        public boolean has_gas() {
            return false;
        }
    }
}
