
interface Vehicle {
    int set_num_of_wheels() ;
    int set_num_of_passengers() ;
    boolean has_gas() ;
}
class Car implements Vehicle{

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
class Plane implements Vehicle{
// Number of wheels depends on Plane model and size
    @Override
    public int set_num_of_wheels() {
        return 14;
    }
// Number of passengers depends on Plane model and size
    @Override
    public int set_num_of_passengers() {
        return 500;
    }

    @Override
    public boolean has_gas() {
        return false;
    }
}
