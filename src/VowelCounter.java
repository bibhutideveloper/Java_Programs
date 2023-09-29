public class VowelCounter {
    private String inputString;

    public VowelCounter(String inputString) {
        this.inputString = inputString;
    }

    public int countVowels() {
        int vowelCount = 0;
        String lowercaseString = inputString.toLowerCase();
        
        for (int i = 0; i<lowercaseString.length(); i++) {
            char currentChar = lowercaseString.charAt(i);
            if (currentChar == 'a' || currentChar == 'e' || currentChar == 'i' || currentChar == 'o' || currentChar == 'u') {
                vowelCount++;
            }
        }
        
        return vowelCount;
    }

    public static void main(String[] args) {
        String input = "Beautiful";
        VowelCounter vowelCounter = new VowelCounter(input);
        int result = vowelCounter.countVowels();
        System.out.println("The number of vowels= " + result);
    }
}
