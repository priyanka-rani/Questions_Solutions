
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
//number of wheels depends on plane model and size.
    @Override
    public int set_num_of_wheels() {
        return 14;
    }
//number of passengers depends on plane model and size.
    @Override
    public int set_num_of_passengers() {
        return 500;
    }

    @Override
    public boolean has_gas() {
        //as plane uses jet fuel which is liquid I guess so the answer is false
        return false;
    }
}
