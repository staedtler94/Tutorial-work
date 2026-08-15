package general;

public class LeapYearChecker {

    public boolean checkYear(int iYear){
        if(iYear % 100 == 0 && iYear %400 == 0){
            return true;
        }
        return iYear % 4 == 0;
    }
}
