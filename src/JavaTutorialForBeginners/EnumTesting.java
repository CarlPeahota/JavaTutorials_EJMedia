package JavaTutorialForBeginners;

class EnumTesting {
    public enum enumTest {
        DAYSWEEK(7),
        DAYSWEEKEND(2),
        WORKDAYS(5);
    
        private final int days;
    
        private enumTest(int days) {  //must be marked private because we do not want them to change
            this.days = days;
        }
        
        public int getValue() {
            return this.days;
        }

    }
    
    public static void main(String[] args) {
        enumTest value = enumTest.DAYSWEEK; //notice that "new" was not used since enums can not be instantiated
        System.out.println(value.getValue());
    }


}