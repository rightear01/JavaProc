package Immutal.address;

public class MutableObj {
        private int value;

        MutableObj(int value) {
            this.value = value;
        }

        public void add(int addValue){
            value = value + addValue;
        }

        public int getValue(){
            return value;
        }

        public void setValue( int value){
            this.value = value;
        }
}
