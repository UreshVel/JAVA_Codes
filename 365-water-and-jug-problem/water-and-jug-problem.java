class Solution {
    public boolean canMeasureWater(int jug1Capacity, int jug2Capacity, int targetCapacity) {
       
        //The first case

        if( jug1Capacity + jug2Capacity < targetCapacity )
        {
            return false;
        }

        //The second case

        if( jug1Capacity == targetCapacity || jug2Capacity == targetCapacity || jug1Capacity + jug2Capacity == targetCapacity )
        {
            return true;
        }
        
        //The third case

        if( targetCapacity % gcd( jug1Capacity, jug2Capacity ) == 0 )
        {
            return true;
        }

        return false;

    }
    public int gcd( int a, int b ){
        
        if (b == 0) 
            return a;
        else 
            return gcd(b, a % b);
    }
}