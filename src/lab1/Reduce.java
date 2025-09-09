package lab1;

class Reduce {
    
    public static void main(String[] args) {
        int start = 100, count = 0;
        while (start > 0) {
            if (start % 2 == 0)
                start /= 2;
            else
                start -= 1;

            count++;
        }

        System.out.println(count);
    }
}
